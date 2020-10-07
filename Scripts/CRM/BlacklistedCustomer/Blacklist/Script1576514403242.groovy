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

// for (def row = 1; row <= findTestData('CRM/BLACKLIST_DATA').getRowNumbers(); row++) {
WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/a_Branch_aside__toggler_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/a_Blacklist'))

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/button_Add Blacklisted Profile'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Full NameCompany Name_ant-input'), 
    'KING BREWERY INTERNATIONAL' + randomNum)

WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Phone Number_ant-input'), 
    '09054455')

WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Email_ant-input'), ('YOURMAIL' + 
    randomNum) + '@GMAIL.COM')

WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/gender'))

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/li_M - MALE'))

WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/input_Date of Birth  Date of Incorporation_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/BVN_input_field'))

WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Bank Verification Number_ant-input ant-input'), 
    '8960564423' + randomNum)

WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/id_Type'))

WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/li_I001 - DRIVERS LICENCE'))

WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Identification Number_ant-input ant-input'), 
    '432666743' + randomNum)

WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/input_Identification Issue Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/div_1'))

WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/blacklist_source'))

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/li_CENTRAL BANK'))

WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Address_ant-input'), 'ALAGBAKA AKURE')

WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/textarea_Remarks_ant-input'), 'LEADING BREWERY ALL OVER THE WORLD')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/button_Submit'))

WebUI.delay(2)

// validations
WebUI.verifyTextPresent('success', false)

if (WebUI.verifyTextPresent('success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\blacklistedScreenshot' + randomNum) + 
        '.png')

    WebUI.closeBrowser()
}

