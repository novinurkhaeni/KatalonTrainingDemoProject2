import cucumber.api.PendingException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
		println "I am inside login page"
	}
	
	@When("user enters (.*) and (.*)")
	public void user_enters_true_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'), username)
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Password_password'), password)
		println "I enters true username & password"
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		WebUI.click(findTestObject('Page_OrangeHRM/button_login'))
		println "I click login button"
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/h6_Dashboard'), 'Dashboard')
		WebUI.closeBrowser()
		println "I am inside home page"
	}
	
	@When("user enters wrong (.*) and (.*)")
	public void user_enters_wrong_username_and_password(String username, String password) {
		println "I enters wrong username & password"
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'), username)
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Password_password'), password)
	}
	
}
