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

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_Icon Login/input_WELCOME BACK_username'), 
    'fiyin')

WebUI.setEncryptedText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_Icon Login/input_WELCOME BACK_password'), 
    'bCEiM449H1A=')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('OfficeAccount/Page_icon-app/a_Branch_aside__toggler_1'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/span_CRM'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/a_Corporate'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_New Customer'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/input_Company Name_ant-input'), 
    'TYJGDKLBFD')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/input_Registration Number_ant-input'), 
    '3547')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Perform Dedup Check'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Proceed to Create Customer'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/div_Add Contact'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/svg_1'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Search'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Select'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/li_GUARANTOR'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/input_Phone No_ant-input'), '080 7890 6523')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/input_Email_ant-input'), 'GOOGLEMAIL@GMAIL.COM')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/input_Home Address_ant-input'), 
    'IJAPO ESTATE')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/input_Bank Verification Number_ant-input ant-input'), 
    '6790234521345')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/input_Bank Name_ant-input'), 'HERITAGE BANK')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/input_Account Number_ant-input ant-input'), 
    '890345836')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Add            Contact'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/svg_2'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Next'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/input_Preferential Rate_ant-input ant-input'), 
    '7.00%')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/div_20'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/li_DEBIT'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/li_SAVINGS'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Add            Preferential Rate'))

WebUI.closeBrowser()

