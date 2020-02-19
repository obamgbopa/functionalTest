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

int num = GlobalVariable.num

Random rnd = new Random()

randomNum = rnd.nextInt(10 ** num)

WebUI.callTestCase(findTestCase('Bank Setup Default link/Bank_Setup_Default'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/a_Document'))

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/button_Create Document'))

WebUI.setText(findTestObject('Document Spy/Page_icon-app/input_Code_ant-input'), 'DOC' + String.valueOf(randomNum))

WebUI.setText(findTestObject('Document Spy/Page_icon-app/input_Description_ant-input'), 'TESTING')

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/li_CERT - CERTIFICATES'))

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Document Code is Created', false)

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/button_CERT_table__btn ant-btn ant-btn-prim_fc48e0'))

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/a_ Edit'))

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/button_Edit'))

WebUI.verifyTextPresent('Document Code is Updated', false)

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/button_CERT_table__btn ant-btn ant-btn-prim_fc48e0'))

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('Object Repository/Document/Page_icon-app/button_Yes'))

WebUI.verifyTextPresent(('DOC' + String.valueOf(randomNum)) + ' is Deleted', false)

WebUI.delay(1)

WebUI.closeBrowser()

