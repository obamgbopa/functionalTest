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
import org.openqa.selenium.Keys as Keys
import java.util.Random as Random

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('createSSOUser/Page_sso/button_Add User'))

WebUI.setText(findTestObject('createSSOUser/Page_sso/input_Employee ID_ant-input'), 'ABC' + String.valueOf(randomNum))

WebUI.setText(findTestObject('createSSOUser/Page_sso/input_Email_ant-input'), ('ABC' + String.valueOf(randomNum)) + '@YAHOO.COM')

WebUI.setText(findTestObject('createSSOUser/Page_sso/input_land Islands_telephone'), ('090' + String.valueOf(randomNum)) + 
    String.valueOf(randomNum))

WebUI.setText(findTestObject('createSSOUser/Page_sso/input_First Name_ant-input'), 'XYZ' + String.valueOf(randomNum))

WebUI.setText(findTestObject('createSSOUser/Page_sso/input_Middle Name_ant-input'), 'LMN' + String.valueOf(randomNum))

WebUI.setText(findTestObject('createSSOUser/Page_sso/input_Last Name_ant-input'), 'JKF' + String.valueOf(randomNum))

WebUI.setText(findTestObject('createSSOUser/Page_sso/input_Username_ant-input'), 'SIMBY' + String.valueOf(randomNum))

WebUI.click(findTestObject('createSSOUser/Page_sso/div_1'))

WebUI.click(findTestObject('createSSOUser/Page_sso/li_ADMIN'))

WebUI.click(findTestObject('createSSOUser/Page_sso/div_2'))

WebUI.click(findTestObject('createSSOUser/Page_sso/li_CORE'))

WebUI.click(findTestObject('createSSOUser/Page_sso/li_TRADE'))

WebUI.click(findTestObject('SSOContextSearch/Page_sso/li_TREASURY'))

WebUI.click(findTestObject('createSSOUser/Page_sso/button_Logout Time_ant-switch'))

WebUI.setText(findTestObject('createSSOUser/Page_sso/input_Logout Time_ant-input'), String.valueOf(randomNum))

WebUI.click(findTestObject('createSSOUser/Page_sso/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

