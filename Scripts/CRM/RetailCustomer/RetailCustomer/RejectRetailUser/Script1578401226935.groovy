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

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('Approval_Login/Approval_login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/a_Build No_aside__toggler'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Retail__'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/Retail/ApproveRetailUser/span_Pending Authorization__'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/Retail/ApproveRetailUser/search_button'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/Retail/ApproveRetailUser/edit_branch'))

WebUI.delay(3)

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/Retail/ApproveRetailUser/input_Initiating Branch'), '999')

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/Retail/ApproveRetailUser/li_999 - HBC HEAD OFFICE'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/Retail/ApproveRetailUser/button_Search Request'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/Retail/ApproveRetailUser/E_icon_button'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/Retail/RejectRetailUser/button_Reject1'))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/Retail/RejectRetailUser/textarea_Reason_ant-input'), 'FOR TESTING PURPOSE')

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/Retail/RejectRetailUser/button_Reject2'))

WebUI.delay(3)

// validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\rejectRetailCustScreenshot' + 
        randomNum) + '.png')

    WebUI.closeBrowser()
}

