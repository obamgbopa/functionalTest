import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.setText(findTestObject('Object Repository/Cash Account Creation/Page_Icon Login/input_WELCOME BACK_username'), 'josh')

WebUI.setEncryptedText(findTestObject('Object Repository/Cash Account Creation/Page_Icon Login/input_WELCOME BACK_password'), 
    '3iF79iufxPg=')

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/span_Cash Account Maintenance'))

not_run: WebUI.delay(1.5)

WebUI.click(findTestObject('Cash Account Creation/Page_icon-app/Page_icon-app/button_ADD TILL'))

WebUI.setText(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/input_Till ID_ant-input'), 'NEWTILL111')

not_run: WebUI.click(findTestObject('Cash Account Creation/Page_icon-app/Page_icon-app/Page_icon-app/svg_brach lookup'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Search'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Select'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/div_'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/svg'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Select'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/div_'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/svg'))

not_run: WebUI.setText(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/input_Branch Code_ant-input'), 
    '999')

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Search'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Select'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/div_'))

not_run: WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/svg'))

WebUI.setText(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/input_Branch Code_ant-input'), '')

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Search'))

WebUI.setText(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/input_Branch Code_ant-input'), '200')

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/li_TILL002 - ABBY ABBY'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/li_USD - US DOLLAR'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/svg_1'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Cash Account Creation/Page_icon-app/button_Yes'))

WebUI.closeBrowser()

