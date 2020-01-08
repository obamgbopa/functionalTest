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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Manage GL/Page_icon-app/span_General Ledger'))

WebUI.click(findTestObject('Object Repository/Manage GL/Page_icon-app/button_Add General Ledger_ant-btn ant-btn-primary'))

WebUI.setText(findTestObject('Object Repository/Manage GL/Page_icon-app/input_Add General Ledger_ant-input'), 'GLTEST2000')

WebUI.click(findTestObject('Object Repository/Manage GL/Page_icon-app/button_Search Headers'))

WebUI.click(findTestObject('Manage GL spy/Page_icon-app/button_HEADER_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('Manage GL spy/Page_icon-app/a_Manage AUTOMATED TESTING ON GL EDITED'))

WebUI.click(findTestObject('Manage GL spy/Page_icon-app/button_AUTOMATED TESTING ON GL EDITED_ant-btn ant-btn-primary ant-btn-circle'))

WebUI.setText(findTestObject('Object Repository/Manage GL/Page_icon-app/input_Decription_ant-input ant-input-lg'), ' EDITED')

WebUI.click(findTestObject('Object Repository/Manage GL/Page_icon-app/button_Update'))

WebUI.delay(60)

WebUI.verifyTextPresent('GL update was successful', false)

WebUI.delay(2)

WebUI.closeBrowser()

