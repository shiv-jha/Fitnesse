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
Set sNewTestSetName=FitNesse_Execution_Smoke_On_%date:~0,3%_%date:~4,2%_%date:~7,2%_%date:~10,4%_%time:~0,2%_%time:~3,2%_%time:~6,2%

::	Connects to QC, Creates new TestSet and Pulls all the tests with type
::  ExePath VbsFileName ActionToPerform TestPlanPath TestSetPath TestSetName TestCaseType
%sExeName% Process.vbs "CreateoNewTestSet" "Subject\Direct Connect\Smoke\Automated" "Root\Release\Direct Connect\DirectConnectAutomation\AthillIntegration" "%sNewTestSetName%" "VAPI-XP-TEST"

::	Set of FitNesse suites that needs to be executed
::  VbsFileName ActionToPerform SuitePath FileName
Process.vbs "ExecuteFitNesseSuite" "http://10.185.95.232:8888/DirectConnectAutomation.DirectConnectRelease1.DcSmokeTesting" "%sNewTestSetName%"
::Process.vbs "ExecuteFitNesseSuite" "http://localhost:8888/DirectConnectAutomation.DirectConnectRelease1.DcSmokeTesting" "%sNewTestSetName%"
echo %sNewTestSetName%

::	Sends email
::  VbsFileName ActionToPerform From ToList Subject FileName
::Process.vbs "SendEmail" "FitNesse@aimhealth.com" "vy@aimhealth.com;caldendifer@aimhealth.com;amarthaluru@aimhealth.com;salagusundharam@aimhealth.com;pv@aimhealth.com;krajasekaran@aimhealth.com;jkatam@aimhealth.com;asengupta@aimhealth.com;mdoddi@aimhealth.com;lheagle@aimhealth.com;tripathi@aimhealth.com;" "FitNesse - Suite Name: Direct Connect Smoke Testing - AntHill Run" "%sNewTestSetName%"

::%sExeName% Process.vbs "SendEmail" "FitNesse@DirectConnect.com" "pv@Optum.com;Sathiyaseelan.Alagusundharam@optum.com;" "FitNesse - Suite Name: Direct Connect Smoke Testing - AntHill Run" "%sNewTestSetName%"
%sExeName% Process.vbs "SendEmail" "FitNesse@DirectConnect.com" "DCEIndiaQATeam_DL@ds.uhc.com;lorrie.heagle@optum.com;Chenchu.Amarthaluru@optum.com;SRCollapse-QA_DL@ds.uhc.com;" "FitNesse - Suite Name: Direct Connect Smoke Testing - AntHill Run" "%sNewTestSetName%"

::	Connects to QC and executes the testset in QC
::	ExePath VbsFileName ActionToPerform TestSetPath TestSetName 
%sExeName% Process.vbs "ExecuteTestCaseOnQc" "Root\Release\Direct Connect\DirectConnectAutomation\AthillIntegration" "%sNewTestSetName%"

sc \\ve7s00001562 stop Fitnesse
Ping 1.1.1.1 -n 10 
sc \\ve7s00001562 Start Fitnesse