import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev.graybox.velir.com/qa-automated-testing-folder/qa-search-page?contentType=Region&q=qa+landing+page&sortBy=relevance&sortOrder=asc&page=1&daterange')

WebUI.click(findTestObject('Page_Search  Thread Travel/section_HomeSearch            Search       _b51e11'))

WebUI.setText(findTestObject('Page_Search  Thread Travel/input_Search_site-search (1)'), 
    'Landing Page')

WebUI.sendKeys(findTestObject('Page_Search  Thread Travel/input_Search_site-search (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Search  Thread Travel/div_HomeSearch            Search          S_83a32a'))

WebUI.setText(findTestObject('Page_Search  Thread Travel/input_Search_site-search (1)'), 
    'Page')

WebUI.sendKeys(findTestObject('Page_Search  Thread Travel/input_Search_site-search (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Search  Thread Travel/input_Search_site-search (1)'))

WebUI.setText(findTestObject('Page_Search  Thread Travel/input_Search_site-search (1)'), 
    '')

WebUI.click(findTestObject('Page_Search  Thread Travel/input_Clear_Region'))

WebUI.click(findTestObject('Page_Search  Thread Travel/button_Content Type'))

WebUI.click(findTestObject('Page_Search  Thread Travel/strong_80'))

WebUI.click(findTestObject('Page_Search  Thread Travel/strong_1 - 8'))

WebUI.closeBrowser()

