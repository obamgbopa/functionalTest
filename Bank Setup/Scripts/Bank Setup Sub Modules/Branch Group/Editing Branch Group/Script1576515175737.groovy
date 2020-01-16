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

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/a_Branch Group'))

WebUI.setText(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/input_Add Branch Group_ant-input'), 
    '104')

WebUI.click(findTestObject('Branch Group Edit Spy/Page_icon-app/button_Add Branch Group_ant-btn ant-btn-primary ant-input-search-button'))

WebUI.click(findTestObject('Branch Group Edit Spy/Page_icon-app/button_Branch Group Code_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/a_ Edit'))

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/button_Add Branch'))

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/div_'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/li_095 - OGBAWEMPCO ROAD'))

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/li_096 - OKOTAAGO PALACEWAY'))

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/li_097 - OSHODIOLUPESI HOUSE'))

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/li_098 - VISLAND SAKA TINUBU'))

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/li_091 - ONIKANCITY MALL'))

WebUI.click(findTestObject('Object Repository/Branch Group/Branch Group Edit/Page_icon-app/li_143 - VISLAND-5'))

WebUI.click(findTestObject('Branch Group Edit Spy/Page_icon-app/button_Add Branch_last'))

WebUI.verifyTextPresent('Branch is added', false)

WebUI.delay(2)

WebUI.closeBrowser()

