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

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/')

WebUI.setText(findTestObject('Object Repository/New Bank_setup_default/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 
    'TOMMIE')

WebUI.setEncryptedText(findTestObject('Object Repository/New Bank_setup_default/Page_sso/input_WELCOME BACK_ant-input ant-input-lg_1'), 
    'RlZsoEm1HLfPO8dtOqKUMA==')

WebUI.click(findTestObject('Object Repository/New Bank_setup_default/Page_sso/button_Login'))

WebUI.click(findTestObject('Object Repository/New Bank_setup_default/Page_sso/a_CORE'))

WebUI.click(findTestObject('Object Repository/New Bank_setup_default/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/New Bank_setup_default/Page_icon-app/span_Bank Setup'))

