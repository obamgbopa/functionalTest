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

WebUI.callTestCase(findTestCase('LOGIN_APPROVE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/spy/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/spy/Page_icon-app/span_User Management'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/a_Employees'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/div_Pending Authorizations'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/button_No data_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/svg'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/div_CREATE_EMPLOYEE'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/li_Update employee record'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/button_Search Request'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/button_update_table__btn ant-btn ant-btn-primary'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/button_Reject1'))

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/textarea_Reason_ant-input'), 
    'JUST FOR TEXT')

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/editEmployeeOR/approveUpdateEmployeeOR/Page_icon-app/button_Reject2'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

