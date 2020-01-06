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

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Currency Rate/Page_Icon Login/input_WELCOME BACK_username'), 'TOMMIE')

WebUI.setEncryptedText(findTestObject('Object Repository/Currency Rate/Page_Icon Login/input_WELCOME BACK_password'), 'RlZsoEm1HLfPO8dtOqKUMA==')

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_Currency Rate'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Create Currency Rate'))

WebUI.setText(findTestObject('Object Repository/Currency Rate/Page_icon-app/input_Rate Code_ant-input'), '015')

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_rate_category'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/li_001 - CURRENCY'))

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/button_Add Currency Pair'))

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_from_currency'))

WebUI.click(findTestObject('Currency Rate/Page_icon-app/li_NGN'))

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_to_currency'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/li_AED'))

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Unit Rate'), '5')

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Treasury Rate'), '5')

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Positive Tolerance'), '5')

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Negative Tolerance'), '-5')

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Add'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Submit'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Rate Description_table__btn ant-btn _57890b'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_ Currency Pair'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Add Currency Pair'))

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_from_currency_new'))

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/li_AED_new'))

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_to_currency_new'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/li_EUR'))

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Unit Rate_new'), '5')

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Treasury Rate_new'), '5')

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Positive Tolerance_new'), '5')

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Negative Tolerance_new'), '-5')

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Rate Description_table__btn ant-btn _57890b'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_ View'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_sentinelStart_ant-modal-close'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_ Edit'))

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Unit Rate'), '6')

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Treasury Rate'), '6')

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Positive Tolerance'), '6')

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Negative Tolerance'), '-6')

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Edit'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Rate Description_table__btn ant-btn _57890b'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Yes'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/div_Delete_ant-drawer-mask'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Rate Description_table__btn ant-btn _57890b'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Yes'))

WebUI.closeBrowser()

