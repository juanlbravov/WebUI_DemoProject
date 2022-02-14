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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

'URL'
WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('01.Page_ToolsQA/00.DashboardAndMenuOptions/img'))

WebUI.waitForPageLoad(0)

'Menu Elements'
WebUI.click(findTestObject('01.Page_ToolsQA/00.DashboardAndMenuOptions/00_Dashboard/h5_Elements'))

'Elements-TextBox'
WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/01_span_Text Box'))

WebUI.verifyTextPresent('Text Box', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/label_Full Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/label_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/label_Current Address'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/label_Permanent Address'), 
    0)

WebUI.setText(findTestObject('01.Page_ToolsQA/01.Elements/01.TextBox/input_Full Name_userName'), 'FullName_userName_Text')

WebUI.setText(findTestObject('01.Page_ToolsQA/01.Elements/01.TextBox/input_Email_userEmail'), 'emailText@test.com')

WebUI.setText(findTestObject('01.Page_ToolsQA/01.Elements/01.TextBox/textarea_Current Address_currentAddress'), 'Current_Address_Text')

WebUI.setText(findTestObject('01.Page_ToolsQA/01.Elements/01.TextBox/textarea_Permanent Address_permanentAddress'), 'PermanentAddress_Text')

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/01.TextBox/button_Submit'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/01.TextBox/button_Submit'))

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/01.TextBox/div_Text Box'))

WebUI.verifyElementText(findTestObject('01.Page_ToolsQA/01.Elements/01.TextBox/div_Text Box'), 'Text Box')

WebUI.verifyElementVisible(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/div_NameEmailAddressPermanentAddress'))

WebUI.click(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/div_Submit'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/p_Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/p_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/p_Current Address'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/p_Permananet Address'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/01.Page_ToolsQA/01.Elements/01.TextBox/section_Submit_botton-text-10'), 
    0)

