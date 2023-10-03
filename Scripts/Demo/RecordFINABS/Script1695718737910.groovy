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

WebUI.openBrowser('')
//
WebUI.navigateToUrl('http://appdev.kmn.kompas.com/fina/')

WebUI.click(findTestObject('Object Repository/Page_FINA/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login  FINA/input_User ID (email)_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Login  FINA/input_User ID (email)_Email'), 'novi@kompas.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  FINA/input_Password_Password'), 'cdvuquiGoW76zIMNxnw1cw==')

WebUI.click(findTestObject('Object Repository/Page_Login  FINA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_FINA/a_AP'))

WebUI.click(findTestObject('Object Repository/Page_FINA/a_BS Pre Payment'))

WebUI.click(findTestObject('Object Repository/Page_Pre Payment (BS)  FINA/a_BS-23.09.0001171'))

WebUI.click(findTestObject('Object Repository/Page_Pre Payment Detail  FINA/button_Action'))

WebUI.click(findTestObject('Object Repository/Page_Pre Payment Detail  FINA/a_Send'))

WebUI.click(findTestObject('Object Repository/Page_Pre Payment Detail  FINA/span_Ok'))

WebUI.closeBrowser()

