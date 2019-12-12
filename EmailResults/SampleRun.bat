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
Set sNewTestSetName=FitNesse_Execution_On_%date:~0,3%_%date:~4,2%_%date:~7,2%_%date:~10,4%_%time:~0,2%_%time:~3,2%_%time:~6,2%


%sExeName% Process.vbs "CreateoNewTestSet" "Subject\HDE\Regression\Automation\MeasuresTesting" "Root\HDE\Regression\Automation\MeasuresTesting" "%sNewTestSetName%" "VAPI-XP-TEST"

::	Set of FitNesse suites that needs to be executed
::  VbsFileName ActionToPerform SuitePath FileName
Process.vbs "ExecuteFitNesseSuite" "http://localhost:8053/FitNesse.HedisFitnesseSuite.PocTestSuite" "%sNewTestSetName%"

::	Sends email
::  VbsFileName ActionToPerform From ToList Subject FileName
:: Process.vbs "SendEmail" "FitNesse@hde.com" "namrata.chakrabarty@optum.com;" "FitNesse - Suite Name: HDE - AntHill Run" "%sNewTestSetName%"

::	Connects to QC and executes the testset in QC
::	ExePath VbsFileName ActionToPerform TestSetPath TestSetName
%sExeName% Process.vbs "ExecuteTestCaseOnQc" "Root\HDE\Regression\Automation\MeasuresTesting" "%sNewTestSetName%"