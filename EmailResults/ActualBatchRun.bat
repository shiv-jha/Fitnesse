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

::	Connects to QC, Creates new TestSet and Pulls all the tests with type
::  ExePath VbsFileName ActionToPerform TestPlanPath TestSetPath TestSetName TestCaseType
%sExeName% Process.vbs "CreateoNewTestSet" "Subject\Direct Connect\Functional\DCE 1.0" "Root\Release\Direct Connect\DCE 1.0\Regression\Automated" "%sNewTestSetName%" "VAPI-XP-TEST"

::	Set of FitNesse suites that needs to be executed
::  VbsFileName ActionToPerform SuitePath FileName
sc \\aimbuild05 stop fitnesse
sc \\aimbuild05 start fitnesse
Process.vbs "ExecuteFitNesseSuite" "http://aimbuild05.aimhealth.com:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint02" "%sNewTestSetName%"
sc \\aimbuild05 stop fitnesse
sc \\aimbuild05 start fitnesse
Process.vbs "ExecuteFitNesseSuite" "http://aimbuild05.aimhealth.com:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint03" "%sNewTestSetName%"
sc \\aimbuild05 stop fitnesse
sc \\aimbuild05 start fitnesse
Process.vbs "ExecuteFitNesseSuite" "http://aimbuild05.aimhealth.com:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint04" "%sNewTestSetName%"
sc \\aimbuild05 stop fitnesse
sc \\aimbuild05 start fitnesse
Process.vbs "ExecuteFitNesseSuite" "http://aimbuild05.aimhealth.com:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint05" "%sNewTestSetName%"
sc \\aimbuild05 stop fitnesse
sc \\aimbuild05 start fitnesse
Process.vbs "ExecuteFitNesseSuite" "http://aimbuild05.aimhealth.com:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint06" "%sNewTestSetName%"
sc \\aimbuild05 stop fitnesse
sc \\aimbuild05 start fitnesse
Process.vbs "ExecuteFitNesseSuite" "http://aimbuild05.aimhealth.com:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint07" "%sNewTestSetName%"
sc \\aimbuild05 stop fitnesse
sc \\aimbuild05 start fitnesse
Process.vbs "ExecuteFitNesseSuite" "http://aimbuild05.aimhealth.com:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint08" "%sNewTestSetName%"
sc \\aimbuild05 stop fitnesse
sc \\aimbuild05 start fitnesse
::Process.vbs "ExecuteFitNesseSuite" "http://aimbuild05.aimhealth.com:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint09" "%sNewTestSetName%"
::sc \\aimbuild05 stop fitnesse
::sc \\aimbuild05 start fitnesse
::Process.vbs "ExecuteFitNesseSuite" "http://aimbuild05.aimhealth.com:8888/DirectConnectAutomation.DirectConnectRelease1.DcSprint10" "%sNewTestSetName%"
::sc \\aimbuild05 stop fitnesse
::sc \\aimbuild05 start fitnesse

::	Sends email
::  VbsFileName ActionToPerform From ToList Subject FileName
Process.vbs "SendEmail" "FitNesse@aimhealth.com" "caldendifer@aimhealth.com;amarthaluru@aimhealth.com;mcopp@aimhealth.com;salagusundharam@aimhealth.com;pv@aimhealth.com;krajasekaran@aimhealth.com;jkatam@aimhealth.com;asengupta@aimhealth.com;mdoddi@aimhealth.com;lheagle@aimhealth.com;rtripathi@aimhealth.com;" "FitNesse - Suite Name: Direct Connect 1.0 - Weekend Run" "%sNewTestSetName%"

::	Connects to QC and executes the testset in QC
::	ExePath VbsFileName ActionToPerform TestSetPath TestSetName
%sExeName% Process.vbs "ExecuteTestCaseOnQc" "Root\Release\Direct Connect\DCE 1.0\Regression\Automated" "%sNewTestSetName%"