package events
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



class EventFiltersRegionRemoveFilters {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Remove Filters I am viewing the Events Page (.*)")
	def I_am_viewing_the_Events_Page(String url) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(url)

		WebUI.maximizeWindow()
	}

	@And("Remove Filters I select Content Type = Region")
	def I_select_Content_Type_Equals_Region() {
		WebUI.scrollToElement(findTestObject('Object Repository/Events/Page_Events  Thread Travel/button_Content Type'), 200)
		WebUI.click(findTestObject('Object Repository/Events/Page_Events  Thread Travel/button_Content Type'))

		TestObject obj = findTestObject('Object Repository/Events/Page_Events  Thread Travel/label_Region(1)')
		WebUI.click(obj)

		WebUI.scrollToElement(findTestObject('Object Repository/Events/Page_Events  Thread Travel/button_Content Type'), -50)
		WebUI.click(findTestObject('Object Repository/Events/Page_Events  Thread Travel/button_Content Type'))
	}

	@When("Remove Filters I click into Content Type Filter")
	def I_click_into_Content_Type_Filter() {
		WebUI.click(findTestObject('Object Repository/Events/Page_Events  Thread Travel/button_Content Type'))
	}

	@And("Remove Filters I click on Clear All")
	def I_click_on_Clear_All() {
		WebUI.click(findTestObject('Object Repository/Events/Page_Events  Thread Travel/button_Clear All'))
	}

	@And("Remove Filters I collapse the Filter")
	def I_collapse_the_Filter() {
		WebUI.click(findTestObject('Object Repository/Events/Page_Events  Thread Travel/button_Content Type'))
	}

	@Then("Remove Filters The Filter displays Content Type")
	def The_Filter_displays_Content_Type() {
		TestObject obj = findTestObject('Object Repository/Events/Page_Events  Thread Travel/button_Content Type')
		def text = WebUI.getText(obj)
		WebUI.verifyMatch(text, "Content Type", false, FailureHandling.STOP_ON_FAILURE)

		WebUI.closeBrowser()
	}
}