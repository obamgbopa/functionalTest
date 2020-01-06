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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Replicate GL/Page_Icon Login/input_WELCOME BACK_username'), 'TOMMIE')

WebUI.setEncryptedText(findTestObject('Object Repository/Replicate GL/Page_Icon Login/input_WELCOME BACK_password'), 'RlZsoEm1HLfPO8dtOqKUMA==')

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/span_General Ledger'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/button_Add General Ledger_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/input_Add General Ledger_ant-input'))

WebUI.setText(findTestObject('Object Repository/Replicate GL/Page_icon-app/input_Add General Ledger_ant-input'), 'GLTEST2000')

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/button_Search Headers'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/span_Type_ant-table-row-expand-icon ant-tab_1f0002'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/button_Add General Ledger_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/div_Multiple Select'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/input_Operation_ant-checkbox-input'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_LAGOS_ant-checkbox-input_94'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_LAGOS_ant-checkbox-input_95'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_LAGOS_ant-checkbox-input_96'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/button_Confirm Selected Branch'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/div_Multiple Select 2'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/button_Search 2'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_ADP_ant-checkbox-input'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_AED_ant-checkbox-input'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_ECS_ant-checkbox-input'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_EUR_ant-checkbox-input'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_GBP_ant-checkbox-input'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_JPY_ant-checkbox-input'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/input_USD_ant-checkbox-input'))

WebUI.click(findTestObject('Replicate GL spy/Page_icon-app/button_Confirm Selected Currency'))

WebUI.click(findTestObject('Object Repository/Replicate GL/Page_icon-app/button_Replicate GL'))

WebUI.closeBrowser()

