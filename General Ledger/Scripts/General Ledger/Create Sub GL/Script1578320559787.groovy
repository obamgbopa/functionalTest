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

WebUI.setText(findTestObject('Object Repository/create sub gl/Page_Icon Login/input_WELCOME BACK_username'), 'TOMMIE')

WebUI.setEncryptedText(findTestObject('Object Repository/create sub gl/Page_Icon Login/input_WELCOME BACK_password'), 'RlZsoEm1HLfPO8dtOqKUMA==')

WebUI.sendKeys(findTestObject('Object Repository/create sub gl/Page_Icon Login/input_WELCOME BACK_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/span_General Ledger'))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/button_Add General Ledger_ant-btn ant-btn-primary'))

WebUI.setText(findTestObject('Object Repository/create sub gl/Page_icon-app/input_Add General Ledger_ant-input'), 'GLTEST2000')

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/button_Search Headers'))

WebUI.click(findTestObject('Manage GL spy/Page_icon-app/button_HEADER_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/a_Add Sub GL to                  AUTOMATED _00dd32'))

WebUI.setText(findTestObject('Object Repository/create sub gl/Page_icon-app/input_Code_ant-input'), 'GLTEST2001')

WebUI.setText(findTestObject('Object Repository/create sub gl/Page_icon-app/input_Description_ant-input'), 'AUTOMATED SUB GL')

WebUI.click(findTestObject('create sub gl spy/Page_icon-app/button_Node_ant-switch'))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/div_Currency Code'))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/div_Branch Code'))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/li_097 - OSHODIOLUPESI HOUSE'))

WebUI.click(findTestObject('Object Repository/create sub gl/Page_icon-app/button_Create'))

WebUI.delay(2)

WebUI.closeBrowser()

