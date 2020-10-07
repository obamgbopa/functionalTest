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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/Page_icon-app/a_Build No_aside__toggler'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/Page_icon-app/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/Page_icon-app/a_Negative Customers'))

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/Page_icon-app/button_Negate Customer'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/NegativeCustomer/Page_icon-app/Page_icon-app/input_Customer ID_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/NegativeCustomer/Page_icon-app/Page_icon-app/input_Customer ID_ant-input'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/Page_icon-app/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/Page_icon-app/button_Select'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/NegativeCustomer/Page_icon-app/Page_icon-app/input_Negation Expiry Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/NegativeCustomer/Page_icon-app/Page_icon-app/div_20'))

WebUI.setText(findTestObject('CRM_OR/NegativeCustomer/Page_icon-app/textarea_Negation Remarks_ant-input'), 'WE ARE ADDING TO YOU TO NEGATIVE LIST')

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/Page_icon-app/button_Submit'))

WebUI.delay(3)

// validations
WebUI.verifyTextPresent('Negative Customer Added successfully', false)

if (WebUI.verifyTextPresent('Negative Customer Added successfully', false, FailureHandling.OPTIONAL)) {
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\negativeCust' + '.png')

    WebUI.closeBrowser()
}

