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

// initilize random variables
int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CRM_OR/Contact/a_Build No_aside__toggler'))

WebUI.click(findTestObject('CRM_OR/Contact/span_CRM'))

WebUI.click(findTestObject('CRM_OR/Contact/a_Contacts'))

WebUI.click(findTestObject('CRM_OR/Contact/button_New Contact'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/Contact/Title'))

WebUI.click(findTestObject('CRM_OR/Contact/li_MR - MR'))

WebUI.setText(findTestObject('CRM_OR/Contact/input_First Name_ant-input'), 'Joe' + randomNum)

WebUI.setText(findTestObject('CRM_OR/Contact/input_Middle Name_ant-input'), 'Mayowa' + randomNum)

WebUI.setText(findTestObject('CRM_OR/Contact/input_Last Name_ant-input'), 'Makinde' + randomNum)

WebUI.click(findTestObject('CRM_OR/Contact/Gender'))

WebUI.click(findTestObject('CRM_OR/Contact/li_MALE'))

WebUI.click(findTestObject('CRM_OR/Contact/input_Date of Birth_ant-calendar'))

WebUI.click(findTestObject('CRM_OR/Contact/a_2020'))

WebUI.click(findTestObject('CRM_OR/Contact/a_Apr_ant-calendar-year-panel-prev-decade-btn'))

WebUI.click(findTestObject('CRM_OR/Contact/a_1989'))

WebUI.click(findTestObject('CRM_OR/Contact/a_1980'))

WebUI.click(findTestObject('CRM_OR/Contact/div_16'))

WebUI.setText(findTestObject('CRM_OR/Contact/input_land Islands_telephone'), '09089567645')

WebUI.setText(findTestObject('CRM_OR/Contact/input_Email_ant-input'), 'mayowa.joe@yahoo.com')

WebUI.click(findTestObject('CRM_OR/Contact/Marital_status'))

WebUI.click(findTestObject('CRM_OR/Contact/li_SINGLE - S'))

WebUI.setText(findTestObject('CRM_OR/Contact/input_Contact Address_ant-input'), 'Ijapo estate Akure')

WebUI.click(findTestObject('CRM_OR/Contact/Nationality'))

WebUI.click(findTestObject('CRM_OR/Contact/li_NG - NIGERIA'))

WebUI.click(findTestObject('CRM_OR/Contact/input_Date On Boarded_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/Contact/April16'))

WebUI.click(findTestObject('CRM_OR/Contact/EmploymentStatus'))

WebUI.click(findTestObject('CRM_OR/Contact/li_EMPLOYED'))

WebUI.setText(findTestObject('CRM_OR/Contact/input_Income_ant-input ant-input'), '100000000')

WebUI.click(findTestObject('CRM_OR/Contact/BankName'))

WebUI.click(findTestObject('CRM_OR/Contact/li_011 - FIRST BANK OF NIGERIA'))

WebUI.setText(findTestObject('CRM_OR/Contact/input_Account Number_ant-input'), '09238746743' + randomNum)

WebUI.setText(findTestObject('CRM_OR/Contact/input_Bank Verification Number_ant-input'), '0954785465' + randomNum)

WebUI.click(findTestObject('CRM_OR/Contact/IdenType'))

WebUI.click(findTestObject('CRM_OR/Contact/li_I001 - DRIVERS LICENCE'))

WebUI.setText(findTestObject('CRM_OR/Contact/input_I001 - ID Number_ant-input'), '09785467344' + randomNum)

WebUI.click(findTestObject('CRM_OR/Contact/input_Identification Issue Date_ant-'))

WebUI.click(findTestObject('CRM_OR/Contact/April29'))

WebUI.click(findTestObject('CRM_OR/Contact/input_Identity Expiry Date'))

WebUI.click(findTestObject('CRM_OR/Contact/a_Apr_ant-calendar-next-year-btn'))

WebUI.click(findTestObject('CRM_OR/Contact/Aprildiv_16'))

WebUI.click(findTestObject('CRM_OR/Contact/Occupation'))

WebUI.click(findTestObject('CRM_OR/Contact/li_ENGINEER - null'))

WebUI.setText(findTestObject('CRM_OR/Contact/input_Employer Name_ant-input'), 'dangote group of company')

WebUI.setText(findTestObject('CRM_OR/Contact/input_Tax Id Number_ant-input'), '7854785483498' + randomNum)

WebUI.click(findTestObject('CRM_OR/Contact/segment'))

WebUI.click(findTestObject('CRM_OR/Contact/li_CLB - CLUBS  ASSOCIATIONS'))

WebUI.click(findTestObject('CRM_OR/Contact/SubSegment'))

WebUI.click(findTestObject('CRM_OR/Contact/li_AUTPR - AUTOMOTIVE PARTS'))

WebUI.click(findTestObject('CRM_OR/Contact/KYCStatus'))

WebUI.click(findTestObject('CRM_OR/Contact/li_COMPLETE'))

WebUI.click(findTestObject('CRM_OR/Contact/input_Relationship Manager_ant-input'))

WebUI.click(findTestObject('CRM_OR/Contact/RMsvg'))

WebUI.click(findTestObject('CRM_OR/Contact/button_Search_RM'))

WebUI.click(findTestObject('CRM_OR/Contact/button_Select_RM'))

WebUI.click(findTestObject('CRM_OR/Contact/input_Branch_ant-input'))

WebUI.click(findTestObject('CRM_OR/Contact/BranchSvg'))

WebUI.click(findTestObject('CRM_OR/Contact/button_Search_Branch'))

WebUI.click(findTestObject('CRM_OR/Contact/button_Select_Branch'))

WebUI.click(findTestObject('CRM_OR/Contact/button_Create Contact'))

WebUI.delay(5)

// validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\CreateCortpCustScreenshot' + 
        randomNum) + '.png')

    WebUI.closeBrowser()
}

