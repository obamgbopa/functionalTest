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

WebUI.setText(findTestObject('Object Repository/CRM_OR/Campaign/Page_Icon Login/input_WELCOME BACK_username'), 'fiyin')

WebUI.setEncryptedText(findTestObject('Object Repository/CRM_OR/Campaign/Page_Icon Login/input_WELCOME BACK_password'), 
    'bCEiM449H1A=')

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/span_CRM'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/button_New Campaign'))

WebUI.setText(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/input_Product_ant-input'), 'NEW EXCLUSIVE PRODUCT')

WebUI.setText(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/input_Product Description_ant-input'), 'USE THIS PRODUCT FOR FESTIVE PROMO')

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/li_002 - FINANCIAL SECTOR'))

WebUI.click(findTestObject('CRM_OR/Campaign/Page_icon-app/Page_icon-app/div_1'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/li_BUSOW - BUSINESS OWNER'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/li_lbgtlgbtcom'))

WebUI.setText(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/textarea_Message_ant-input'), 'WELCOME TO FESTIVE PERIOD')

WebUI.click(findTestObject('Object Repository/CRM_OR/Campaign/Page_icon-app/button_Submit'))

WebUI.closeBrowser()

