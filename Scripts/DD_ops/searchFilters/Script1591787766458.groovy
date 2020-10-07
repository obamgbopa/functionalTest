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

WebUI.setText(findTestObject('DD_multiples/Page_icon-app/input_Product Code_ant-input'), 'POST')

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Products_filter'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.clearText(findTestObject('DD_multiples/Page_icon-app/input_Product Code_ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('DD_multiples/Page_icon-app/input_Product Name_ant-input'), 'REAL')

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Products_filter'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.clearText(findTestObject('DD_multiples/Page_icon-app/input_Product Name_ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DD_multiples/Page_icon-app/div_acc_no'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DD_multiples/Page_icon-app/li_CAPRE - ACCOUNT_NO'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Products_filter'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.click(findTestObject('DD_multiples/new_in/Page_icon-app/svg_acc'))

WebUI.setText(findTestObject('DD_multiples/Page_icon-app/input_Branch Code_ant-input'), '999')

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Products_filter'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.clearText(findTestObject('DD_multiples/Page_icon-app/input_Branch Code_ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DD_multiples/Page_icon-app/div_currency'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/li_NGN'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Products_filter'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.click(findTestObject('DD_multiples/new_in/Page_icon-app/svg_curr'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/svg_spacer'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search_spacer'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Select_spacer'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Products_filter'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.clearText(findTestObject('DD_multiples/new_in/Page_icon-app/input_Spacer Code_ant-input'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/svg_gl'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search_gl'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Select_gl'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Products_filter'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.clearText(findTestObject('DD_multiples/new_in/Page_icon-app/input_GL Code_ant-input'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/div_prod_status'))

WebUI.click(findTestObject('DD_multiples/new_in/Page_icon-app/li_ACTIVE'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Products_filter'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.click(findTestObject('DD_multiples/Page_icon-app/div_prod_status'))

WebUI.click(findTestObject('DD_multiples/new_in/Page_icon-app/li_INACTIVE'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/button_Search Demand Draft Products_filter'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

