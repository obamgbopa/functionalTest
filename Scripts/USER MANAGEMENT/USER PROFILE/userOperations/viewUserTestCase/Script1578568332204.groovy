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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/')

WebUI.setText(findTestObject('Object Repository/LOGIN_APPROVEOR/new/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 
    'KELLY')

WebUI.setEncryptedText(findTestObject('Object Repository/LOGIN_APPROVEOR/new/Page_sso/input_WELCOME BACK_ant-input ant-input-lg_1'), 
    'JorcBuA+R5El9EfIfru8gQ==')

WebUI.click(findTestObject('Object Repository/LOGIN_APPROVEOR/new/Page_sso/button_Login'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/LOGIN_APPROVEOR/new/Page_sso/button_CORE_app__button'))

