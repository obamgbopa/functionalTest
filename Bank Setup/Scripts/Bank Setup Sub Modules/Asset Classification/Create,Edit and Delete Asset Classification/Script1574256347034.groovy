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

WebUI.callTestCase(findTestCase('Bank Setup Default link/Bank_Setup_Default'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/a_Asset Classification'))

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/button_Create Asset Classification'))

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/div_'))

WebUI.click(findTestObject('Asset Classification Spy/Page_icon-app/li_NON PERFORMING'))

WebUI.click(findTestObject('Asset Classification Spy/Page_icon-app/div_sub_class_code'))

WebUI.click(findTestObject('Asset Classification Spy/Page_icon-app/li_Outdated'))

WebUI.setText(findTestObject('Object Repository/Asset Classification/Page_icon-app/input_Description_ant-input'), 'TOMMIE')

WebUI.click(findTestObject('Asset Classification Spy/Page_icon-app/div_module_id'))

WebUI.click(findTestObject('Asset Classification Spy/Page_icon-app/li_Charge Operations'))

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Loan Classifications is Created', false)

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/button_OA_table__btn ant-btn ant-btn-primar_3d8e06'))

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/a_Edit'))

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/button_Edit'))

WebUI.verifyTextPresent('Loan Classification is Updated', false)

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/button_OA_table__btn ant-btn ant-btn-primar_3d8e06'))

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/a_Delete'))

WebUI.click(findTestObject('Object Repository/Asset Classification/Page_icon-app/button_Yes'))

WebUI.verifyTextPresent('T is deleted', false)

WebUI.delay(2)

WebUI.closeBrowser()

