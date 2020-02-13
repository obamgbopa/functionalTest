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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://192.168.5.46:9090/sso')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso')

WebUI.setText(findTestObject('Object Repository/De-Assign Till/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 'josh')

WebUI.setEncryptedText(findTestObject('Object Repository/De-Assign Till/Page_sso/input_WELCOME BACK_ant-input ant-input-lg_1'), 
	'/q2iZ2sPEiM=')

WebUI.click(findTestObject('Object Repository/De-Assign Till/Page_sso/button_Login'))

WebUI.click(findTestObject('Object Repository/De-Assign Till/Page_sso/button_CORE_app__button'))

WebUI.click(findTestObject('Object Repository/De-Assign Till/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Page_icon-app/span_Cash Account Maintenance'))

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/a_Manage Till'))

WebUI.setText(findTestObject('Object Repository/De-Assign Till/Page_icon-app/input_ADD TILL_ant-input'), 'ajs002')

WebUI.click(findTestObject('De-Assign Till/Page_icon-app/button_ADD TILL_ant-btn ant-btn-primary ant_d6deb7'))

WebUI.click(findTestObject('Search and View/Page_sso/Page_icon-app/button_ASSIGNED_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/a_Edit Till'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/div_'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/li_EUR - EURO'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/svg'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/button_UPDATE TILL'))

WebUI.click(findTestObject('Assign Till/Page_icon-app/button_Yes'))

not_run: WebUI.setText(findTestObject('Object Repository/De-Assign Till/Page_icon-app/input_ADD TILL_ant-input'), 'ajs002')

WebUI.click(findTestObject('De-Assign Till/Page_icon-app/button_ADD TILL_ant-btn ant-btn-primary ant_d6deb7'))

WebUI.click(findTestObject('Search and View/Page_sso/Page_icon-app/button_ASSIGNED_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/a_Edit Till'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/a'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/button_Yes'))

WebUI.click(findTestObject('Edit Till/Page_icon-app/button_UPDATE TILL'))

WebUI.click(findTestObject('Assign Till/Page_icon-app/button_Yes'))

WebUI.closeBrowser()

