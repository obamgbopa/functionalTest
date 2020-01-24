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

WebUI.setText(findTestObject('Object Repository/CRM_OR/Transfer/Page_Icon Login/input_WELCOME BACK_username'), 'fiyin')

WebUI.setEncryptedText(findTestObject('Object Repository/CRM_OR/Transfer/Page_Icon Login/input_WELCOME BACK_password'), 
    'bCEiM449H1A=')

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_icon-app/span_CRM'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_icon-app/a_Transfers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_icon-app/button_Initiate Transfer'))

WebUI.click(findTestObject('CRM_OR/Transfer/Page_icon-app/input_From Relationship Manager_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/Transfer/Page_icon-app/input_From Relationship Manager_ant-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_icon-app/button_Select'))

WebUI.click(findTestObject('CRM_OR/Transfer/Page_icon-app/input_To Relationship Manager_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/Transfer/Page_icon-app/input_To Relationship Manager_ant-input'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/Transfer/Page_icon-app/Page_icon-app/Page_icon-app/button_Search2'))

WebUI.click(findTestObject('CRM_OR/Transfer/Page_icon-app/Page_icon-app/button_Select2'))

WebUI.click(findTestObject('CRM_OR/Transfer/Page_icon-app/Page_icon-app/input_Effective Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_icon-app/div_25'))

WebUI.click(findTestObject('Object Repository/CRM_OR/Transfer/Page_icon-app/button_Submit'))

WebUI.closeBrowser()

