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

WebUI.callTestCase(findTestCase('LOGIN_CHECKER'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MAKERCHECKER/Page_icon-app/div_CREATE_OFFICE_ACCOUNT'))

WebUI.click(findTestObject('MAKERCHECKER/Page_icon-app/li_Transfer office account GL'))

WebUI.click(findTestObject('MAKERCHECKER/Page_icon-app/button_Search Request'))

WebUI.click(findTestObject('MAKERCHECKER/Page_icon-app/button_in 2 minutes_table__btn ant-btn ant-btn-primary'))

WebUI.click(findTestObject('MAKERCHECKER/Page_icon-app/button_ApproveGLT'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

