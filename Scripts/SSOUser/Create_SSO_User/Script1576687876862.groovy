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

WebUI.callTestCase(findTestCase('SSOUser/SSO_Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/SSOUser/Page_icon-app/button_Add User'))

WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Employee ID_ant-input'), 'QA' + randomNum)

WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Email_ant-input'), ('MYYAHOOMAIL' + randomNum) + 
    '@GMAIL.COM')

WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Phone Number_ant-input'), '09089734' + randomNum)

WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_First Name_ant-input'), 'OGBENI' + randomNum)

WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Middle Name_ant-input'), 'SALAMI' + randomNum)

WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Last Name_ant-input'), 'DAMILARE' + randomNum)

WebUI.setText(findTestObject('Object Repository/SSOUser/Page_icon-app/input_Username_ant-input'), 'QASALAMI' + randomNum)

WebUI.delay(1)

WebUI.click(findTestObject('SSOUser/SPYSSO/Page_icon-app/div_User_type'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SSOUser/Page_icon-app/li_USER'))

WebUI.click(findTestObject('SSOUser/spyssouser/Page_icon-app/div_'))

WebUI.delay(3)

WebUI.click(findTestObject('SSOUser/spyssouser/Page_icon-app/li_CORE'))

WebUI.click(findTestObject('SSOUser/ApproveSSOUser/Page_icon-app/li_TRADE'))

WebUI.click(findTestObject('SSOUser/ApproveSSOUser/Page_icon-app/li_TREASURY'))

WebUI.click(findTestObject('Object Repository/SSOUser/Page_icon-app/button_Submit'))

WebUI.delay(3)

// validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\ssoScreenshot' + randomNum) + 
        '.png')

    WebUI.closeBrowser()
}

