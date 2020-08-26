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

WebUI.callTestCase(findTestCase('Common Test Cases/Open Url'), [('URL') : 'http://dev.graybox.velir.com/'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home  Thread Travel/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Log In  Thread Travel/input_Email Address_fxbac2bf0ba-853c-4d4b-8_d45a66'), 
    Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log In  Thread Travel/input_Password_fxbac2bf0ba-853c-4d4b-8412-1_c3446d'), 
    Password)

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Page_Log In  Thread Travel/input_Password_fxbac2bf0ba-853c-4d4b-8412-1_88fb55'), 100)

WebUI.click(findTestObject('Page_Log In  Thread Travel/input_Password_fxbac2bf0ba-853c-4d4b-8412-1_88fb55'))

WebUI.delay(2)

WebUI.getText(findTestObject('Page_Home Thread Travel - Login/Page_Log In  Thread Travel/li_Invalid credentials Please try again'))

