package contactUs
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



class ContactUsValidation {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open Browser Goto Contact Us Page (.*) for Contact Us Validation")
	def OpenBrowserGotoContactUsPage(String url) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(url)

		WebUI.maximizeWindow()

		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Page_Search  Thread Travel/Page_Home  Thread Travel/a_Contact Us') )
	}

	@When("Click Submit Bttn for Contact Us Validation")
	def ClickSubmitButton() {
		WebUI.delay(1)
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Search  Thread Travel/Page_Contact Us  Thread Travel/input_Message_fxbd1be240f-bef2-4b4a-9b62-f76915f3b42ec4164d41-2909-482c-9988-9896a5d0275e'), 200)

		WebUI.click(findTestObject('Object Repository/Page_Search  Thread Travel/Page_Contact Us  Thread Travel/input_Message_fxbd1be240f-bef2-4b4a-9b62-f76915f3b42ec4164d41-2909-482c-9988-9896a5d0275e'))
	}

	@Then("All fields fail validation")
	def AllFieldsFailValidation() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Search  Thread Travel/Contact Us/Page_Contact Us  Thread Travel/span_Email Address is a required field'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Search  Thread Travel/Contact Us/Page_Contact Us  Thread Travel/span_Message is a required field'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Search  Thread Travel/Contact Us/Page_Contact Us  Thread Travel/span_Name is a required field'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Search  Thread Travel/Contact Us/Page_Contact Us  Thread Travel/span_Subject is a required field'), 0)

		WebUI.closeBrowser()
	}
}