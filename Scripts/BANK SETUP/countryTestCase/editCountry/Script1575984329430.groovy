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
import java.util.Random as Random

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/a_Country'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/editCountry/Page_icon-app/button_Add Country_ant-btn ant-btn-primary _f65a14'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/editCountry/edit/Page_icon-app/button_POLAND_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/editCountry/edit/newEdit/Page_icon-app/a_ Edit'))

WebUI.setText(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/newCity/spy/countrySpy/Page_icon-app/input_City Code_ant-input'), 
    String.valueOf(randomNum))

WebUI.clearText(findTestObject('BANK_SETUP_OR/countryOR/editCountry/Page_icon-app/input_Country Name_ant-input'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BANK_SETUP_OR/countryOR/editCountry/Page_icon-app/input_Country Name_ant-input'), 'UAE')

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/editCountry/edit/Page_icon-app/button_Edit'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

