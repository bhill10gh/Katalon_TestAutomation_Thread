package search
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
import org.openqa.selenium.Keys as Keys

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



class SearchResultsPositive {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open Browser Goto Search Page (.*) for Search Results Positive")
	def OpenBrowserGotoSearchPage(String url) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(url)

		WebUI.maximizeWindow()
	}

	@When("Enter search (.*) for Search Results Positive")
	def EnterSearchKeyword(String keyword) {
		WebUI.click(findTestObject('Object Repository/Page_Search  Thread Travel/input_Search_site-search'))

		WebUI.setText(findTestObject('Object Repository/Page_Search  Thread Travel/input_Search_site-search'), keyword)
	}

	@And("Click search for Search Results Positive")
	def ClickSearch() {
		WebUI.click(findTestObject('Object Repository/Page_Search  Thread Travel/input_Search_site-search'))

		WebUI.sendKeys(findTestObject('Page_Search  Thread Travel/input_Search_site-search'), Keys.chord(Keys.ENTER))

		WebUI.delay(1)
	}

	@Then("Click QA Landing Page for Search Results Positive")
	def ClickQaLandingPage() {

		WebUI.click(findTestObject('Object Repository/Page_Search  Thread Travel/a_QA Landing Page Title'))

		WebUI.closeBrowser()
	}
}