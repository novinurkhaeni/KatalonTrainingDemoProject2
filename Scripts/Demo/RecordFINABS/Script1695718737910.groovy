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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://appdev.kmn.kompas.com/fina/')

WebUI.click(findTestObject('Object Repository/Page_FINA/span_Workstate Type_glyphicon glyphicon-user hidden-xs'))

WebUI.setText(findTestObject('Object Repository/Page_Login  FINA/input_User ID (email)_Email'), 'novi@kompas.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  FINA/input_Password_Password'), 'cdvuquiGoW76zIMNxnw1cw==')

WebUI.click(findTestObject('Object Repository/Page_Login  FINA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_FINA/a_AP'))

WebUI.click(findTestObject('Object Repository/Page_FINA/a_BS Pre Payment'))

WebUI.click(findTestObject('Object Repository/Page_Pre Payment (BS)  FINA/button_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New Pre Payment  FINA/select_(select)BS DLK DLNBS ProyekBS Standa_fc4fb0'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New Pre Payment  FINA/select_(select)COMP 06-12FINA PTGSS PTGSS P_43a7fb'), 
    '17', true)

WebUI.click(findTestObject('Object Repository/Page_New Pre Payment  FINA/span_(select)'))

WebUI.setText(findTestObject('Object Repository/Page_New Pre Payment  FINA/input_concat(id(, , select2-Requestor-resul_e6737b'), 
    'novi')

WebUI.sendKeys(findTestObject('Page_New Pre Payment  FINA/input_concat(id(, , select2-Requestor-resul_e6737b'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_New Pre Payment  FINA/div_Pay To                                 _30e52f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New Pre Payment  FINA/select_(select)                            _94f9f5'), 
    'E', true)

WebUI.click(findTestObject('Object Repository/Page_New Pre Payment  FINA/span_(select)_1'))

WebUI.setText(findTestObject('Object Repository/Page_New Pre Payment  FINA/input_concat(id(, , select2-Requestor-resul_e6737b'), 
    'novi')

WebUI.sendKeys(findTestObject('Page_New Pre Payment  FINA/input_concat(id(, , select2-Requestor-resul_e6737b'), Keys.chord(
	Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_New Pre Payment  FINA/input_Amount_Obj.Amount'), '100000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New Pre Payment  FINA/select_(select)BT - Bank TransferCash - Cas_0ef79d'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New Pre Payment  FINA/select_(select)BT - Bank TransferCash - Cas_0ef79d'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New Pre Payment  FINA/select_(select)CashCounterWiwikCashier Coll_8d5d48'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_New Pre Payment  FINA/button_Save'))

WebUI.closeBrowser()

