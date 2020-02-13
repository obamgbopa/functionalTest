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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://192.168.5.46:9090/sso')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso')

WebUI.setText(findTestObject('Object Repository/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 'josh')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_sso/input_WELCOME BACK_ant-input ant-input-lg_1'), '/q2iZ2sPEiM=')

WebUI.click(findTestObject('Object Repository/Page_sso/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_sso/button_CORE_app__button'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Page_icon-app/span_Cash Account Maintenance'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/a_Manage Till'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_ADD TILL'))

WebUI.setText(findTestObject('Object Repository/Page_icon-app/input_Till ID_ant-input'), 'TILL112')

WebUI.click(findTestObject('Page_icon-app/svg'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Page_sso/Page_icon-app/div_'))

WebUI.click(findTestObject('Page_icon-app/li_QC100 - ARAKUNRIN AKEREDOLU'))

WebUI.click(findTestObject('Page_sso/Page_icon-app/Page_icon-app/div_'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Page_sso/Page_icon-app/Page_icon-app/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('Page_icon-app/svg_1'))

WebUI.click(findTestObject('Page_sso/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Page_sso/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Page_sso/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/button_ADD TILL'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_No'))

WebUI.closeBrowser()

