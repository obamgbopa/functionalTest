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

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Create Product01'))

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Product Code_ant-input'), 'CODE' + 
    String.valueOf(randomNum))

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Product Name_ant-input'), 'NAME' + 
    +(String.valueOf(randomNum)))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_Multiple Select_bcode'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Search_bcode'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_LAGOS_ant-checkbox-input'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Confirm Selected Bcode'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_bgroup'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/li_ALL-HBC - ALL-HBC'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Effective Dates_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_16'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Expiry Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/a_Apr_ant-calendar-next-year-btn'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_20'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_tran'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/li_BOTH - Both'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_Multiple Select GL'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Search_GL'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Reset_ant-checkbox-input-gl'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Confirm Selected-GL'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_acc_partition'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/li_NON_PARTITION - Non partition'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Self Reconciling_ant-switch'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_Multiple Select spacer'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Search spacer'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Reset_ant-checkbox-input-spacer'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Confirm Selected Spacer'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_mis'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/li_MIS_01'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_acc_no'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/li_CAPRO - ACCOUNT_NO'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_instrument'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/li_CHQ - CHEQUES'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/li_DD - DEMAND DRAFT'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Next'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Add Limit01'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/div_currency'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Debit Cash Limit_ant-input'), '10000000000')

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Credit Cash Limit_ant-input'), 
    '10000000000')

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Debit Transfer Limit_ant-input'), 
    '10000000000')

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Credit Transfer Limit_ant-input'), 
    '10000000000')

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Debit Clearing Limit_ant-input'), 
    '10000000000')

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Credit Transfer Limit_ant-input'), 
    '10000000000')

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Debit Balance Limit_ant-input'), 
    '10000000000')

WebUI.setText(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/input_Credit Balance Limit_ant-input'), 
    '10000000000')

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Add Limit02'))

WebUI.click(findTestObject('OFFICE_PRODUCT_OPS/createOfficeProduct/Page_icon-app/button_Create Product02'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

