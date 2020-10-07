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

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('CRM_OR/Complaint/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('CRM_OR/Complaint/Page_icon-app/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/Complaint/Page_icon-app/a_Complaints'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('CRM_OR/Complaint/button_icon_dropdown'))

WebUI.click(findTestObject('CRM_OR/Complaint/a_Respond'))

WebUI.setText(findTestObject('CRM_OR/Complaint/Respond_Complaint/textarea_Response_ant-input'), 'we are working on resolving your complaints' + randomNum)

WebUI.click(findTestObject('CRM_OR/Complaint/Respond_Complaint/escalation_email'))

WebUI.click(findTestObject('CRM_OR/Complaint/Respond_Complaint/li_hbnghbngcom'))

WebUI.click(findTestObject('CRM_OR/Complaint/Respond_Complaint/button_Submit'))

WebUI.delay(2)
// Validations
WebUI.verifyTextPresent('Success', false)

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
	
	WebUI.closeBrowser()
	
} else {
	WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\complaintScreenshot' + randomNum) +
		'.png')

	WebUI.closeBrowser()
}

