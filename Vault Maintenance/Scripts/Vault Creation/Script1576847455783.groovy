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

WebUI.setText(findTestObject('Object Repository/Page_Icon Login/input_WELCOME BACK_username'), 'josh')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Icon Login/input_WELCOME BACK_password'), '3iF79iufxPg=')

WebUI.click(findTestObject('Object Repository/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/span_Vault Maintenance'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Define Vault'))

WebUI.setText(findTestObject('Object Repository/Page_icon-app/input_Vault Id_ant-input'), 'VAULT1212')

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Select'))

WebUI.setText(findTestObject('Object Repository/Page_icon-app/input_Vault Id_ant-input'), 'VAULT1212')

WebUI.click(findTestObject('Object Repository/Page_icon-app/li_BOTH'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Select branch code'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/li_094 - NAVY TOWNMAMMY MKT'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Select_1'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/li_QC100 - ARAKUNRIN AKEREDOLU'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/li_QA004 - FIYIN TITUS'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/li_QA004 - FIYIN TITUS'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/a_Today'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/li_BOTH'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/li_OPENED'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/svg'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Add Currency Limit'))

WebUI.click(findTestObject('Object Repository/Page_icon-app/button_Create Vault'))

