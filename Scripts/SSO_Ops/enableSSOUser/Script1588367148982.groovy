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

WebUI.click(findTestObject('viewSSOUser/Page_sso/button_Pending Verifications_ant-btn ant-btn-primary ant-btn-icon-only'))

WebUI.click(findTestObject('viewSSOUser/Page_sso/button_Search User'))

WebUI.setText(findTestObject('Object Repository/SSOContextSearch/Page_sso/input_Username_ant-input'), 'simby9932')

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.click(findTestObject('viewSSOUser/Page_sso/button_ACTIVE_table__btn ant-btn ant-btn-primary ant-btn-round ant-btn-sm ant-btn-icon-only ant-dropdown-trigger'))

WebUI.click(findTestObject('disableSSOUser/Page_sso/a_Enable'))

WebUI.click(findTestObject('deleteSSOUser/Page_sso/button_OK_d'))

WebUI.delay(2)

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

