import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil
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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev.graybox.velir.com/qa-automated-testing-folder/qa-search-page')

text = WebUI.getText(findTestObject('Page_Search  Thread Travel/strong_80'))

println ("text = " + text)

//WebUI.navigateToUrl('http://dev.graybox.velir.com/qa-automated-testing-folder/qa-search-page?contentType=Region&q=qa+landing+page&sortBy=relevance&sortOrder=asc&page=1&daterange')

text = WebUI.getText(findTestObject('Page_Search  Thread Travel/strong_80'))
intVal = text.isInteger() ? text.toInteger() : null

int upperSearchRange = 30
int lowerSearchRange = 31

if(intVal== null){
	KeywordUtil.markFailed('ERROR: Number of results is not a number')
   }

if(intVal >= upperSearchRange && intVal <= lowerSearchRange){
	KeywordUtil.markPassed('SUCCESS: The Results Matches the Pagination Results')
   }
else {
	KeywordUtil.markFailed('ERROR: Number of results is not between ' + lowerSearchRange + " and " + upperSearchRange)
   }

WebUI.closeBrowser()

