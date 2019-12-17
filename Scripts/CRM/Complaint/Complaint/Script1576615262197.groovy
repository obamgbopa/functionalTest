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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:8081/core/')

WebUI.setText(findTestObject('Object Repository/CRM_OR/Complaint/Page_Icon Login/input_WELCOME BACK_username'), 'fiyin')

WebUI.setEncryptedText(findTestObject('Object Repository/CRM_OR/Complaint/Page_Icon Login/input_WELCOME BACK_password'), 
    'bCEiM449H1A=')

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/span_CRM'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/a_Complaints'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/button_Add Complaint'))

WebUI.click(findTestObject('CRM_OR/Complaint/spy1/Page_icon-app/input_Customer ID_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/Complaint/spy1/Page_icon-app/input_Customer ID_ant-input'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/button_Select'))

WebUI.click(findTestObject('CRM_OR/Complaint/spy1/Page_icon-app/input_Date of Incidence_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/div_17'))

WebUI.click(findTestObject('CRM_OR/Complaint/spy1/Page_icon-app/input_Incidence Branch_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/Complaint/spy1/Page_icon-app/input_Incidence Branch_ant-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/input_Describe Incidence_ant-input'), 'ABNORMAL  CHARGES ON MY ACCOUNT')

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/Complaint/spy1/Page_icon-app/button_Search1'))

WebUI.click(findTestObject('CRM_OR/Complaint/spy1/Page_icon-app/button_Select1'))

WebUI.click(findTestObject('CRM_OR/Complaint/spy2/Page_icon-app/input_Assigned User_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/Complaint/spy2/Page_icon-app/input_Assigned User_ant-input'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/Complaint/spy2/Page_icon-app/button_Search2'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/Complaint/spy2/Page_icon-app/button_Select2'))

WebUI.click(findTestObject('CRM_OR/Complaint/spy2/Page_icon-app/input_Supervisor_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/Complaint/spy2/Page_icon-app/input_Supervisor_ant-input'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/Complaint/spy1/Page_icon-app/button_Search3'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/Complaint/spy1/Page_icon-app/button_Select3'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Complaint/Page_icon-app/button_Submit'))

WebUI.closeBrowser()

