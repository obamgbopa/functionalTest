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

WebUI.click(findTestObject('pagination/Page_sso/div_10  page'))

WebUI.click(findTestObject('pagination/Page_sso/li_20  page'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('pagination/Page_sso/div_10  page'))

WebUI.click(findTestObject('pagination/Page_sso/li_30  page'))

WebUI.verifyTextPresent('Success', false)

not_run: WebUI.scrollToElement(findTestObject('pagination/Page_sso/div_10  page'), 1)

not_run: WebUI.click(findTestObject('pagination/Page_sso/div_10  page'))

not_run: WebUI.click(findTestObject('pagination/Page_sso/li_40  page'))

not_run: WebUI.verifyTextPresent('Success', false)

not_run: WebUI.click(findTestObject('pagination/Page_sso/div_10  page'))

not_run: WebUI.click(findTestObject('pagination/Page_sso/li_50  page'))

not_run: WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('pagination/Page_sso/a_2'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('pagination/Page_sso/a_3'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('pagination/Page_sso/a_ACTIVE_ant-pagination-item-link1'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('pagination/Page_sso/a_ACTIVE_ant-pagination-item-link2'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

