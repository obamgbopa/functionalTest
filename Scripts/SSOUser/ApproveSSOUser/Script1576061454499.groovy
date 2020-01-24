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

WebUI.navigateToUrl('http://192.168.5.46:8081/core/')

WebUI.setText(findTestObject('Object Repository/SSOUser/ApproveSSOUser/Page_Icon Login/input_WELCOME BACK_username'), 'superadmin1')

WebUI.setText(findTestObject('Object Repository/SSOUser/ApproveSSOUser/Page_Icon Login/input_WELCOME BACK_password'), '#Abc123')

WebUI.click(findTestObject('Object Repository/SSOUser/ApproveSSOUser/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('Object Repository/SSOUser/ApproveSSOUser/Page_icon-app/a_Users'))

WebUI.click(findTestObject('SSOUser/ApproveSSOUser/Page_icon-app/div_Pending Verifications'))

WebUI.click(findTestObject('Object Repository/SSOUser/ApproveSSOUser/Page_icon-app/button_insert_table__btn ant-btn ant-btn-primary'))

WebUI.verifyElementClickable(findTestObject('SSOUser/ApproveSSOUser/Page_icon-app/button_Approve'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('SSOUser/ApproveSSOUser/Page_icon-app/button_Approve'))

WebUI.closeBrowser()

