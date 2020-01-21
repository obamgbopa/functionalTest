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

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/a_Country'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCountry/Page_icon-app/button_Add Country'))

WebUI.setText(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCountry/the code/Page_icon-app/input_Iso Code_ant-input'), 
    CustomKeywords.'Keywords.randomData.TestDataGenerator.set_RandomNumber'(3))

WebUI.setText(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCountry/the code/Page_icon-app/input_Country Name_ant-input'), 
    CustomKeywords.'Keywords.randomData.TestDataGenerator.getRandomCountry'())

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCountry/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCountry/the code/Page_icon-app/Page_icon-app/button_POLAND_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCountry/the code/Page_icon-app/Page_icon-app/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCountry/Page_icon-app/button_Yes'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

