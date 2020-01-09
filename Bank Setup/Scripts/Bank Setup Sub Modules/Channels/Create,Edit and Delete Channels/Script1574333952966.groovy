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

WebUI.callTestCase(findTestCase('Bank Setup Default link/Bank_Setup_Default'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/a_Channels'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/button_Add Channels 1'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/div_channel_id'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/li_ATM'))

WebUI.click(findTestObject('Channels Spy/channel changes/Page_icon-app/svg'))

WebUI.click(findTestObject('Channels Spy/channel changes/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Channels Spy/channel changes/Page_icon-app/a_283'))

WebUI.click(findTestObject('Channels Spy/channel changes/Page_icon-app/button_Select'))

WebUI.setText(findTestObject('Object Repository/Channels/Page_icon-app/textarea_Description_ant-input'), 'AUTOMATED TESTING')

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/button_Add Terminal'))

WebUI.setText(findTestObject('Object Repository/Channels/Page_icon-app/input_Terminal ID_ant-input'), 'TEST')

WebUI.setText(findTestObject('Channels Spy/Page_icon-app/input_Terminal Description_ant-input'), 'STILL TESTING')

WebUI.click(findTestObject('Channels Spy/Page_icon-app/div_default_rate_code'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/li_AUB'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/div_branch'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/li_098 - VISLAND SAKA TINUBU'))

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/input_Status_radioGroup'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/button_Add Channels 2'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/div_currency_code'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.setText(findTestObject('Object Repository/Channels/Page_icon-app/input_Cash Limit Dr_ant-input ant-input'), '10')

WebUI.setText(findTestObject('Channels Spy/Page_icon-app/input_Cash Limit Cr_ant-input ant-input'), '10')

WebUI.setText(findTestObject('Channels Spy/Page_icon-app/input_Transfer Dr_ant-input ant-input'), '10')

WebUI.setText(findTestObject('Channels Spy/Page_icon-app/input_Transfer Cr_ant-input ant-input'), '10')

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/svg'))

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/svg_cr_account_id'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/button_Add Channels_toCreate'))

WebUI.click(findTestObject('Channels Spy/Page_icon-app/button_Add Terminal_toCreate'))

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/button_Submit'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/button_AUTOMATED TESTING_table__btn ant-btn_779cfa'))

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/a_ Edit'))

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/button_Edit'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/button_AUTOMATED TESTING_table__btn ant-btn_779cfa'))

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('Object Repository/Channels/Page_icon-app/button_Yes'))

WebUI.delay(10)

WebUI.closeBrowser()

