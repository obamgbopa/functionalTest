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

WebUI.callTestCase(findTestCase('Approval_Login/Approval_login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SI/SI/a_Build No_aside__toggler'))

WebUI.click(findTestObject('SI/SI/span_Standing Instruction'))

WebUI.click(findTestObject('SI/ApproveEditedSI/div_Pending Authorizations'))

WebUI.click(findTestObject('SI/ApproveEditedSI/button_No data_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('SI/ApproveEditedSI/div_CREATE_STANDING_INSTRUCTION'))

WebUI.click(findTestObject('SI/ApproveEditedSI/li_Edit Standing Instruction'))

WebUI.click(findTestObject('SI/ApproveEditedSI/button_Search Request'))

WebUI.click(findTestObject('SI/ApproveEditedSI/button_UPDATE_table__btn ant-btn ant-btn-primary'))

WebUI.click(findTestObject('SI/ApproveEditedSI/button_Approve'))

// validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\ApproveEditSIScreenshot' + '.png')

    WebUI.closeBrowser()
}

