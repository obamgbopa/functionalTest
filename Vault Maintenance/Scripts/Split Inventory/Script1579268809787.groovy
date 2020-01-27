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

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso')

not_run: WebUI.delay(3)

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/SplitInventory/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 'josh')

WebUI.setEncryptedText(findTestObject('Object Repository/SplitInventory/Page_sso/input_WELCOME BACK_ant-input ant-input-lg_1'), 
    '/q2iZ2sPEiM=')

WebUI.click(findTestObject('Object Repository/SplitInventory/Page_sso/button_Login'))

WebUI.click(findTestObject('Object Repository/SplitInventory/Page_sso/button_CORE_app__button'))

WebUI.click(findTestObject('Object Repository/SplitInventory/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Move Vault Inventory/Page_icon-app/Page_icon-app/span_Vault Maintenance'))

WebUI.click(findTestObject('Object Repository/SplitInventory/Page_icon-app/a_Branch Vault'))

WebUI.click(findTestObject('SplitInventory/SplitCaptures/Page_icon-app/button_View Items'))

WebUI.click(findTestObject('Page_icon-app/button_View Items'))

WebUI.click(findTestObject('SplitInventory/SplitCaptures/Page_icon-app/button_UNASSIGNED_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('SplitInventory/SplitCaptures/Page_icon-app/a_Split'))

WebUI.setText(findTestObject('Object Repository/SplitInventory/Page_icon-app/input_Quantity per Unit_ant-input ant-input'), 
    '1')

WebUI.click(findTestObject('SplitInventory/SplitCaptures/Page_icon-app/button_SPLIT'))

WebUI.click(findTestObject('Object Repository/SplitInventory/Page_icon-app/button_No'))

WebUI.closeBrowser()

