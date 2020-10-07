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

WebUI.callTestCase(findTestCase('LOGIN/LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CHECKSUM/Page_icon-app/svg_acc'))

WebUI.click(findTestObject('CHECKSUM/Page_icon-app/div_prod'))

WebUI.click(findTestObject('CHECKSUM/Page_icon-app/li_CURRENT'))

WebUI.click(findTestObject('CHECKSUM/Page_icon-app/button_Searchprod'))

WebUI.click(findTestObject('CHECKSUM/Page_icon-app/input_Product Type_ant-checkbox-input'))

WebUI.click(findTestObject('CHECKSUM/Page_icon-app/button_Confirm Selectedacc'))

WebUI.click(findTestObject('CHECKSUM/Page_icon-app/button_REFRESH ACCOUNT'))

WebUI.click(findTestObject('CHECKSUM/Page_icon-app/button_Yes'))

WebUI.click(findTestObject('CHECKSUM/Page_icon-app/button_Download Report'))

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

