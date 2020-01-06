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

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/a_Account Officer'))

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/button_Add Account Officer'))

WebUI.setText(findTestObject('Object Repository/Account Officer/Page_icon-app/input_Officer Code_ant-input'), '9909')

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/div_'))

WebUI.click(findTestObject('Account Officer Spy/Page_icon-app/Page_icon-app/li_QA01 - SM'))

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/button_Submit'))

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/button_EMPLOYEE_02_table__btn ant-btn ant-b_fd627e'))

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/a_ Edit'))

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/button_Edit'))

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/button_EMPLOYEE_02_table__btn ant-btn ant-b_fd627e'))

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('Object Repository/Account Officer/Page_icon-app/button_Yes'))

WebUI.closeBrowser()

