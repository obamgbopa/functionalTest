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

WebUI.click(findTestObject('DD_multiples/Page_icon-app/span_Products'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/a_Demand Draft'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Pending Verification_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/div_enable'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/li_INACTIVE_enable'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Productss'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_ACTIVE_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/a_Enable'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_OKen'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

