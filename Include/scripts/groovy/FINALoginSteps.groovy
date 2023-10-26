import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class FINALoginSteps {
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://appdev.kmn.kompas.com/fina/')
		println "I am inside homepage"
	}

	@Given("I should see login link")
	public void i_should_see_login_link() {
		WebUI.verifyElementPresent(findTestObject('Page_FINA/a_Login'), 3)
		println "I see login link"
	}

	@When("I follow login link")
	public void i_follow_login_link() {
		WebUI.click(findTestObject('Object Repository/Page_FINA/a_Login'))
		println "I click login link"
	}

	@When("I fill email address with (.*)")
	public void i_fill_email_address_with_true_email(String email) {
		WebUI.setText(findTestObject('Object Repository/Page_Login  FINA/input_User ID (email)_Email'), email)
		println "I fill email address"
	}

	@When("I fill password with (.*)")
	public void i_fill_password_with_kompas(String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Login  FINA/input_Password_Password'), password)
		println "I fill password"
	}

	@When("I click login button")
	public void i_click_login_button() {
		WebUI.click(findTestObject('Object Repository/Page_Login  FINA/button_Login'))
		println "I click login button"
	}

	@Then("I should see profile menu")
	public void i_should_see_profile_menu() {
		WebUI.verifyElementPresent(findTestObject('Page_FINA/span_Workstate Type_glyphicon glyphicon-user hidden-xs'), 3)
		println "I see profile menu"
	}

	@Then("I should see profile link")
	public void i_should_see_profile_link() {
		WebUI.verifyElementClickable(findTestObject('Page_FINA/a_My Profile'), FailureHandling.STOP_ON_FAILURE)
		println "I click profile"
	}

	@Then("I should not see login link")
	public void i_should_not_see_login_link() {
		WebUI.verifyElementNotPresent(findTestObject('Page_FINA/a_Login'), 3)
		WebUI.closeBrowser()
		println "I can't see login link"
	}

	@When("I fill email address with wrong email (.*)")
	public void i_fill_email_address_with_wrong_email(String email) {
		WebUI.setText(findTestObject('Object Repository/Page_Login  FINA/input_User ID (email)_Email'), email)
		println "I fill wrong email/password"
	}
}