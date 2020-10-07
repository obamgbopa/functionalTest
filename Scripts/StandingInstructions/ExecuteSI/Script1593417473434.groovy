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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SI/SI/a_Build No_aside__toggler'))

WebUI.click(findTestObject('SI/SI/span_Standing Instruction'))

WebUI.click(findTestObject('SI/ExecuteSI/button_Execute1'))

WebUI.click(findTestObject('SI/ExecuteSI/Execution_Time'))

WebUI.click(findTestObject('SI/ExecuteSI/li_ANYTIME'))

WebUI.click(findTestObject('SI/ExecuteSI/button_Execute2'))

WebUI.click(findTestObject('SI/ExecuteSI/button_Yes1'))

WebUI.delay(2)

WebUI.click(findTestObject('SI/ExecuteSI/CancelSuccessmsgsvg'))

WebUI.click(findTestObject('SI/ExecuteSI/button_Execute1'))

WebUI.click(findTestObject('SI/ExecuteSI/Execution_Time'))

WebUI.click(findTestObject('SI/ExecuteSI/li_EVERY_TIME'))

WebUI.click(findTestObject('SI/ExecuteSI/button_Execute2'))

WebUI.click(findTestObject('SI/ExecuteSI/button_Yes1'))

WebUI.delay(10)

WebUI.click(findTestObject('SI/ExecuteSI/button_Pending Authorizations_ant-btn ant-btn-primary'))

WebUI.setText(findTestObject('SI/ExecuteSI/input_Si Code_ant-input'), '123107D07B50')

WebUI.click(findTestObject('SI/ExecuteSI/button_Search Standing Instruction'))

WebUI.click(findTestObject('SI/ExecuteSI/button_ACTIVE_table__btn'))

WebUI.delay(2)

WebUI.click(findTestObject('SI/ExecuteSI/a_ Execute'))

WebUI.click(findTestObject('SI/ExecuteSI/button_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('SI/ExecuteSI/button_ACTIVE_table__btn'))

WebUI.click(findTestObject('SI/ExecuteSI/a_ View Execution History'))

WebUI.click(findTestObject('SI/ExecuteSI/a_3'))

// validations
not_run: WebUI.verifyTextPresent('Success', false)

not_run: if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\SiexecuteScreenshot' + '.png')

    WebUI.closeBrowser()
}

