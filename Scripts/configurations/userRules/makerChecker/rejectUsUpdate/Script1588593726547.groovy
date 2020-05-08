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

WebUI.callTestCase(findTestCase('LOGIN_MC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('configurations/MC/Page_sso/a_Configurations'))

WebUI.click(findTestObject('configurations/MC/Page_sso/div_Pending Verifications'))

WebUI.click(findTestObject('configurations/MC/Page_sso/button__ant-btn ant-btn-primary ant-btn-icon-only'))

WebUI.click(findTestObject('configurations/MC/Page_sso/div_UPDATE_PASSWORD_RULE'))

WebUI.click(findTestObject('configurations/MC/Page_sso/li_Update User Rule'))

WebUI.click(findTestObject('configurations/MC/Page_sso/button_Search Request'))

WebUI.click(findTestObject('configurations/MC/Page_sso/button_UsUPDATE_table__btn ant-btn ant-btn-primary ant-btn-sm ant-btn-icon-only'))

WebUI.click(findTestObject('configurations/MC/new/Page_sso/button_RejectUs'))

WebUI.setText(findTestObject('configurations/MC/new/Page_sso/textarea_Reason_ant-inputUs'), 'for test')

WebUI.click(findTestObject('configurations/MC/new/Page_sso/button_Reject_Us'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(0)

WebUI.closeBrowser()

