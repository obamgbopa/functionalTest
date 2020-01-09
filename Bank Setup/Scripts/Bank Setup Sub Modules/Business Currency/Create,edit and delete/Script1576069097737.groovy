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

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/a_Business Currency'))

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/button_Define Currency'))

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/li_HNL - HONDURAN LEMPIRA'))

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/input_Numeric Code_ant-input(1)'), String.valueOf(randomNum))

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/input_Decimal Name_ant-input'), 'HOND')

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/input_Float Days_ant-input ant-input'), '5')

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/input_Days Per Year_ant-input ant-input'), '365')

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/input_Leap Year_ant-input ant-input'), '370')

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/button_Add Denomination'))

WebUI.setText(findTestObject('Object Repository/Business Currency/Page_icon-app/input_Numeric Code_ant-input'), String.valueOf(
        randomNum))

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/Page_icon-app/div_category'))

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/Page_icon-app/li_CURRENCY'))

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/Page_icon-app/div_type'))

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/Page_icon-app/li_NOTE'))

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/Page_icon-app/input_Value_ant-input'), String.valueOf(
        randomNum))

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/Page_icon-app/input_Description_ant-input'), 'TESTT')

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/button_Add Denomination(2)'))

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/div_Country Details'))

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/div_country_code'))

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/li_HN - HONDURAS'))

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/input_Over All Transaction Limit_ant-input'), '99999')

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/button_Is BlackListed_ant-switch'))

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/button_Is Disabled_ant-switch'))

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/button_IBAN is Allowed_ant-switch'))

WebUI.setText(findTestObject('Object Repository/Business Currency/Page_icon-app/input_IBAN Length_ant-input ant-input'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Business Currency/Page_icon-app/input_International Check Digit_ant-input a_6566f6'), 
    '77')

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/input_Bank identifier (sortcode)_ant-input'), String.valueOf(
        randomNum))

WebUI.setText(findTestObject('Business Currency Spy/Page_icon-app/input_Branch identifier (sortcode)_ant-input'), String.valueOf(
        randomNum))

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/button_A member of SEPA_ant-switch'))

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Business Currency is Created', false)

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/button_Is BlackListed_ant-switch'))

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/a_ Edit'))

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/button_Submit(1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Business Currency Spy/Page_icon-app/button_Submit(2)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Business Currency is Updated', false)

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/button_Is BlackListed_ant-switch'))

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('Object Repository/Business Currency/Page_icon-app/button_Yes'))

WebUI.verifyTextPresent('HNL is deleted', false)

WebUI.delay(2)

WebUI.closeBrowser()

