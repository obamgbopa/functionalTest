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
import org.openqa.selenium.Keys as Keys
import java.util.Random as Random
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('CRM_OR/Contact/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/a_Complaints'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/button_Add Complaint'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/Complaint/input_Customer ID_ant-input'))

WebUI.click(findTestObject('CRM_OR/Complaint/svg'))

WebUI.click(findTestObject('CRM_OR/Complaint/customer_type'))

WebUI.click(findTestObject('CRM_OR/Complaint/li_RETAIL'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/Complaint/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/Complaint/button_Select'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/Complaint/input_Date of Incidence_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/Complaint/date'))

WebUI.click(findTestObject('CRM_OR/Complaint/input_Incidence Branch_ant-input'))

WebUI.click(findTestObject('CRM_OR/Complaint/svg_branch'))

WebUI.click(findTestObject('CRM_OR/Complaint/button_Search_branch'))

WebUI.click(findTestObject('CRM_OR/Complaint/button_Select_branch'))

WebUI.delay(1)

WebUI.setText(findTestObject('CRM_OR/Complaint/textarea_Describe Incidence_ant-input'), 'ABNORMAL  CHARGES ON MY ACCOUNT')

WebUI.click(findTestObject('CRM_OR/Complaint/spy2/Page_icon-app/input_Assigned User_ant-input'))

WebUI.click(findTestObject('CRM_OR/Complaint/svg_assignedUser'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/Complaint/button_Search_assignedUser'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/Complaint/button_Select_assignedUser'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/Complaint/input_Supervisor_ant-input'))

WebUI.click(findTestObject('CRM_OR/Complaint/svg_supervisor'))

WebUI.click(findTestObject('CRM_OR/Complaint/button_Search_supervisor'))

WebUI.click(findTestObject('CRM_OR/Complaint/button_Select_sipervisor'))

not_run: WebUI.click(findTestObject('CRM_OR/Complaint/SLA'))

not_run: WebUI.click(findTestObject('CRM_OR/Complaint/li_1'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/button_Submit'))

WebUI.delay(3)

// validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\complaintScreenshot' + randomNum) + 
        '.png')

    WebUI.closeBrowser()
}

