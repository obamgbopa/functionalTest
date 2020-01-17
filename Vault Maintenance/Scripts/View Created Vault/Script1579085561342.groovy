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

not_run: WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/View Vault/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 'josh')

WebUI.setEncryptedText(findTestObject('Object Repository/View Vault/Page_sso/input_WELCOME BACK_ant-input ant-input-lg_1'), 
    '/q2iZ2sPEiM=')

WebUI.click(findTestObject('Object Repository/View Vault/Page_sso/button_Login'))

WebUI.click(findTestObject('Page_sso/button_CORE_app__button'))

WebUI.click(findTestObject('Object Repository/View Vault/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/View Vault/Page_icon-app/span_Vault Maintenance'))

WebUI.setText(findTestObject('Object Repository/View Vault/Page_icon-app/input_All Vault-Tills_ant-input'), 'vault678')

WebUI.click(findTestObject('View Vault/Page_sso/Page_icon-app/button_All Vault-Tills_ant-btn ant-btn-primary ant-input-search-button'))

WebUI.click(findTestObject('View Vault/Page_sso/Page_icon-app/Page_icon-app/button_False_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/View Vault/Page_icon-app/a_View'))

WebUI.verifyElementPresent(findTestObject('Object Repository/View Vault/Page_icon-app/div_Vault Id'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/View Vault/Page_icon-app/div_Vault TypeSelect            CASH'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/View Vault/Page_icon-app/div_Branch CodeSelect branch code093'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/View Vault/Page_icon-app/td_NGN'), 0)

WebUI.closeBrowser()

