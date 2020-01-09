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

int num = GlobalVariable.num

Random rnd = new Random()

randomNum = rnd.nextInt(10 ** num)

WebUI.callTestCase(findTestCase('Bank Setup Default link/Bank_Setup_Default'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_Currency Rate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Create Currency Rate'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Currency Rate/Page_icon-app/input_Rate Code_ant-input'), String.valueOf(
        randomNum), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_rate_category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/li_001 - CURRENCY'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/button_Add Currency Pair'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_from_currency'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate/Page_icon-app/li_NGN'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_to_currency'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/li_AED'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Unit Rate_ant-input_first'), '5', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Treasury Rate_ant-input_first'), '5', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Positive Tolerance_ant-input_first'), '5', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Negative Tolerance_ant-input_first'), '-5', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Add'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Currency rate is Created', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Rate Description_table__btn ant-btn _57890b'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_ Currency Pair'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Add Currency Pair'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_from_currency_new'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/li_AED_new'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_to_currency_new'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/li_EUR'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Unit Rate_new'), '5', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Treasury Rate_new'), '5', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Positive Tolerance_new'), '5', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Negative Tolerance_new'), '-5', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Submit_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Currency pair is Created', false, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Rate Description_table__btn ant-btn _57890b'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_ View'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_sentinelStart_ant-modal-close'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_ Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Unit Rate_edit'), '6', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Treasury Rate_edit'), '6', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Positive Tolerance_edit'), '6', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Negative Tolerance_edit'), '-6', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Currency Pair is Updated', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate/Page_icon-app/button_sentinelStart_ant-modal-close'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/a_ Daily Rate List'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/button_Add Rate Details'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Unit Rate_ant-input ant-input'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/button_Submit_dailyRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Daily Rate is Created', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/button_Unit Rate_table__dailyRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/a_Edit_dailyRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Currency Rate Spy/Page_icon-app/input_Unit Rate_dailyRate'), '10', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/button_Edit_dailyRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Daily Rate is Updated', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_Delete_ant-drawer-mask'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate/Page_icon-app/button_sentinelStart_ant-modal-close'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/a_ Delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent(String.valueOf(randomNum) + ' is deleted', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/div_Delete_ant-drawer-mask'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Rate Description_table__btn ant-btn _57890b'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Currency Rate Spy/Page_icon-app/a_ Delete_'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Currency Rate/Page_icon-app/button_Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent(String.valueOf(randomNum) + ' is Deleted', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

