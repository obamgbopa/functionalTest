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

WebUI.setText(findTestObject('Object Repository/OfficeAccount/Page_Icon Login/input_WELCOME BACK_username'), 'fiyin')

WebUI.setEncryptedText(findTestObject('Object Repository/OfficeAccount/Page_Icon Login/input_WELCOME BACK_password'), 'bCEiM449H1A=')

WebUI.click(findTestObject('Object Repository/OfficeAccount/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/OfficeAccount/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('OfficeAccount/Page_icon-app/a_Branch_aside__toggler_1'))

WebUI.click(findTestObject('Object Repository/OfficeAccount/Page_icon-app/span_Office Account'))

WebUI.click(findTestObject('Object Repository/OfficeAccount/Page_icon-app/button_Create Account'))

WebUI.delay(3)

WebUI.click(findTestObject('officeaccountspy/Page_icon-app/input_Product Code_ant-input'))

WebUI.verifyElementPresent(findTestObject('OfficeAccount/Page_icon-app/svg'), 3)

WebUI.waitForElementClickable(findTestObject('OfficeAccount/Page_icon-app/svg'), 3)

WebUI.click(findTestObject('officeaccountspy/Page_icon-app/svg'))

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('officeaccountspy/Page_icon-app/button_Search'))

WebUI.waitForElementPresent(findTestObject('officeaccountspy/Page_icon-app/button_Select'), 3)

WebUI.waitForElementClickable(findTestObject('officeaccountspy/Page_icon-app/button_Select'), 3)

WebUI.doubleClick(findTestObject('officeaccountspy/Page_icon-app/button_Select'))

not_run: WebUI.setText(findTestObject('officeaccountspy/Page_icon-app/input_Account Number_ant-input'), '20879056473')

WebUI.setText(findTestObject('officeaccountspy/Page_icon-app/input_Account Name_ant-input'), 'Ogbeni ADEOLA')

WebUI.click(findTestObject('officeaccountspy/Page_icon-app/div_'))

WebUI.delay(3)

WebUI.click(findTestObject('officeaccountspy/Page_icon-app/li_031 - ENUGU9 OGUI RD'))

WebUI.click(findTestObject('officeaccountspy/newspy/Page_icon-app/div_'))

WebUI.click(findTestObject('officeaccountspy/Page_icon-app/li_NGN - NGN'))

WebUI.click(findTestObject('officeaccountspy/SPyGL/Page_icon-app/div_'))

WebUI.setText(findTestObject('officeaccountspy/SPyGL/Page_icon-app/input_GL Sub Category_ant-select-search__field'), 'SWIFT RECOVERY')

WebUI.delay(5)

WebUI.click(findTestObject('officeaccountspy/spacerSpy/Page_icon-app/li_45870 - SWIFT RECOVERY'))

WebUI.click(findTestObject('officeaccountspy/Page_icon-app/button_Submit'))

WebUI.closeBrowser()

