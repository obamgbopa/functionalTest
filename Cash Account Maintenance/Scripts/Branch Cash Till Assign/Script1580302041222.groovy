import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://192.168.5.46:9090/sso')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso')

WebUI.setText(findTestObject('Object Repository/Branch Cash Till View/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 
    'josh')

WebUI.setEncryptedText(findTestObject('Object Repository/Branch Cash Till View/Page_sso/input_WELCOME BACK_ant-input ant-input-lg_1'), 
    '/q2iZ2sPEiM=')

WebUI.click(findTestObject('Object Repository/Branch Cash Till View/Page_sso/button_Login'))

WebUI.click(findTestObject('Object Repository/Branch Cash Till View/Page_sso/button_CORE_app__button'))

WebUI.click(findTestObject('Object Repository/Branch Cash Till Assign/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Page_icon-app/span_Cash Account Maintenance'))

WebUI.click(findTestObject('Object Repository/Branch Cash Till Assign/Page_icon-app/a_Branch Till'))

WebUI.click(findTestObject('Object Repository/Branch Cash Till Assign/Page_icon-app/button_ASSIGNED_table__btn ant-btn ant-btn-_528340'))

WebUI.click(findTestObject('Object Repository/Branch Cash Till Assign/Page_icon-app/a_Assign'))

WebUI.click(findTestObject('Object Repository/Branch Cash Till Assign/Page_icon-app/div_'))

WebUI.click(findTestObject('Branch Cash Till Assign/Page_icon-app/li_QA001'))

WebUI.click(findTestObject('Branch Cash Till Assign/Page_icon-app/button_ASSIGN TILL'))

WebUI.click(findTestObject('Branch Cash Till Assign/Page_icon-app/button_Yes'))

WebUI.click(findTestObject('Object Repository/Branch Cash Till e-Assign/Page_icon-app/button_ASSIGNED_table__btn ant-btn ant-btn-_528340'))

WebUI.click(findTestObject('Object Repository/Branch Cash Till Assign/Page_icon-app/a_View'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Branch Cash Till Assign/Page_icon-app/div_Employee IdQA001'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Branch Cash Till Assign/Page_icon-app/div_CurrencySpacerActionsEUR1010000002USD10_2ad99f'), 
    0)

WebUI.closeBrowser()

