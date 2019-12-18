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

WebUI.click(findTestObject('Object Repository/Login and Logout/Page_Icon Login/input_WELCOME BACK_username'))

WebUI.setText(findTestObject('Object Repository/Login and Logout/Page_Icon Login/input_WELCOME BACK_username'), 'TOMMIE')

WebUI.setEncryptedText(findTestObject('Object Repository/Login and Logout/Page_Icon Login/input_WELCOME BACK_password'), 
    'RlZsoEm1HLfPO8dtOqKUMA==')

WebUI.click(findTestObject('Object Repository/Login and Logout/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Login and Logout/Page_icon-app/img'))

WebUI.click(findTestObject('Object Repository/Login and Logout/Page_icon-app/span_TOMMIE_ant-avatar ant-avatar-circle an_a6f184'))

WebUI.click(findTestObject('Object Repository/Login and Logout/Page_icon-app/li_Logout_1'))

WebUI.closeBrowser()

