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



class EventFiltersTopicCulturalImmersionCollapse {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Cultural Immersion Collapse I am viewing the Events Page (.*)")
	def I_am_viewing_the_Events_Page(String url) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(url)

		WebUI.maximizeWindow()
	}

	@When("Cultural Immersion Collapse I click into Topic Filter")
	def I_click_into_Topic_Filter() {
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/Events/button_Topics'), 200)
		WebUI.click(findTestObject('Object Repository/Events/button_Topics'))
	}

	@And("Cultural Immersion Collapse I select Topic = Cultural Immersion")
	def I_select_Topics_Equals_Cultural_Immersion() {
		TestObject obj = findTestObject('Object Repository/Events/label_Cultural Immersion(1)')
		WebUI.click(obj)
	}

	@And("Cultural Immersion Collapse  I collapse the Filter")
	def I_collapse_the_Filter () {
		WebUI.scrollToElement(findTestObject('Object Repository/Events/button_Topics'), -50)
		WebUI.click(findTestObject('Object Repository/Events/button_Topics'))
	}

	@Then("Cultural Immersion Collapse The number of results matches the count shown_1_Cnt")
	def I_verify_the_status_in_step() {
		TestObject obj = findTestObject('Object Repository/Events/button_Topics (1 Selected)')
		def text = WebUI.getText(obj)
		println("text = " + text)
		println("expected text = " + "Topics (1 Selected)")
		def isGood = WebUI.verifyMatch(text, "Topics (1 Selected)", false, FailureHandling.STOP_ON_FAILURE)
		if(!isGood) {
			KeywordUtil.markFailed("Content Type Text is not correct.")
		}

		WebUI.closeBrowser()
	}
}





