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
import java.util.Random as Random
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Date today = new Date()

String currentDateTime = today.format('yyyy-mm-dd hh:mm:ss.a')

// initilize random variables
int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/a_Build No_aside__toggler'))

WebUI.click(findTestObject('CRM_OR/Contact/span_CRM'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/a_Corporate'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_New Customer'))

WebUI.delay(2)

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Company Name_ant-input__'), 
    'AUXANO IT SOLUTIONS' + randomNum)

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Registration Number_ant-input'), 
    '430986350' + randomNum)

WebUI.setText(findTestObject('Object Repository/CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Tax Identification(TIN)_ant-input'), 
    '567954774' + randomNum)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Perform Dedup Check'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Proceed to Create Customer'))

WebUI.delay(1)

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_ShortCompanyName'), 'AUXANO SOLUTIONS')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/textarea_Business Description_ant-input'), 
    'AUXANO SOLUTIONS IS ONE OF THE LEADING IT SOLUTION COMPANY')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/incorporation_country'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_NIGERIA_1'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/ownership_field'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_PARASTATAL'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/prefered_lang'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_English'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Money Laundering Cert No_ant-input'), 
    '05478567343')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Parent Organization_ant-input'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/ParentOrgSVG'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Search_PO'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Select_PO'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Next_1'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_RelationshipManager'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/svg_1'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Search_RM'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Select_RM'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/sector_field'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_1100 - AVIATION'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/sub_sector_field'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_1106 - AVIATION ENGINEERING'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/segment_field'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_COMM - COMMERCIAL'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/sub_segment'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_MAN 1 - MANUFACTURING'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Trade Financing Allowed_ant-switch'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/KYC_status'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_COMPLETE'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/introducerType'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_EMPLOYEE'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Introducer Code - Employee_ant-input'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/inputIntroducersvg'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Search_introducer'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Select_introducer'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Swift Code_ant-input'), 
    '84390436723')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/title'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_ANNUAL_INCOME - AVERAGE_ANNUAL _INCOME'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Value_ant-input ant-input'), 
    '99999999999')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Add Financials'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/bankName'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_011 - FIRST BANK OF NIGERIA'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/BankCountry'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_AU - AUSTRALIA'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Account Number_ant-input'), 
    '0268654435457')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Add Bank Account'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Next_2'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Add Document'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/DocumentType'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_ADRP - ADDRESS PROOF'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/DocumentCode'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_DOC230 - TESTING'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Document Reference Number_ant-input'), 
    '7843907843232')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/CountryOfIssuance'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_DZ - ALGERIA'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Place of Issuance_ant-input'), 
    'Algiers')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Add Document_____'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/div_Add Address'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/address_type'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_MAILING_ADDRESS--'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Email Address_ant-input'), 
    ('ORGANIZATIONMAIL' + randomNum) + '@GMAIL.COM')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Phone Number_ant-input'), 
    '09088424' + randomNum)

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Fax Number_ant-input'), 
    '79545')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Home Address_ant-input'), 
    'IJAPO ESTATE AKURE')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Landmark_ant-input'), 'BLOCK 200')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Zip Code_ant-input'), '234')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Nearest Bus Stop_ant-input'), 
    'A DIVISION')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/country'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_NIGERIA_2'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/state'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_LAGOS'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/city'))

WebUI.delay(1)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_VI  ADEOLA ODEKU'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Add _Address'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Next_3'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Contact Look Up_ant-input'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/svg_4'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Search_4'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Select_4'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/contact_type'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_DIRECTOR'))

not_run: WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Middle Name_ant-input'), 
    'Bukky')

not_run: WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Tax Id Number_ant-input'), 
    '3578326')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.uploadFile(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Upload_1'), 
    'C:\\Users\\DEVELOPER\\Pictures\\sunflower.jpg')

not_run: WebUI.uploadFile(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Upload_2'), 
    'C:\\Users\\DEVELOPER\\Pictures\\spiral.png')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Add_Contact'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Next_4'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Preferential Rate_ant-input ant-input'), 
    '8900')

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/drcr_indicator'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_CREDIT'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/input_Preferential Expiry Date_ant-calendar-picker-input ant-input'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/a_Jan_ant-calendar-next-year-btn'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/a_Jan_ant-calendar-next-year-btn'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/a_Jan_ant-calendar-next-year-btn'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/a_Jan_ant-calendar-next-year-btn'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/drcr_date'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/product_type'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/li_CURRENT'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Create_Corporate_Customer/button_Submit'))

not_run: WebUI.delay(2)

// validations
not_run: WebUI.verifyTextPresent('Success', false)

not_run: if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    // WebUI.takeScreenshot('success/' + currentDateTime + '_create_corporate_cust.png')
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('C:\\Users\\DEVELOPER\\Katalon Studio\\LegacyCore\\functionalTest\\CreateCortpCustScreenshot' + 
        randomNum) + '.png')

    WebUI.closeBrowser()
}

