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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.setText(findTestObject('Object Repository/CRM_OR/NegativeCustomer/RemoveNegativeCust/Page_Icon Login/input_WELCOME BACK_username'), 
    'fiyin')

WebUI.setEncryptedText(findTestObject('Object Repository/CRM_OR/NegativeCustomer/RemoveNegativeCust/Page_Icon Login/input_WELCOME BACK_password'), 
    'bCEiM449H1A=')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/RemoveNegativeCust/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/RemoveNegativeCust/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/RemoveNegativeCust/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/RemoveNegativeCust/Page_icon-app/span_CRM'))

WebUI.click(findTestObject('Object Repository/CRM_OR/NegativeCustomer/RemoveNegativeCust/Page_icon-app/a_Negative Customers'))

WebUI.click(findTestObject('CRM_OR/NegativeCustomer/RemoveNegativeCust/Page_icon-app/button_FIYIN_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('CRM_OR/NegativeCustomer/ManageNegativeCust/Page_icon-app/a_Manage'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_OR/NegativeCustomer/ManageNegativeCust/Page_icon-app/button_Edit Negative Customer'))

WebUI.setText(findTestObject('CRM_OR/NegativeCustomer/ManageNegativeCust/Page_icon-app/Page_icon-app/input_Negation Remarks_ant-input'), 
    'you are added to negative list')

WebUI.click(findTestObject('CRM_OR/NegativeCustomer/ManageNegativeCust/Page_icon-app/button_Update Negative Customer'))

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

