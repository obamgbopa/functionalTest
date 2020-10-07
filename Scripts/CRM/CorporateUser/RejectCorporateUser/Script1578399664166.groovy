import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.util.Random as Random

// initilize random variables
int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('Approval_Login/Approval_login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/a_Build No_aside__toggler'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/a_Corporate'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/span_Pending Authorization'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/Search'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/svg'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/button_Search Request'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/button_insert_table__'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Reject_Corporate_Customer/button_Reject__'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Reject_Corporate_Customer/textarea_Reason_ant-input'), 'FOR TESTING PURPOSE')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Reject_Corporate_Customer/button_Reject2'))

WebUI.delay(3)

// validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\rejectCorpCustScreenshot' + 
        randomNum) + '.png')

    WebUI.closeBrowser()
}

