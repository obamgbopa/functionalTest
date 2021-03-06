import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('configurations/Page_sso/a_Configurations'))

WebUI.click(findTestObject('configurations/Page_sso/div_'))

WebUI.click(findTestObject('configurations/Page_sso/li_PASSWORD_RULES'))

WebUI.setText(findTestObject('configurations/Page_sso/input_Min Password Length_ant-input'), '2')

WebUI.setText(findTestObject('configurations/Page_sso/input_Max Password Length_ant-input'), '10')

WebUI.setText(findTestObject('configurations/Page_sso/input_Max Inactive Periods (Days)_ant-input'), '15')

WebUI.setText(findTestObject('configurations/Page_sso/input_Max Password Age Days_ant-input'), '25')

WebUI.setText(findTestObject('configurations/Page_sso/input_Password Change Reminder Start In (Days)_ant-input'), '5')

WebUI.setText(findTestObject('configurations/Page_sso/input_Max Unsuccessful Login Attempts_ant-input'), '6')

WebUI.click(findTestObject('configurations/Page_sso/button_SubmitP'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(1)

WebUI.closeBrowser()

