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

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/a_Build No_aside__toggler'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/span_EAB Rebuild'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/a_EOD Account Balance Rebuild'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/reportOwnerType'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/li_USER'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/input_User_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/searchUserSvg'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/button_Search_user'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/button_Select_user'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/input_From Account Number_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/searchFroAcct'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/button_Search_Fro'))

WebUI.delay(2)

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/button_Select_Fro'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/input_To Account Number_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/searchToAcct'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/button_Search_To'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/button_Select_To'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/input_From Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/a__ant-calendar-prev-month-btn'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/a__ant-calendar-prev-month-btn'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/a__ant-calendar-prev-month-btn'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/pickDate'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/button_Run Rebuild'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/button_Yes'))

WebUI.click(findTestObject('EABRebuild/EOD_Account_Balance_Rebuild/Page_icon-app/button_Download Report'))

WebUI.delay(5)

WebUI.closeBrowser()

