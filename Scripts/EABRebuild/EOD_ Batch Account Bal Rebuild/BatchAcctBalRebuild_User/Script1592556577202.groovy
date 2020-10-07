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

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/a_EOD Batch Account Balance Rebuild'))

WebUI.delay(2)

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/reportOwnerType'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/li_USER'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/input_User_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/searchUsersvg'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Search_user'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Select_user'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/input_From Branch_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/searchFroBranchsvg'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Search_branchFro'))

WebUI.delay(1)

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Select_branchFro'))

WebUI.delay(1)

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/input_To Branch_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/searchToBranchsvg'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Search_branchTo'))

WebUI.delay(1)

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Select_branchTo'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/fromCurrency'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/toCurrency'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/li_EUR - EURO'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/input_From Product_ant-input'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/searchProdFrosvg'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/productTypeCode'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/li_SAVINGS'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Search_prodFro'))

WebUI.delay(1)

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Select_prodFro'))

not_run: WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/input_To Product_ant-input'))

not_run: WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/searchProdTosvg'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/div_PTC'))

not_run: WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/li_SAVINGS_VALUE'))

not_run: WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Search11'))

not_run: WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Select11'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Run Batch Rebuild'))

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('EABRebuild/EOD_ Batch Account Bal Rebuild/button_Download Report'))

