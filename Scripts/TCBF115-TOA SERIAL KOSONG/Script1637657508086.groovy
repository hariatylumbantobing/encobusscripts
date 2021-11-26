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

WebUI.callTestCase(findTestCase('TCBF101-LOGIN SUCCESS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HOME PAGE/svg_slider dashboard'))

WebUI.click(findTestObject('READER PAGE/span_menu Reader'))

WebUI.verifyElementPresent(findTestObject('READER PAGE/span_tombol TOA'), 2)
WebUI.verifyElementPresent(findTestObject('READER PAGE/span_tombol TOB'), 2)
WebUI.verifyElementPresent(findTestObject('READER PAGE/input_field Serial Number'), 2)
WebUI.click(findTestObject('READER PAGE/span_tombol Input Reader'))

WebUI.verifyElementPresent(findTestObject('READER PAGE/span_alert TOATOB Tidak Boleh Kosong'),2)
WebUI.verifyElementPresent(findTestObject('READER PAGE/span_alert harus 8 digit angka'),2)

WebUI.closeBrowser()