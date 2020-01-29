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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/')

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Cash Deposit/Page_sso/input_WELCOME BACK_ant-input ant-input-lg'), 'LBT4001')

WebUI.setEncryptedText(findTestObject('Object Repository/Cash Deposit/Page_sso/input_WELCOME BACK_ant-input ant-input-lg_1'), 
    '3iF79iufxPg=')

WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_sso/button_Login'))

WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_sso/button_CORE_app__button'))

WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_icon-app/span_Transaction Maintenance'))

WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_icon-app/a_Cash Deposit'))

for (def row = 1; row <= findTestData('Account Number Data File/New Test Data').getRowNumbers(); row++) {
    WebUI.setText(findTestObject('Object Repository/Cash Deposit/Page_icon-app/input_Account Number_ant-input'), findTestData(
            'Account Number Data File/New Test Data').getValue('Account Number', row))

    WebUI.setText(findTestObject('Object Repository/Cash Deposit/Page_icon-app/input_Amount_Amount'), '1,000')

    WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_icon-app/div_'))

    WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_icon-app/li_DEFAULT_DEPOSIT - deposits'))

    WebUI.setText(findTestObject('Object Repository/Cash Deposit/Page_icon-app/input_Transaction Particulars_ant-input'), 
        'DEPOSIT')

    WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_icon-app/button_No'))

    WebUI.setText(findTestObject('Cash Deposit Spy/Page_icon-app/input_Reference Number_ant-input'), 'REF2')

    WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_icon-app/div_Cash Analysis'))

    WebUI.setText(findTestObject('Object Repository/Cash Deposit/Page_icon-app/input_Amount_1000'), '1')

    WebUI.click(findTestObject('Object Repository/Cash Deposit/Page_icon-app/button_Post Entry'))

    WebUI.verifyTextPresent('Transaction Posted successfully.', false)
}

WebUI.delay(1)

WebUI.closeBrowser()

