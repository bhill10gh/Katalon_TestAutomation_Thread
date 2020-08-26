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



class EventFiltersTopicCulturalImmersionResults {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Cultural Immersion Results I am viewing the Events Page (.*)")
	def I_am_viewing_the_Events_Page(String url) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(url)

		WebUI.maximizeWindow()
	}


	@When("Cultural Immersion Results I click into Topic Filter")
	def I_click_into_Topic_Filter() {
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/Events/button_Topics'), 200)
		WebUI.click(findTestObject('Object Repository/Events/button_Topics'))
	}

	@And("Cultural Immersion Results I view the number of results shown in the Topics_1_Cnt")
	def I_view_the_number_of_results_shown_in_the_Topis_dropdown_1_Cnt() {
		TestObject obj = findTestObject('Object Repository/Events/label_Cultural Immersion(1)')
		def text = WebUI.getText(obj)
		println("text = " + text)
		println("expected text = " + "Cultural Immersion(1)")
		WebUI.verifyMatch(text, "Cultural Immersion (1)", false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("Cultural Immersion Results I select Topic = Cultural Immersion")
	def I_select_Topics_Equals_Cultural_Immersion() {
		TestObject obj = findTestObject('Object Repository/Events/label_Cultural Immersion(1)')
		WebUI.click(obj)
	}

	@Then("Cultural Immersion Results The number of results matches the count shown_1_Cnt")
	def I_verify_the_status_in_step() {
		WebUI.click(findTestObject('Object Repository/Events/button_Topics'))
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> elements = driver.findElements(By.className("list-item is-right is-visible"))
		println("Results Count = " + elements.size())
		if(elements.size() != 1) {
			KeywordUtil.markFailed("Topic Cultural Immersion does not only contain 1 result.")
		}

		WebUI.closeBrowser()
	}
}