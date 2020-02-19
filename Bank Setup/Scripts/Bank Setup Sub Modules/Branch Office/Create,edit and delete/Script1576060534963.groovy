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

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/a_Branch Office'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/button_Add Branch'))

WebUI.setText(findTestObject('Object Repository/Branch Office/Page_icon-app/input_Code_ant-input'), 'BOF' + String.valueOf(
        randomNum))

WebUI.setText(findTestObject('Branch Office Spy/Page_icon-app/input_Name_ant-input'), 'TOMMIE EXCLUSIVE')

WebUI.setText(findTestObject('Branch Office Spy/Page_icon-app/input_Short Name_ant-input'), 'TOM TOM')

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/input_Opening Date_ant-calendar-picker-inpu_f91034'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/div_16'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/Page_icon-app/div_region'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/li_EAST - null'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/Page_icon-app/div_sub_region'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/li_NORTH_CENTRAL - NORTH CENTRAL'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/Page_icon-app/div_country'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/li_NIGERIA'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/Page_icon-app/div_state'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/li_LAGOS'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/Page_icon-app/div_city'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/li_OSHODI'))

WebUI.setText(findTestObject('Branch Office Spy/Page_icon-app/input_Address_ant-input'), 'OSHODI-LAGOS')

WebUI.setText(findTestObject('Branch Office Spy/Page_icon-app/input_Phone Number_ant-input'), '708 9329 625')

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/Page_icon-app/div_LOB'))

not_run: WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/li_COST_CENTER - null'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/li_CSC - COST CENTER'))

not_run: WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/li_PRC - PROFIT CENTER'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/li_PROFIT_CENTER - null'))

not_run: WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/li_SOL - null'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/div_Transaction Details'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/button_1'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/button_3'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/button_4'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/button_2'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/button_5'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/button_6'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/div_Clearing Details'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/div_Payment System Details'))

WebUI.setText(findTestObject('Branch Office Spy/Page_icon-app/input_BKE Arrangement_ant-input'), '1908765')

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/div_EOD Details'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/div_branch_eod'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/li_CUTOFF - CUT OFF'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Bank Branch is Created', false)

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/button_Cash Transaction allowed_ant-switch'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/a_ Edit'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/div_city_edit'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/li_APAPA_edit'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/button_Submit_edit'))

WebUI.verifyTextPresent('Bank Branch is Updated', false)

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/button_Cash Transaction allowed_ant-switch'))

WebUI.click(findTestObject('Branch Office Spy/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('Object Repository/Branch Office/Page_icon-app/button_Yes'))

WebUI.verifyTextPresent(('BOF' + String.valueOf(randomNum)) + ' is deleted', false)

WebUI.delay(2)

WebUI.closeBrowser()

