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

WebUI.setText(findTestObject('CASAProduct/SavingsGeneralDetails/input_Product Code_ant-input'), 'sala_104')

WebUI.setText(findTestObject('CASAProduct/SavingsGeneralDetails/input_Product Name_ant-input'), 'salary account product')

WebUI.setText(findTestObject('CASAProduct/SavingsGeneralDetails/input_Product Short Name_ant-input'), 'salary account')

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/BranchGroupCode'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/li_SS - SOUTH SOUTH'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/div_Multiple SelectBranchCodes'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_Search_branchCode'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/input_Reset_ant-checkbox-input'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_Confirm Selected'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/ProductSuoervisor'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/li_TEM_001 - TOPE EMMA'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/CustType'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/li_BOTH - Both Corporate and Retail customer'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/div_Multiple Select_generalLedger'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_Search_generalLedger'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/label_Reset_ant-checkbox-wrapper'))

not_run: WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_Confirm SelectedGL'))

WebUI.setText(findTestObject('CASAProduct/SavingsGeneralDetails/input_New Account Period (DM)_ant-input'), '2')

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_Staff Product_ant-switch ant-switch-checked'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_Cheque Allowed_ant-switch'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_Auto Generate Account Number_ant-switch ant-switch-checked'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/acctNumberGenCode'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/li_CAPRO - CURRENT ACCT -SME PRO'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_Generate Temporary Account Number_ant-switch'))

not_run: WebUI.setText(findTestObject('CASAProduct/SavingsGeneralDetails/input_Minimum Age(Years)_ant-input ant-input'), 
    '17')

not_run: WebUI.setText(findTestObject('CASAProduct/SavingsGeneralDetails/input_Maximum Age(Years)_ant-input ant-input'), 
    '99')

not_run: WebUI.setText(findTestObject('CASAProduct/SavingsGeneralDetails/input_Minimum Account Closure Period (YMD)_ant-input'), 
    '1')

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/nonResidentFlag'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/li_BOTH - Both resident and non-resident'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/input_Account Statement Type_ant-select-search__field'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/li_F - Periodic'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/input_acctMaintenanceFreq'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/li_MONTHLY - Monthly'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/div_Instrument'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/li_CHEQUES - CHQ'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/li_DEMAND DRAFT - DD'))

not_run: WebUI.setText(findTestObject('CASAProduct/SavingsGeneralDetails/input_Days To Inactive_ant-input ant-input'), '70')

not_run: WebUI.setText(findTestObject('CASAProduct/SavingsGeneralDetails/input_Days To Dormant_ant-input ant-input'), '90')

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_Withdrawal Exceeded Penalty_ant-switch'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/input_Past Due GL Sub Category_ant-input'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/svg'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_SearchPastDueGL'))

WebUI.click(findTestObject('CASAProduct/SavingsGeneralDetails/button_SelectPastDueGL'))

