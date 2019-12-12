@echo off
::	*********************************************************************************************************************************************
::	Purpose				: This bat file creates TestSet in QC, Pulls test cases, Executes FitNesse Suites, sends email and executes test cases back on QC
::	Author				: Vijaya Baskar Ramalingam
::	Created At			: 17th June 2013
::	Modification Info	: 
::	*********************************************************************************************************************************************

::Identifies OS type
if %PROCESSOR_ARCHITECTURE% EQU x86 (
	Set sExeName=wscript.exe
) else (
Set sExeName=C:\Windows\SysWOW64\wscript.exe
)

::	Builds a QC TestSet Name
Set sNewTestSetName=US15703_Database_Schema_Changes_Task_Changes

::	Connects to QC, Creates new TestSet and Pulls all the tests with type
::  ExePath VbsFileName ActionToPerform TestPlanPath TestSetPath TestSetName TestCaseType
%sExeName% Process.vbs "CreateoNewTestSet" "Subject\Direct Connect\Functional\DCE 1.0\Sprint 7\US15703 Database Schema Changes_Task Changes" "Root\Release\Direct Connect\DCE 1.0\Sprint 7" "%sNewTestSetName%" "VAPI-XP-TEST"

::	Set of FitNesse suites that needs to be executed
::  VbsFileName ActionToPerform SuitePath FileName
Process.vbs "ExecuteFitNesseSuite" "http://localhost:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint07.UserStory15703" "%sNewTestSetName%"

::	Sends email
::  VbsFileName ActionToPerform From ToList Subject FileName
Process.vbs "SendEmail" "FitNesse@aimhealth.com" "vy@aimhealth.com;" "FitNesse - Suite Name: %sNewTestSetName%" "%sNewTestSetName%"

::	Connects to QC and executes the testset in QC
::	ExePath VbsFileName ActionToPerform TestSetPath TestSetName
%sExeName% Process.vbs "ExecuteTestCaseOnQc" "Root\Release\Direct Connect\DCE 1.0\Sprint 7" "%sNewTestSetName%"