import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.util.Random as Random

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/a_Branch_aside__toggler_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/span_Office Account'))

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_Create Account'))

WebUI.delay(3)

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/input_Product Code_ant-input'))

WebUI.verifyElementPresent(findTestObject('OfficeAccount/CreateOfficeAccount/svg'), 3)

WebUI.waitForElementClickable(findTestObject('OfficeAccount/CreateOfficeAccount/svg'), 3)

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/svg (1)'))

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Product Code_ant-input_search'), 'tom99')

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_Search (1)'))

WebUI.waitForElementPresent(findTestObject('OfficeAccount/CreateOfficeAccount/button_Select---'), 3)

WebUI.waitForElementClickable(findTestObject('OfficeAccount/CreateOfficeAccount/button_Select---'), 3)

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_Select---'))

not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Account Number_ant-input'), '20879056473')

// WebUI.setText(findTestObject('user_page/xpaths/employeeID'), 'LBT' + String.valueOf(randomNum))
WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Account Name_ant-input (1)'), 'Ogbeni' + String.valueOf(
        randomNum))

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/branch_code'))

WebUI.delay(3)

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/li_999 - HBC HEAD OFFICE'))

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/currency'))

WebUI.delay(1)

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/li_NGN - NGN__'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/input_Spacer Code_ant-input'))

not_run: WebUI.sendKeys(findTestObject('OfficeAccount/CreateOfficeAccount/input_Spacer Code_ant-input'), Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_Search_spacer'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_Select_spacer'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/li_100010 - INTEREST PAYABLE__'))

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/Gl_sub_category'))

WebUI.delay(1)

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/li_45000 - COMMISSIONBROKERAGE SUSPENSE'))

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/MIS_code'))

WebUI.delay(1)

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/li_MIS_01'))

WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/li_MIS_02'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/freeze_type'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/li_CREDIT'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/freeze_reason'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/li_BVN'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/input_Freeze Start Date_ant-calendar-picker-input ant-input'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/date'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_Transfer from Other Branches_ant-switch'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_System Only Transaction_ant-switch'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_Non Partition'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/partition_Item'))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/li_CUSTOMER_ID'))

// WebUI.setText(findTestObject('user_page/xpaths/employeeID'), 'LBT' + String.valueOf(randomNum))
not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/textarea_Remarks_ant-input'), 'FOR TESTING PURPOSE' + 
    String.valueOf(randomNum))

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_Next'))

// WebUI.setText(findTestObject('user_page/xpaths/phone'), CustomKeywords.'randomData.TestDataGenerator.set_RandomNumber'(11))
not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Credit Balance Limit'), '700000000' + randomNum)

not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Credit Cash Limit'), '700000000' + randomNum)

not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Credit Clearing Limit'), '90000000' + randomNum)

not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Credit Transfer Limit'), '500000000' + randomNum)

not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Debit Balance Limit'), '99999999999' + randomNum)

not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Debit Cash Limit'), '800000000' + randomNum)

not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Debit Clearing Limit'), '70000000' + randomNum)

not_run: WebUI.setText(findTestObject('OfficeAccount/CreateOfficeAccount/input_Debit Transfer Limit'), '50000000' + randomNum)

not_run: WebUI.click(findTestObject('OfficeAccount/CreateOfficeAccount/button_Submit'))

not_run: WebUI.closeBrowser()

