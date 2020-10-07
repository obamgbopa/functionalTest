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
import org.openqa.selenium.Keys as Keys
import java.util.Random as Random

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('createDDA/Page_icon-app/button_Demand Draft Account'))

WebUI.setText(findTestObject('createDDA/Page_icon-app/input_Product Code_ant-input'), 'Test123')

WebUI.setText(findTestObject('createDDA/Page_icon-app/input_Account Name_ant-input'), 'YANNI' + String.valueOf(randomNum))

WebUI.click(findTestObject('createDDA/Page_icon-app/svg_branch'))

WebUI.click(findTestObject('createDDA/Page_icon-app/button_Search'))

WebUI.click(findTestObject('createDDA/Page_icon-app/button_Select'))

WebUI.click(findTestObject('createDDA/Page_icon-app/div_GL'))

WebUI.click(findTestObject('createDDA/Page_icon-app/li_45960 - CASHEX SETTLEMENT'))

WebUI.click(findTestObject('createDDA/Page_icon-app/div_spacer'))

WebUI.click(findTestObject('createDDA/Page_icon-app/li_5050011007 - OVERDUE INTEREST PAYABLE HOC'))

WebUI.click(findTestObject('createDDA/Page_icon-app/div_mis'))

WebUI.click(findTestObject('createDDA/Page_icon-app/li_MIS_01'))

WebUI.click(findTestObject('createDDA/Page_icon-app/div_Currency Limits Details'))

WebUI.click(findTestObject('createDDA/Page_icon-app/div_curr'))

WebUI.click(findTestObject('createDDA/Page_icon-app/li_NGN - NGN'))

WebUI.click(findTestObject('createDDA/Page_icon-app/div_Free Codes'))

WebUI.setText(findTestObject('createDDA/Page_icon-app/input_BIOLA CODE_ant-input'), 'FREE' + String.valueOf(randomNum))

WebUI.setText(findTestObject('createDDA/Page_icon-app/input_HENRYFREE_ant-input'), 'CODES' + String.valueOf(randomNum))

WebUI.click(findTestObject('createDDA/Page_icon-app/button_CREATE DEMAND DRAFT ACCOUNT'))

WebUI.click(findTestObject('createDDA/Page_icon-app/button_Yes'))

WebUI.verifyTextPresent('Created', false)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

