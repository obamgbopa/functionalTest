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

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/a_Country'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/button_Add Country_ant-btn ant-btn-primary _f65a14'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/newCity/spy/countrySpy/Page_icon-app/input_Add Country_ant-input'))

WebUI.setText(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/newCity/spy/countrySpy/Page_icon-app/input_Add Country_ant-input'), 
    'Nigeria')

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/newCity/spy/countrySpy/Page_icon-app/button_Add Country_ant-btn ant-btn-primary ant-input-search-button'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/newCity/spy/countrySpy/Page_icon-app/button_NIGERIA_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/newCity/spy/countrySpy/Page_icon-app/a_ Manage State'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/newCity/spy/countrySpy/Page_icon-app/button_Add State_ant-btn ant-btn-primary ant-input-search-button'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteState/spy/Page_icon-app/button_Add State'))

WebUI.setText(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteState/spy/Page_icon-app/input_State Code_ant-input'), 
    String.valueOf(randomNum))

WebUI.setText(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteState/spy/Page_icon-app/input_State Name_ant-input'), 
    'NEW_STATE' + String.valueOf(randomNum))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteState/spy/Page_icon-app/button_Submit'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteState/spy/Page_icon-app/button_AKWA IBOM_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteState/spy/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteState/spy/Page_icon-app/button_Yes'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(3)

WebUI.closeBrowser()

