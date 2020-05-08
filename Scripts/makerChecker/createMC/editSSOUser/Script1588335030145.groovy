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

WebUI.click(findTestObject('approveSSOUser/Page_sso/div_Pending Verifications'))

WebUI.click(findTestObject('approveSSOUser/Page_sso/button_Status_ant-btn ant-btn-primary ant-btn-icon-only'))

WebUI.click(findTestObject('approveSSOUser/Page_sso/button_Search Request'))

WebUI.click(findTestObject('approveSSOUser/Page_sso/button_INSERT_table__btn ant-btn ant-btn-primary ant-btn-sm ant-btn-icon-only'))

WebUI.click(findTestObject('approveSSOUser/extras/Page_sso/button_Edit'))

WebUI.click(findTestObject('approveSSOUser/editSSO/Page_sso/input_Employee ID_ant-input'))

WebUI.clearText(findTestObject('approveSSOUser/editSSO/Page_sso/input_Employee ID_ant-input'))

WebUI.setText(findTestObject('approveSSOUser/editSSO/Page_sso/input_Employee ID_ant-input'), 'ABC' + String.valueOf(randomNum))

WebUI.click(findTestObject('approveSSOUser/editSSO/Page_sso/input_Middle Name_ant-input'))

WebUI.clearText(findTestObject('approveSSOUser/editSSO/Page_sso/input_Middle Name_ant-input'))

WebUI.setText(findTestObject('approveSSOUser/editSSO/Page_sso/input_Middle Name_ant-input'), 'LMN' + String.valueOf(randomNum))

WebUI.click(findTestObject('approveSSOUser/editSSO/Page_sso/button_Logout Time_ant-switch ant-switch-checked'))

WebUI.click(findTestObject('approveSSOUser/editSSO/Page_sso/button_Update'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(1)

WebUI.closeBrowser()

