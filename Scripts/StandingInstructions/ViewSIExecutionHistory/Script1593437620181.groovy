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

WebUI.click(findTestObject('SI/SI/a_Build No_aside__toggler'))

WebUI.click(findTestObject('SI/SI/span_Standing Instruction'))

WebUI.click(findTestObject('SI/EditSI/button_Search_all'))

WebUI.setText(findTestObject('SI/EditSI/input_Si Code_ant-input'), 'SI241')

WebUI.click(findTestObject('SI/EditSI/button_Search Standing Instruction'))

WebUI.click(findTestObject('SI/ViewSI/button_ACTIVE_table__'))

WebUI.click(findTestObject('SI/ViewSI/a_ View Execution History'))

WebUI.delay(5)

WebUI.click(findTestObject('SI/ViewSI/div_Pre Condition Failure'))

WebUI.delay(5)

WebUI.click(findTestObject('SI/ViewSI/div_General SI Failure'))

WebUI.delay(5)

WebUI.click(findTestObject('SI/ViewSI/div_Backlog Transaction Failure'))

WebUI.delay(3)

WebUI.click(findTestObject('SI/ViewSI/div_Transaction History'))

WebUI.click(findTestObject('SI/ViewSI/a_S2020051842'))

WebUI.click(findTestObject('SI/ViewSI/button_No_table__btn'))

WebUI.click(findTestObject('SI/ViewSI/a_View1'))

WebUI.click(findTestObject('SI/ViewSI/i_View Transaction Body_arrow anticon anticon-right'))

WebUI.delay(5)

WebUI.click(findTestObject('SI/ViewSI/cancel1svg'))

WebUI.click(findTestObject('SI/ViewSI/cancel2svg'))

WebUI.click(findTestObject('SI/ViewSI/a_2'))

WebUI.click(findTestObject('SI/ViewSI/a_3'))

