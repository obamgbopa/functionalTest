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

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/button_Create Account'))

WebUI.setText(findTestObject('OFFICE_OPS/create/Page_icon-app/input_Product Code_ant-input'), 'DON1234567')

WebUI.setText(findTestObject('OFFICE_OPS/create/Page_icon-app/input_Account Number_ant-input'), '1234567890')

WebUI.setText(findTestObject('OFFICE_OPS/create/Page_icon-app/input_Account Name_ant-input'), 'SHAWN MENDES')

WebUI.setText(findTestObject('OFFICE_OPS/create/Page_icon-app/input_Branch Code_ant-input'), '999')

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/div_curr'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/li_NGN - NGN'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/svg_spacer'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/button_Search_spacer'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/button_Select_spacer'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/svg_gl'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/button_Search_gl'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/button_Select_gl'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/div_mis'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/li_MIS_01 - MIS 01 for tracking'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/button_Transfer from Other Branches_ant-switch'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/button_System Only Transaction_ant-switch'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/div_Free Codes'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/input_OFFICE_ant-input'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/input_OFF PROD1_ant-input'))

WebUI.click(findTestObject('OFFICE_OPS/create/Page_icon-app/button_Create Office Account'))

WebUI.click(findTestObject('MAKERCHECKER/spy/Page_icon-app/button_Yes_Create'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

