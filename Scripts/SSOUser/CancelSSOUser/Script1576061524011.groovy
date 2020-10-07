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

WebUI.callTestCase(findTestCase('SSOUser/Approve_SSO_Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('SSOUser/ApproveSSOUser/Page_icon-app/div_Pending Verifications'))

WebUI.click(findTestObject('SSOUser/ApproveSSOUser/Page_icon-app/button_Search_1'))

WebUI.delay(1)

WebUI.click(findTestObject('SSOUser/ApproveSSOUser/Page_icon-app/button_Search Request'))

WebUI.click(findTestObject('SSOUser/ApproveSSOUser/Page_icon-app/button_insert_table__btn ant-btn ant-btn-primary'))

WebUI.verifyElementClickable(findTestObject('SSOUser/Page_icon-app/button_Cancel'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('SSOUser/Page_icon-app/button_Cancel'))

WebUI.delay(2)

// validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\ssoapproveScreenshot' + '.png')

    WebUI.closeBrowser()
}

