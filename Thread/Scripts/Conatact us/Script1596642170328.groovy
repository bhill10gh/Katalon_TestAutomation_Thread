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

WebUI.navigateToUrl('http://dev.graybox.velir.com/')

WebUI.click(findTestObject('Object Repository/Page_Home  Thread Travel/a_Contact Us'))

WebUI.setText(findTestObject('Object Repository/Page_Contact Us  Thread Travel/input_Name_fxbd1be240f-bef2-4b4a-9b62-f7691_6c6710'), 
    'Barry')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us  Thread Travel/input_Email Address_fxbd1be240f-bef2-4b4a-9_25b8f7'), 
    'a@b.com')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us  Thread Travel/input_Subject_fxbd1be240f-bef2-4b4a-9b62-f7_f8362c'), 
    'sdfasfasf')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us  Thread Travel/textarea_Message_fxbd1be240f-bef2-4b4a-9b62_6db607'), 
    'dfasdfsdf')

WebUI.click(findTestObject('Object Repository/Page_Contact Us  Thread Travel/input_Message_fxbd1be240f-bef2-4b4a-9b62-f7_46fc09'))

WebUI.rightClick(findTestObject('Object Repository/Page_Contact Us  Thread Travel/p_Thank you for contacting us Well get back_3b7515'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us  Thread Travel/div_Contact Us      Thank you for contactin_9f1f5f'))

