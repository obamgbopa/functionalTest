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

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/spy/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/spy/Page_icon-app/span_User Management'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/editRolesOR/Page_icon-app/a_Roles'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/editRolesOR/Page_icon-app/button_Pending Authorizations_ant-btn ant-b_3a46fa'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/editRolesOR/Page_icon-app/button_ROLEES DESCRIPTION_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/editRolesOR/Page_icon-app/a_Edit'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/editRolesOR/spy/Page_icon-app/button_Bank account master_table__btn ant-btn ant-btn-primary'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/editRolesOR/spy/Page_icon-app/input_Permission_ant-checkbox-input'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/editRolesOR/spy/Page_icon-app/button_to Add'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/editRolesOR/spy/Page_icon-app/button_Update'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

