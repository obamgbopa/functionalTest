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

int num = GlobalVariable.num

Random rnd = new Random()

randomNum = rnd.nextInt(10 ** num)

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_icon-app/span_General Ledger'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Add General Ledger'))

WebUI.setText(findTestObject('Object Repository/Page_icon-app/input_Code_ant-input ant-input-lg'), 'GLTEST' + String.valueOf(randomNum))

WebUI.setText(findTestObject('Object Repository/Page_icon-app/input_Decription_ant-input ant-input-lg'), 'AUTOMATED GL')

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Create'))

WebUI.verifyTextPresent('GL creation was successful', false)

WebUI.delay(2)

WebUI.closeBrowser()

