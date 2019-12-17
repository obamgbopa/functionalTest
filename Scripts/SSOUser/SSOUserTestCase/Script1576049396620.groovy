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

for(def row=1; row <= findTestData('SSO_Data').getRowNumbers(); row++) {
	WebUI.openBrowser('')

	WebUI.navigateToUrl('http://192.168.5.46:8081/core')

	WebUI.setText(findTestObject('Object Repository/SSOUser/Page_Icon Login/input_WELCOME BACK_username'), 'fiyin')

	WebUI.setEncryptedText(findTestObject('Object Repository/SSOUser/Page_Icon Login/input_WELCOME BACK_password'), 'bCEiM449H1A=')

	WebUI.click(findTestObject('Object Repository/SSOUser/Page_Icon Login/button_Login'))

	WebUI.click(findTestObject('Object Repository/SSOUser/Page_icon-app/a_Users'))

	WebUI.click(findTestObject('Object Repository/SSOUser/Page_icon-app/button_Add User'))

	WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Employee ID_ant-input'), findTestData('SSO_Data').getValue(
        "EmployeeId", row))

	WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Email_ant-input'), findTestData('SSO_Data').getValue('Email', row))

	WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Phone Number_ant-input'), findTestData('SSO_Data').getValue(
        "PhoneNumber", row))

	WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_First Name_ant-input'), findTestData('SSO_Data').getValue(
        "Firstname", row))

	WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Middle Name_ant-input'), findTestData('SSO_Data').getValue(
        "Middlename", row))

	WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Last Name_ant-input'), findTestData('SSO_Data').getValue(
        "Lastname", row))

	WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Username_ant-input'), findTestData('SSO_Data').getValue(
        "Username", row))

	WebUI.click(findTestObject('SSOUser/SPYSSO/Page_icon-app/div_'))

	WebUI.delay(3)

	WebUI.click(findTestObject('Object Repository/SSOUser/Page_icon-app/li_USER'))

	WebUI.click(findTestObject('SSOUser/spyssouser/Page_icon-app/div_'))

	WebUI.delay(3)

	WebUI.click(findTestObject('SSOUser/spyssouser/Page_icon-app/li_CORE'))

	WebUI.click(findTestObject('Object Repository/SSOUser/Page_icon-app/button_Submit'))

	WebUI.closeBrowser()
}

