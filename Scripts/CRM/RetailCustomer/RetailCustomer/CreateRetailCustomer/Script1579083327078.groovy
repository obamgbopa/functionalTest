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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

// import groovy.time.TimeCategory as TimeCategory
// initialize random variable
int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Build No_aside__toggler'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Retail__'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_New Customer'))

WebUI.delay(1)

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_First Name_ant-input'), 'JOLAOSHO' + String.valueOf(randomNum))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Middle Name_ant-input'), 'TIMOTHY' + String.valueOf(randomNum))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Last Name_ant-input'), 'TOSIN' + String.valueOf(randomNum))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/Customer_input_Phone Number_ant-input'), '080 616780' + randomNum)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/input_Date of Birth_ant-calendar-picker-input ant-input'))

WebUI.doubleClick(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/div_30'))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Identification Number_ant-input'), '89065' + randomNum)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Perform Dedup Check'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Proceed to Create Customer'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/title'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_MR - MR'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/marital_status'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_S - SINGLE'))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Preferred Name_ant-input'), 'TOSIN' + String.valueOf(randomNum))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/identification_type'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_DRIVERS LICENSE - Identification type'))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Bank Verification Number_ant-input ant-input'), '0839475435' + 
    randomNum)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/preferred_mode_ofcontact'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_PHONE'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/input_Date On Boarded_ant-'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/boarded_ date'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/input_Identification Issue Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/div_1'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/input_Identification Expiry Date_ant-calendar-picker-input ant-input'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/expiry_next_date'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/expiry_next_date'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/expiry_next_date'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/expiry_date__'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/nationality1'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_NIGERIA'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/gender'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_MALE'))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Number of Children_ant-input'), '3')

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Next1'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/sector_'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_1000 - AGRICULTURE'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/sub_sector_code'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_1102 - POULTRY'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/input_Introducer Code_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/CreateRetailCustomer/input_Introducer Code_ant-input'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.clearText(findTestObject('CRM_OR/CreateRetailCustomer/input_Employee Id_ant-input'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Search_introducer_code'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Select_introducer_code'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/segment'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_BUSOW - BUSINESS OWNER'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/SubSegment'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_123 - LARGE_BUSINESS'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/occupation'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_FARMER - null'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/employment_status'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_EMPLOYED'))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Employer_ant-input'), 'FGN')

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Asset Value_ant-input ant-input'), '9000' + randomNum)

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Total Income_ant-input ant-input'), '80000000' + randomNum)

WebUI.delay(1)

not_run: WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/input_Relationship Manager_ant-input'))

not_run: WebUI.sendKeys(findTestObject('CRM_OR/CreateRetailCustomer/input_Relationship Manager_ant-input'), Keys.chord(Keys.ENTER))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Search_rlationship_manager'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Select_relationship_manager'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/input_Branch_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/CreateRetailCustomer/input_Branch_ant-input'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Search_branch'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Select_branch'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Available for Trading_ant-switch'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/KYC_indicator'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_HIGH'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/KYC_status'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_COMPLETEee'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Next2'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/div_Add Address'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Add Address'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/Address_type'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_MAILING_ADDRESS'))

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/Add_address_input_Email Address_ant-input'), ('emailaddress' + 
    randomNum) + '@yahoo.com')

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/add_address_input_Phone Number_ant-input'), '0908793' + randomNum)

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Fax Number_ant-input'), '46547' + randomNum)

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Home Address_ant-input'), 'oba ile akure' + randomNum)

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Nearest Bus Stop_ant-input'), 'mobil round about' + randomNum)

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Zip Code_ant-input'), '234')

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/add_address_country'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/add_address_li_NIGERIA'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/add_address_state'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/add_address_state_li_ONDO'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/add_address_city'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_AKURE'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Add          Address'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Next3'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/input_Contact Look Up_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/CreateRetailCustomer/input_Contact Look Up_ant-input'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Search_contact'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Select_contact'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/contact_type'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_NEXT_OF_KIN'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/add_address_relationship_type'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/add_address_li_SISTER'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Add            Contact'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Next4'))

WebUI.delay(3)

WebUI.setText(findTestObject('CRM_OR/CreateRetailCustomer/input_Preferential Rate_ant-input ant-input'), '8' + randomNum)

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/input_Preferential Expiry Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/div_10 (1)'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/prefrential_rate_dr_indicator'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_CREDIT'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/product_type'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/li_SAVINGS'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Add            Preferential Rate'))

WebUI.click(findTestObject('CRM_OR/CreateRetailCustomer/button_Submit'))

WebUI.delay(5)

WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\createRetailCustScreenshot' + 
        randomNum) + '.png')

    WebUI.closeBrowser()
}

