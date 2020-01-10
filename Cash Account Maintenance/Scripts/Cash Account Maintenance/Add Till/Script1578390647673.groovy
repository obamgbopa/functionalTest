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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/span_Cash Account Maintenance'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/button_ADD TILL'))

WebUI.setText(findTestObject('Object Repository/Add Till/Page_icon-app/input_Till ID_ant-input'), 'LBT' + String.valueOf(randomNum))

//GlobalVariable.tillExist = WebUI.getText(findTestObject('Object Repository/Add Till/Page_icon-app/input_Till ID_ant-input'))
WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/svg'))

WebUI.setText(findTestObject('Add Till Spy/Page_icon-app/input_Branch Code_ant-input'), '999')

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/button_Select'))

WebUI.verifyTextPresent('Employee Details Fetched Successfully', false)

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/li_PET003 - VAULT PETER'))

WebUI.verifyTextPresent('Employee Details Fetched Successfully', false)

WebUI.click(findTestObject('Add Till Spy/Page_icon-app/div_currency'))

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/svg_1'))

WebUI.click(findTestObject('Add Till Spy/Page_icon-app/button_Search_2'))

WebUI.click(findTestObject('Add Till Spy/Page_icon-app/button_Select_2'))

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Add Till Spy/Page_icon-app/button_ADD TILL_2'))

WebUI.click(findTestObject('Object Repository/Add Till/Page_icon-app/button_Yes'))

WebUI.verifyTextPresent('', false)

WebUI.setText(findTestObject('View Till/Page_icon-app/input_ADD TILL_ant-input'), 'LBT' + String.valueOf(randomNum))

WebUI.verifyTextPresent('LBT' + String.valueOf(randomNum), false)

WebUI.delay(2)

//println(GlobalVariable.tillExist)
WebUI.closeBrowser()

