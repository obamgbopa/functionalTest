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

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/button_Pending Verification_ant-btn ant-btn-primary'))

WebUI.setText(findTestObject('searchFilter/spy/Page_icon-app/input_Product Code_ant-input'), 'PROD')

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('searchFilter/spy/Page_icon-app/input_Product Code_ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.setText(findTestObject('searchFilter/spy/Page_icon-app/input_Product Name_ant-input'), 'OFF')

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('searchFilter/spy/Page_icon-app/input_Product Name_ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/div_acc'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/li_CAPRE - ACCOUNT_NO'))

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/div_acc'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/Page_icon-app/svg_acc'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.setText(findTestObject('searchFilter/spy/Page_icon-app/input_Branch Code_ant-input'), '999')

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('searchFilter/spy/Page_icon-app/input_Branch Code_ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/div_currency'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/li_NGN'))

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/Page_icon-app/svg_curr'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/svg_spacer'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/button_Search_spacer'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/button_Select_spacer'))

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/Page_icon-app/input_Spacer Code_ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/svg_GL'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/button_Search_GL'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/button_Select_GL'))

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/Page_icon-app/input_GL Code_ant-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/div_acc (1)'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/li_PARTITION - Partition'))

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/Page_icon-app/svg_part'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/div_instrument'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/li_CHQ - CHEQUES'))

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/Page_icon-app/svg_instrument'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.click(findTestObject(null))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/div_prod'))

WebUI.click(findTestObject('searchFilter/spy/Page_icon-app/li_ACTIVE'))

WebUI.click(findTestObject('Object Repository/searchFilter/Page_icon-app/button_Search Product'))

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

