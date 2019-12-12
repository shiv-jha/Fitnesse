@echo off
::	*********************************************************************************************************************************************
::	Purpose				: This bat file creates TestSet in QC, Pulls test cases, Executes FitNesse Suites, sends email and executes test cases back on QC
::	Author				: pxv
::	Created At			: 29th SEP 2014
::	Modification Info	: 
::	*********************************************************************************************************************************************

::Identifies OS type
if %PROCESSOR_ARCHITECTURE% EQU x86 (
	Set sExeName=wscript.exe
) else (
Set sExeName=C:\Windows\SysWOW64\wscript.exe
)

::	Builds a QC TestSet Name
Set sNewTestSetName=FitNesse_Regression_Execution_On_%date:~0,3%_%date:~4,2%_%date:~7,2%_%date:~10,4%_%time:~0,2%_%time:~3,2%_%time:~6,2%

::	Connects to QC, Creates new TestSet and Pulls all the tests with type
::  ExePath VbsFileName ActionToPerform TestPlanPath TestSetPath TestSetName TestCaseType
::%sExeName% Process.vbs "CreateoNewTestSet" "Subject\Direct Connect\Regression\Automation" "Root\Release\Direct Connect\DirectConnectAutomation\2014\Fitnesse_Batch Execution" "%sNewTestSetName%" "VAPI-XP-TEST"

::	Set of FitNesse suites that needs to be executed
::  VbsFileName ActionToPerform SuitePath FileName
::Process.vbs "ExecuteFitNesseSuite" "http://10.185.95.232:8888/DirectConnectAutomation.DirectConnectRelease1.ReGression" "%sNewTestSetName%"
Process.vbs "ExecuteFitNesseSuite" "http://localhost:8888/DirectConnectAutomation.DirectConnectRelease1.ReGression" "%sNewTestSetName%"
echo %sNewTestSetName%

::%sExeName% Process.vbs "SendEmail" "FitNesse@DirectConnect.com" "pv@Optum.com;Shaun.McKee@Optum.com" "FitNesse - Suite Name: Direct Connect Regression Testing - AntHill Run" "%sNewTestSetName%"
%sExeName% Process.vbs "SendEmail" "FitNesse@DirectConnect.com" "DCEIndiaQATeam_DL@ds.uhc.com;lorrie.heagle@optum.com;Chenchu.Amarthaluru@optum.com;" "FitNesse - Suite Name: Direct Connect Regression Testing - AntHill Run" "%sNewTestSetName%"
::%sExeName% Process.vbs "SendEmail" "FitNesse@aimhealth.com" "pv@optum.com;" "FitNesse - Suite Name: Direct Connect Regression Testing - AntHill Run" "%sNewTestSetName%"

::	Connects to QC and executes the testset in QC
::	ExePath VbsFileName ActionToPerform TestSetPath TestSetName 
::%sExeName% Process.vbs "ExecuteTestCaseOnQc" "Root\Release\Direct Connect\DirectConnectAutomation\2014\Fitnesse_Batch Execution" "%sNewTestSetName%"
