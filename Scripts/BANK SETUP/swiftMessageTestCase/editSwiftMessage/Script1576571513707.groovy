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

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/a_Swift Message'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/button_Add Payment System_ant-btn ant-btn-p_943171'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/button_EVENTS_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/a_ Edit'))

WebUI.clearText(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/input_Event_ant-input'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/input_Event_ant-input'), 
    'EVENTS')

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/li_AED'))

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/input_Minimum Amount_ant-input ant-input'), 
    CustomKeywords.'Keywords.randomData.TestDataGenerator.set_RandomNumber'(1) + '0,000')

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/input_Maximum amount_ant-input ant-input_1'), 
    CustomKeywords.'Keywords.randomData.TestDataGenerator.set_RandomNumber'(1) + ',000,000')

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/button_Add Swift Currency'))

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/input_Minimum Amount_ant-input ant-input_1'), 
    '0')

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/editSwiftMessage/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

