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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/SSOContextSearch/Page_sso/button_Pending Verifications_ant-btn ant-bt_0e5877'))

WebUI.click(findTestObject('Object Repository/SSOContextSearch/Page_sso/button_Search User'))

WebUI.setText(findTestObject('SSOContextSearch/Page_sso/input_Username_ant-input'), 'ab')

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/input_Username_ant-input'))

WebUI.clearText(findTestObject('SSOContextSearch/Page_sso/input_Username_ant-input'))

WebUI.verifyTextNotPresent('ab', false)

WebUI.setText(findTestObject('SSOContextSearch/Page_sso/input_First Name_ant-input'), 'ab')

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/input_First Name_ant-input'))

WebUI.clearText(findTestObject('SSOContextSearch/Page_sso/input_First Name_ant-input'))

WebUI.setText(findTestObject('SSOContextSearch/Page_sso/input_Last Name_ant-input'), 'fad')

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/input_Last Name_ant-input'))

WebUI.clearText(findTestObject('SSOContextSearch/Page_sso/input_Last Name_ant-input'))

WebUI.setText(findTestObject('SSOContextSearch/Page_sso/input_Middle Name_ant-input'), 'fem')

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/input_Middle Name_ant-input'))

WebUI.clearText(findTestObject('SSOContextSearch/Page_sso/input_Middle Name_ant-input'))

WebUI.setText(findTestObject('SSOContextSearch/Page_sso/input_Employee Id_ant-input'), 'ab')

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/input_Employee Id_ant-input'))

WebUI.clearText(findTestObject('SSOContextSearch/Page_sso/input_Employee Id_ant-input'))

WebUI.setText(findTestObject('SSOContextSearch/Page_sso/input_Email Address_ant-input'), 'ABIOLAFAD@GMAIL.COM')

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/input_Email Address_ant-input'))

WebUI.clearText(findTestObject('SSOContextSearch/Page_sso/input_Email Address_ant-input'))

WebUI.setText(findTestObject('SSOContextSearch/Page_sso/input_Branch Code_ant-input'), '999')

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/input_Branch Code_ant-input'))

WebUI.clearText(findTestObject('SSOContextSearch/Page_sso/input_Branch Code_ant-input'))

WebUI.setText(findTestObject('SSOContextSearch/Page_sso/input_land Islands_telephone'), '0908 389 7443')

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/input_land Islands_telephone'))

WebUI.clearText(findTestObject('SSOContextSearch/Page_sso/input_land Islands_telephone'))

WebUI.click(findTestObject('SSOContextSearch/Page_sso/div_CORE'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/li_CORE'))

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/div_CORE'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/li_TRADE'))

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/div_CORE'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SSOContextSearch/Page_sso/li_TREASURY'))

WebUI.click(findTestObject('SSOContextSearch/Page_sso/button_Search User'))

WebUI.delay(2)

WebUI.closeBrowser()

