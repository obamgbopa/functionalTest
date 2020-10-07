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

WebUI.callTestCase(findTestCase('LOGIN_MC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('closeDDA/Page_icon-app/div_CREATE_DD_ACCOUNT'))

WebUI.click(findTestObject('closeDDA/Page_icon-app/li_Close a demand draft account'))

WebUI.click(findTestObject('closeDDA/Page_icon-app/button_Search Request'))

WebUI.click(findTestObject('closeDDA/Page_icon-app/button_OTHERS_table__btn ant-btn ant-btn-primary'))

WebUI.click(findTestObject('closeDDA/Page_icon-app/button_Reject01'))

WebUI.setText(findTestObject('closeDDA/Page_icon-app/textarea_Reason_ant-input'), 'for test')

WebUI.click(findTestObject('closeDDA/Page_icon-app/button_Reject02'))

WebUI.delay(2)

WebUI.closeBrowser()

