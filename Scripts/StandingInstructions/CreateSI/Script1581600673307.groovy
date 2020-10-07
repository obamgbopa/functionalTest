import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SI/SI/a_Build No_aside__toggler'))

WebUI.click(findTestObject('SI/SI/span_Standing Instruction'))

WebUI.click(findTestObject('SI/SI/button_Define Standing Instruction'))

WebUI.delay(1)

WebUI.click(findTestObject('SI/SI/input_Account Number_ant-input'))

WebUI.click(findTestObject('SI/SI/svg'))

WebUI.click(findTestObject('SI/SI/productType'))

WebUI.click(findTestObject('SI/SI/li_SAVINGS'))

WebUI.click(findTestObject('SI/SI/button_Search_acct'))

WebUI.click(findTestObject('SI/SI/button_Select_Acct'))

WebUI.click(findTestObject('SI/SI/frequency'))

WebUI.click(findTestObject('SI/SI/li_D - Daily'))

WebUI.click(findTestObject('SI/SI/holiday_flag'))

WebUI.click(findTestObject('SI/SI/li_N - Next'))

WebUI.click(findTestObject('SI/SI/execution_time'))

WebUI.click(findTestObject('SI/SI/li_Every time'))

WebUI.click(findTestObject('SI/SI/input_Start Date_ant-calendar'))

WebUI.click(findTestObject('SI/SI/div_18'))

WebUI.click(findTestObject('SI/SI/enddateCalendersvg'))

WebUI.click(findTestObject('SI/SI/a_May_ant-calendar-next-year-btn'))

WebUI.click(findTestObject('SI/SI/june_5'))

WebUI.click(findTestObject('SI/SI/button_Delete transaction if not posted_ant-switch'))

WebUI.click(findTestObject('SI/SI/SI_type'))

WebUI.click(findTestObject('SI/SI/li_Bank Induced'))

WebUI.click(findTestObject('SI/SI/acct_balance_indicator'))

WebUI.click(findTestObject('SI/SI/li_Available'))

WebUI.click(findTestObject('SI/SI/executeOn'))

WebUI.click(findTestObject('SI/SI/li_In excess of'))

WebUI.setText(findTestObject('SI/SI/input_Variable Amount_ant-input'), '2000')

WebUI.setText(findTestObject('SI/SI/textarea_Remarks_ant-input'), 'defining si with automated test')

WebUI.click(findTestObject('SI/SI/button_Collect fees_ant-switch'))

WebUI.click(findTestObject('SI/SI/button_Next'))

WebUI.click(findTestObject('SI/SI/button_Add Transaction Details'))

WebUI.callTestCase(findTestCase('StandingInstructions/SITransLeg1'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SI/ChargeDetails/button_Next_charge'))

WebUI.callTestCase(findTestCase('StandingInstructions/ChargeDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)

