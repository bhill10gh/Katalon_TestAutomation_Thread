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



class SearchFacetingNegative {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open Browser Goto Search Page (.*) for  Search Faceting – Negative")
	def OpenBrowserGotoSearchPage(String url) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(url)

		WebUI.maximizeWindow()
	}

	@When("Click Topics Facet Menu for  Search Faceting – Negative")
	def ClickTopics() {
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Search  Thread Travel/Page_Search  Thread Travel/Page_Search  Thread Travel/div_Topics'), 200)
		WebUI.click(findTestObject('Object Repository/Page_Search  Thread Travel/Page_Search  Thread Travel/Page_Search  Thread Travel/div_Topics'))
	}

	@And("Click Facet Food for  Search Faceting – Negative")
	def ClickFood() {

		WebUI.click(findTestObject('Object Repository/Page_Search  Thread Travel/Page_Search  Thread Travel/Page_Search  Thread Travel/Page_Search  Thread Travel/input_Hiking and Outdoor(12)_Food'))
	}

	@Then("Click QA Landing Page for  Search Faceting – Negative")
	def ClickQaLandingPage() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Search  Thread Travel/a_QA Landing Page Title'), 0)

		WebUI.closeBrowser()
	}
}