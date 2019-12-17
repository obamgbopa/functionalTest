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

for(def row=1; row <= findTestData('CRM/BLACKLIST_DATA').getRowNumbers(); row++) {
	WebUI.openBrowser('')

	WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

	WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_Icon Login/input_WELCOME BACK_username'), 
    'fiyin')

	WebUI.setEncryptedText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_Icon Login/input_WELCOME BACK_password'), 
    'bCEiM449H1A=')

	WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_Icon Login/button_Login'))

	WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/div_Applications_item__icon'))

	WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/a_Branch_aside__toggler_1'))

	WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/span_CRM'))

	WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/a_Blacklist'))

	WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/button_Add Blacklisted Profile'))

	WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Full NameCompany Name_ant-input'), 
    findTestData('CRM/BLACKLIST_DATA').getValue('NAME', row))

	WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Phone Number_ant-input'), 
    findTestData('CRM/BLACKLIST_DATA').getValue('PHONE_NUMB', row))

	WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Email_ant-input'), findTestData('CRM/BLACKLIST_DATA').getValue('EMAIL', row))

	WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/div_'))

	WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/li_M - MALE'))

	WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/Page_icon-app/input_Date of Birth  Date of Incorporation_ant-calendar-picker-input ant-input'))

	WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Page_icon-app/Page_icon-app/div_1'))

	WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Bank Verification Number_ant-input ant-input'), 
    findTestData('CRM/BLACKLIST_DATA').getValue('BVN', row))

	WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Spy/Spy1/Page_icon-app/div_'))

	WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Spy/Spy1/Page_icon-app/li_I001 - DRIVERS LICENCE'))

	WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Identification Number_ant-input ant-input'), 
    findTestData('CRM/BLACKLIST_DATA').getValue('ID_NUMB', row))

	WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Spy/Spy2/Page_icon-app/input_Identification Issue Date_ant-calendar-picker-input ant-input'))

	WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Spy/Spy2/Page_icon-app/div_1'))

	WebUI.click(findTestObject('CRM_OR/BlacklistedCustomer/Spy/Spy2/Page_icon-app/div_'))

	WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/li_CENTRAL BANK'))

	WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/input_Address_ant-input'), findTestData('CRM/BLACKLIST_DATA').getValue('ADDRESS', row))

	WebUI.setText(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/textarea_Remarks_ant-input'), findTestData('CRM/BLACKLIST_DATA').getValue('REMARKS', row))

	WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/Page_icon-app/button_Submit'))

	WebUI.closeBrowser()
}
