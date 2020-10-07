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
import org.openqa.selenium.Keys as Keys
import java.util.Random as Random

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DD_multiples/Page_icon-app/span_Products'))

WebUI.click(findTestObject('DD_multiples/Page_icon-app/a_Demand Draft'))

WebUI.click(findTestObject('createDD/Page_icon-app/button_Create Demand Draft Product'))

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Product Code_ant-input'), 'prod1' + String.valueOf(randomNum))

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Product Name_ant-input'), 'abc_prod' + String.valueOf(randomNum))

WebUI.click(findTestObject('createDD/Page_icon-app/div_bg'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_ALL-HBC - ALL-HBC'))

WebUI.click(findTestObject('createDD/Page_icon-app/Page_icon-app/div_bcode'))

WebUI.click(findTestObject('createDD/Page_icon-app/Page_icon-app/button_Search_bcode'))

WebUI.click(findTestObject('createDD/Page_icon-app/Page_icon-app/input_Reset_ant-checkbox-input_bcode'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_sb'))

WebUI.click(findTestObject('createDD/Page_icon-app/Page_icon-app/button_Confirm Selected_bcode'))

WebUI.click(findTestObject('createDD/Page_icon-app/input_Effective Date_ant-calendar-picker-input ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('createDD/Page_icon-app/div_16eff'))

WebUI.click(findTestObject('createDD/Page_icon-app/input_Expiry Date_ant-calendar-picker-input ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('createDD/Page_icon-app/a_Apr_ant-calendar-next-year-btn'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_16exp'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_gl'))

WebUI.click(findTestObject('createDD/Page_icon-app/button_Search_gl'))

WebUI.click(findTestObject('createDD/Page_icon-app/input_Reset_ant-checkbox-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('createDD/Page_icon-app/div_trans'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_BOTH - Both'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_spacer'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_acc'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_CAPRE - CURRENT ACCT -SME PREMIUM'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_Demand Draft Details'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_DDtype'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_ANY_BRANCH'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_instrument'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_INVENTORY'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_default'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_EMPLOYEE'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_stale'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_MONTHLY'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_exchange'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_CBN SELLING RATE - CBS'))

WebUI.click(findTestObject('createDD/Page_icon-app/button_Cash Transaction Allowed_ant-switch'))

WebUI.click(findTestObject('createDD/Page_icon-app/button_Transfer Transaction Allowed_ant-switch'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_inv_type'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_ABIOLA-DD - STRICTLY FOR ME KEEP OFF'))

WebUI.click(findTestObject('createDD/Page_icon-app/button_Is Default_ant-switch'))

WebUI.click(findTestObject('createDD/Page_icon-app/button_Add          Instrument'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_Product Limits and Report Codes'))

WebUI.click(findTestObject('createDD/Page_icon-app/button_Add Limit1'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_curr'))

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Debit Cash Limit_ant-input'), '100000000000000000')

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Credit Cash Limit_ant-input'), '100000000000000000')

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Debit Transfer Limit_ant-input'), '100000000000000000')

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Credit Transfer Limit_ant-input'), '100000000000000000')

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Debit Clearing Limit_ant-input'), '100000000000000000')

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Credit Clearing Limit_ant-input'), '100000000000000000')

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Debit Balance Limit_ant-input'), '100000000000000000')

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Credit Balance Limit_ant-input'), '100000000000000000')

WebUI.click(findTestObject('createDD/Page_icon-app/button_Add Limit2'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_tran_report_code'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_DEFAULT_TRANSFER - transfers'))

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Debit Amount Limit_ant-input'), '')

WebUI.setText(findTestObject('createDD/Page_icon-app/input_Credit Amount Limit_ant-input'), '')

WebUI.click(findTestObject('createDD/Page_icon-app/button_Add Code'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_Charge Details'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_charge_type'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_DDISS - DEMAND DRAFT ISSUANCE'))

WebUI.click(findTestObject('createDD/Page_icon-app/div_charge_code'))

WebUI.click(findTestObject('createDD/Page_icon-app/li_BB001 - FOR BB'))

WebUI.click(findTestObject('createDD/Page_icon-app/button_Add Charge'))

WebUI.click(findTestObject('createDD/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

