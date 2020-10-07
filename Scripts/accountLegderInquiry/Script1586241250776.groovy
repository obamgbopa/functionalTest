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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/span_Account Ledger Inquiry'))

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/svg'))

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/input_From Date_ant-calendar-picker-input a_71d738'))

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/a__ant-calendar-prev-month-btn'))

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/div_30'))

WebUI.click(findTestObject('accountLegderInquiryOR/Page_icon-app/input_To Date_ant-calendar-picker-input ant-input1'))

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/a_Today'))

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/accountLegderInquiryOR/Page_icon-app/li_Value Date'))

WebUI.click(findTestObject('accountLegderInquiryOR/Page_icon-app/button_Search1'))

not_run: WebUI.verifyAlertPresent(0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('accountLegderInquiryOR/Page_icon-app/div_Value Date'))

WebUI.click(findTestObject('accountLegderInquiryOR/Page_icon-app/li_Tran Date'))

WebUI.click(findTestObject('accountLegderInquiryOR/Page_icon-app/button_Search1'))

not_run: WebUI.verifyTextPresent('success', false)

WebUI.delay(2)

WebUI.closeBrowser()

