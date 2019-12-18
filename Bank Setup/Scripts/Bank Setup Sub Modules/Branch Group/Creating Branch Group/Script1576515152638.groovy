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

WebUI.callTestCase(findTestCase('Bank Setup Default link/Bank_Setup_Default'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Creating and Deleting Branch Group/Page_icon-app/a_Branch Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Creating and Deleting Branch Group/Page_icon-app/button_Add Branch Group'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_icon-app/div_'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Branch Group/Page_icon-app/li_104 - SOUTHWEST REGION'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Bank setup spy/Page_icon-app/div_branch_code_new'))

WebUI.click(findTestObject('Branch Group/Page_icon-app/li_093 - DOCEMO'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Branch Group/Page_icon-app/li_094 - NAVY TOWNMAMMY MKT'))

WebUI.click(findTestObject('Object Repository/Creating and Deleting Branch Group/Page_icon-app/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

