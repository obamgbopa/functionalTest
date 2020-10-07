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

// for (def row = 1; row <= 3; row++) {
WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/RemoveBlacklist/Page_icon-app/a_Build No_aside__toggler'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/RemoveBlacklist/Page_icon-app/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/RemoveBlacklist/Page_icon-app/a_Blacklist'))

WebUI.delay(1)

WebUI.verifyElementClickable(findTestObject('CRM_OR/BlacklistedCustomer/RemoveBlacklist/Spy1/Page_icon-app/button_CENTRAL BANK_table__b'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('CRM_OR/BlacklistedCustomer/RemoveBlacklist/Spy1/Page_icon-app/button_CENTRAL BANK_table__b'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/RemoveBlacklist/Page_icon-app/a_Remove'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CRM_OR/BlacklistedCustomer/RemoveBlacklist/Page_icon-app/button_Yes'))

WebUI.delay(2)

// validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\blacklistedScreenshot' + randomNum) + 
        '.png')

    WebUI.closeBrowser()
}

