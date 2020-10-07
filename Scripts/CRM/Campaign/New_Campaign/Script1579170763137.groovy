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

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('CRM_OR/Campaign/New_Campaign/a_Build No_aside__toggler'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/Campaign/New_Campaign/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/Campaign/New_Campaign/a_Campaigns__'))

WebUI.click(findTestObject('CRM_OR/Campaign/New_Campaign/button_New Campaign'))

WebUI.delay(1)

WebUI.setText(findTestObject('CRM_OR/Campaign/New_Campaign/input_Product_ant-input'), 'NEW EXCLUSIVE PRODUCT' + randomNum)

WebUI.setText(findTestObject('CRM_OR/Campaign/New_Campaign/input_Product Description_ant-input'), 'USE THIS PRODUCT FOR FESTIVE PROMO' + 
    randomNum)

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/Campaign/New_Campaign/div_'))

WebUI.click(findTestObject('CRM_OR/Campaign/New_Campaign/li_002 - FINANCIAL SECTOR'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/Campaign/New_Campaign/Page_icon-app/div_1'))

WebUI.click(findTestObject('CRM_OR/Campaign/New_Campaign/li_BUSOW - BUSINESS OWNER'))

WebUI.setText(findTestObject('CRM_OR/Campaign/New_Campaign/input_Sender Email_ant-input'), 'yahoooutlookmail@gmail.com' + ramdomNum)

WebUI.setText(findTestObject('CRM_OR/Campaign/New_Campaign/textarea_Message_ant-input'), 'WELCOME TO FESTIVE PERIOD' + randomNum)

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/Campaign/New_Campaign/button_Submit'))

WebUI.delay(2)

// validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\campaignScreenshot' + randomNum) + 
        '.png')

    WebUI.closeBrowser()
}

