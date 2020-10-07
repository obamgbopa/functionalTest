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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('SI/SITransLeg/TransferType'))

WebUI.click(findTestObject('SI/SITransLeg/li_Internal'))

WebUI.delay(3)

WebUI.click(findTestObject('SI/SITransLeg/InputAcctNumT'))

WebUI.click(findTestObject('SI/SITransLeg/AcctLookupSVG'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('SI/SITransLeg/div_prodType'), 5)

WebUI.verifyElementClickable(findTestObject('SI/SITransLeg/div_prodType'))

WebUI.click(findTestObject('SI/SITransLeg/div_prodType'))

WebUI.click(findTestObject('SI/SITransLeg/li_SAVINGS'))

WebUI.click(findTestObject('SI/SITransLeg/Button_search_Acct'))

WebUI.click(findTestObject('SI/SITransLeg/Button_select_Acct'))

WebUI.click(findTestObject('SI/SITransLeg/AmountType'))

WebUI.click(findTestObject('SI/SITransLeg/li_Fixed'))

WebUI.click(findTestObject('SI/SITransLeg/ContraPartTransPart'))

WebUI.click(findTestObject('SI/SITransLeg/li_Credit'))

WebUI.delay(3)

WebUI.setText(findTestObject('SI/SITransLeg/InputAmount'), '5000', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SI/SITransLeg/InputTransParticula'), 'Tran Leg1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SI/SITransLeg/Remarks'), 'SI Transaction First Leg(FIXED)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SI/SITransLeg/ChargeType'))

WebUI.click(findTestObject('SI/SITransLeg/li_FLAT'))

WebUI.setText(findTestObject('SI/SITransLeg/input_Transaction Charge_ant-input ant-input'), '50')

not_run: WebUI.click(findTestObject('SI/SITransLeg/button_Add Transaction            Details'))

WebUI.click(findTestObject('SI/SITransLeg/div_Charge Details'))

WebUI.delay(3)

