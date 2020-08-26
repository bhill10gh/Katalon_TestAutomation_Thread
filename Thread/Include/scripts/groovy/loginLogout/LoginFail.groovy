package loginLogout
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



class LoginFail {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open browser and goto url: (.*) for Login Fail")
	def OpenBrowserGotoUrl(String url) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(url)

		WebUI.maximizeWindow()

		WebUI.delay(2)
	}

	@When("Click Login Link for Login Fail")
	def ClickLoginLink() {
		WebUI.click(findTestObject('Object Repository/Page_Home  Thread Travel/a_Login'))
	}

	@And("Enter Username as (.*) and Password as (.*) for Login Fail")
	def EnterUsernamePassword(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Log In  Thread Travel/input_Email Address_fxbac2bf0ba-853c-4d4b-8_d45a66'),
				username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log In  Thread Travel/input_Password_fxbac2bf0ba-853c-4d4b-8412-1_c3446d'),
				password)
	}

	@And("Click Login button for Login Fail")
	def ClickLoginButton() {
		WebUI.scrollToElement(findTestObject('Page_Log In  Thread Travel/input_Password_fxbac2bf0ba-853c-4d4b-8412-1_88fb55'), 50)
		WebUI.click(findTestObject('Page_Log In  Thread Travel/input_Password_fxbac2bf0ba-853c-4d4b-8412-1_88fb55'))
	}

	@Then("Verify Login Failed for Login Fail")
	def VerifyLogoutLink() {
		WebUI.delay(2)

		WebUI.getText(findTestObject('Page_Home Thread Travel - Login/Page_Log In  Thread Travel/li_Invalid credentials Please try again'))

		WebUI.closeBrowser()
	}
}