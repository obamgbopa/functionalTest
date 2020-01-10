import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.setText(findTestObject('Object Repository/create retail/Page_Icon Login/input_WELCOME BACK_username'), 'josh')

WebUI.setEncryptedText(findTestObject('Object Repository/create retail/Page_Icon Login/input_WELCOME BACK_password'), '3iF79iufxPg=')

WebUI.click(findTestObject('Object Repository/create retail/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_Applications_item__icon'))

not_run: WebUI.delay(1.5)

WebUI.click(findTestObject('Page_icon-app/a_Build No_aside__toggler'))

not_run: WebUI.verifyElementPresent(findTestObject('Retail CRM/Page_icon-app/span_CRM'), 0)

WebUI.click(findTestObject('create retail/Page_icon-app/span_CRM'))

not_run: WebUI.delay(1.5)

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/a_Retail'))

not_run: WebUI.delay(1.5)

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/button_New Customer'))

WebUI.setText(findTestObject('create retail/Page_icon-app/input_First Name_ant-input'), 'ABIMBOLA')

WebUI.setText(findTestObject('create retail/Page_icon-app/input_Middle Name_ant-input'), 'DEBORAH')

WebUI.setText(findTestObject('create retail/Page_icon-app/input_Last Name_ant-input'), 'GANIYU')

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/input_Phone Number_ant-input'), '070 6576 3433')

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/input_Date of Birth_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('create retail/Page_icon-app/a_2019'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/span_2010-2019'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/a_1990-1999'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/a_1990-1999'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/a_1992'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/a_Dec'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/a_May'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_8'))

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_Bank Verification Number_ant-input ant-input'), 
    '2229076352')

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_Identification Number_ant-input'), '2213265724')

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Perform Dedup Check'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Proceed to Create Customer'))

not_run: WebUI.setText(findTestObject('create retail/Page_icon-app/input_Bank Verification Number_ant-input ant-input_4'), 
    '2229076352')

not_run: WebUI.delay(1.5)

WebUI.click(findTestObject('Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/div_'))

WebUI.delay(1.5)

WebUI.click(findTestObject('Retail CRM/New Captures/Page_icon-app/li_MISS - MISS'))

WebUI.click(findTestObject('create retail/Page_icon-app/div_'))

WebUI.delay(1.5)

WebUI.click(findTestObject('create retail/Page_icon-app/li_M - MARRIED'))

WebUI.click(findTestObject('create retail/Page_icon-app/div_'))

WebUI.delay(1.5)

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_NATIONAL ID CARD - Identification type'))

WebUI.delay(1.5)

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/a_concat(VOTER  S CARD - Identification type)_ant-calendar-prev-month-btn'))

WebUI.click(findTestObject('create retail/Page_icon-app/div_4'))

WebUI.click(findTestObject('create retail/Page_icon-app/div_'))

WebUI.delay(1.5)

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_Nationality_ant-select-search__field'), 
    'niger')

WebUI.delay(1.5)

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_NIGERIA'))

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_Nationality_ant-select-search__field'), 
    'niger')

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_FEMALE'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_003 - AGRICULTURAL SECTOR'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_003 - AGRICULTURAL SECTOR'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_002 - FINANCIAL SECTOR'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_002 - FINANCIAL SECTOR'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_1200 - GENERAL COMMERCE'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_1205 - HEAVY DUTY MACHINERY'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_BUSOW - BUSINESS OWNER'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_112 - SMALL BUSINESS'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/svg_1'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/path'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_MAILING_ADDRESS'))

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_Phone Number_ant-input'), '090 8753 2354')

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_Home Address_ant-input'), 'IKOLE ROAD')

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_Country_ant-select-search__field'), 'niger')

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_NIGERIA'))

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_Country_ant-select-search__field'), 'niger')

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_State_ant-select-search__field'), 'ondo')

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_ONDO'))

WebUI.setText(findTestObject('Object Repository/create retail/Page_icon-app/input_State_ant-select-search__field'), 'ondo')

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_OKITIPUPA'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Add          Address'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/path_1'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/svg_2'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_NEXT_OF_KIN'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/li_BROTHER'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Add            Contact'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Submit'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/path_2'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/span_Pending Authorization'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_ACTIVE_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Search Request'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_insert_table__btn ant-btn ant-btn-primary'))

WebUI.click(findTestObject('Object Repository/create retail/Page_icon-app/button_Cancel'))

WebUI.closeBrowser()

