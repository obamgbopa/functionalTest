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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OFFICE_OPS/Page_icon-app/button_Pending Authorizations_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('OFFICE_OPS/Page_icon-app/button_Search Account'))

WebUI.click(findTestObject('OFFICE_OPS/Page_icon-app/button_NGN_table__btn ant-btn ant-btn-primary ant-dropdown-trigger3'))

WebUI.click(findTestObject('OFFICE_OPS/Page_icon-app/a_ GL Transfer'))

WebUI.click(findTestObject('OFFICE_OPS/Page_icon-app/svg'))

WebUI.click(findTestObject('OFFICE_OPS/Page_icon-app/button_Search'))

WebUI.click(findTestObject('OFFICE_OPS/Page_icon-app/button_Select'))

WebUI.click(findTestObject('OFFICE_OPS/Page_icon-app/button_Transfer Gl'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

