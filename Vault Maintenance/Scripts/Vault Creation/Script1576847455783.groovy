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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://192.168.5.46:9090/sso')

not_run: WebUI.refresh()

WebUI.setText(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 
    'josh')

WebUI.setEncryptedText(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 
    '/q2iZ2sPEiM=')

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_sso/Page_sso/button_Login'))

not_run: WebUI.delay(4)

WebUI.click(findTestObject('Page_sso/button_CORE_app__button'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_sso/Page_sso/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_sso/Page_sso/Page_icon-app/span_Vault Maintenance'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_sso/Page_sso/Page_icon-app/button_Define Vault'))

WebUI.setText(findTestObject('Object Repository/Page_icon-app/input_Vault Id_ant-input'), 'VAULT1212')

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Select'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/li_BOTH'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Select branch code'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/li_094 - NAVY TOWNMAMMY MKT'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Select_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_sso/Page_sso/Page_sso/Page_icon-app/Page_icon-app/Page_icon-app/li_QC100 - ARAKUNRIN AKEREDOLU'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Icon Login/Page_icon-app/div_'))

not_run: WebUI.delay(2.2)

WebUI.click(findTestObject('Page_Icon Login/Page_icon-app/li_QA004 - FIYIN TITUS'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/input_Definition Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/a_Today'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/div_Select'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/li_BOTH'))

WebUI.click(findTestObject('Page_Icon Login/Page_icon-app/div_Select'))

not_run: WebUI.delay(0.2)

WebUI.click(findTestObject('Page_Icon Login/Page_icon-app/li_OPENED'))

WebUI.verifyElementPresent(findTestObject('Page_Icon Login/Page_icon-app/input_Spacer_ant-input'), 0)

WebUI.click(findTestObject('Page_Icon Login/Page_icon-app/Page_icon-app/svg'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_icon-app/div_Select'))

WebUI.delay(1.6)

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_sso/Page_icon-app/button_Add Currency Limit'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Create Vault'))

WebUI.closeBrowser()

