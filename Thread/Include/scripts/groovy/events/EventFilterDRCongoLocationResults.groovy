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



class EventFilterDRCongoLocationResults {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("DR Congo Location Results I am viewing the Events Page (.*)")
	def I_am_viewing_the_Events_Page(String url) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(url)

		WebUI.maximizeWindow()
	}

	@When("DR Congo Location Results I click into Location Filter")
	def I_click_into_Location_Filter() {
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/Events/button_Locations'), 200)
		WebUI.click(findTestObject('Object Repository/Events/button_Locations'))
	}

	@And("DR Congo Location Results I select Location = DR Congo")
	def I_select_Location_Equals_DR_Congo() {
		TestObject obj = findTestObject('Object Repository/Events/label_DR Congo(1)')
		WebUI.click(obj)

		WebUI.scrollToElement(findTestObject('Object Repository/Events/button_Locations'), -50)
		WebUI.click(findTestObject('Object Repository/Events/button_Locations'))
		WebUI.delay(2)
	}

	@Then("DR Congo Location Results Have Location = DR Congo")
	def I_verify_the_status_in_step() {
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='list-item is-right is-visible']"))
		println("Results Count = " + elements.size())

		if(elements.size() != 1) {
			KeywordUtil.markFailedAndStop("DR Congo does not have only one result.")
		}

		WebUI.closeBrowser()
	}
}