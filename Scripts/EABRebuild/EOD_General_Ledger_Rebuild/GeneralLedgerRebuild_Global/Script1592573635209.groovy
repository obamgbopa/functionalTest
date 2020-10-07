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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/a_Build No_aside__toggler'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/span_EAB Rebuild'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/a_EOD General Ledger Rebuild'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/reportOwnerType'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/li_GLOBAL'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/input_Branch_ant-input'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/input_Branch Code_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/searchBranchsvg'))

WebUI.setText(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/input_Branch Code_ant-input'), '999')

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/button_Search_branch'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/button_Select_branch'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/input_From Date_ant-calendar-'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/a_Select_ant-calendar-prev-month-btn'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/a_Select_ant-calendar-prev-month-btn'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/a_Select_ant-calendar-prev-month-btn'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/date'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/input_From GL Sub Category_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/GLfromsvg'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/button_Search_GLfro'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/button_Select_GLfro'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/input_To GL Sub Category_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/GLtosvg'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/button_Search_GLto'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/button_Select_GLto'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/fromCurrency'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/toCurrency'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/li_USD - US DOLLAR'))

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/button_Run GL Balance Rebuild'))

WebUI.delay(2)

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/button_Yes'))

WebUI.delay(10)

WebUI.click(findTestObject('EABRebuild/EOD_General_Ledger_Rebuild/button_Download Report'))

