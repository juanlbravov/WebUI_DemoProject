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

WebUI.maximizeWindow()

'URL'
WebUI.navigateToUrl('https://demoqa.com/')

'Menu Elements'
WebUI.click(findTestObject('01.Page_ToolsQA/00.DashboardAndMenuOptions/00_Dashboard/h5_Elements'))

'Elements-TextBox'
WebUI.click(findTestObject('01_Widgets/01.Page_ToolsQA/02.Elements/01.TextBox/span_Text Box'))

WebUI.setText(findTestObject('01_Widgets/01.Page_ToolsQA/02.Elements/01.TextBox/input_Full Name_userName'), 'FullName_userName_Text')

WebUI.setText(findTestObject('01_Widgets/01.Page_ToolsQA/02.Elements/01.TextBox/input_Email_userEmail'), 'emailText@test.com')

WebUI.setText(findTestObject('01_Widgets/01.Page_ToolsQA/02.Elements/01.TextBox/textarea_Current Address_currentAddress'), 
    'Current_Address_Text')

WebUI.setText(findTestObject('01_Widgets/01.Page_ToolsQA/02.Elements/01.TextBox/textarea_Permanent Address_permanentAddress'), 
    'PermanentAddress_Text')

WebUI.scrollToElement(findTestObject('01_Widgets/01.Page_ToolsQA/02.Elements/01.TextBox/button_Submit'), 0)

WebUI.click(findTestObject('01_Widgets/01.Page_ToolsQA/02.Elements/01.TextBox/button_Submit'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 'Text Box')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/elements')

WebUI.click(findTestObject('00.Delete/01.DashboardAndMenuOptions/span_Text Box'))

WebUI.click(findTestObject('00.Delete/01.DashboardAndMenuOptions/02_span_Check Box'))

WebUI.click(findTestObject('00.Delete/01.DashboardAndMenuOptions/03_span_Radio Button'))

WebUI.click(findTestObject('00.Delete/01.DashboardAndMenuOptions/04_span_Web Tables'))

WebUI.click(findTestObject('00.Delete/01.DashboardAndMenuOptions/05_span_Buttons'))

WebUI.click(findTestObject('00.Delete/01.DashboardAndMenuOptions/06_span_Links'))

WebUI.click(findTestObject('00.Delete/01.DashboardAndMenuOptions/07_span_Broken Links - Images'))

WebUI.click(findTestObject('00.Delete/01.DashboardAndMenuOptions/08_span_Upload and Download'))

WebUI.click(findTestObject('00.Delete/01.DashboardAndMenuOptions/09_span_Dynamic Properties'))

WebUI.closeBrowser()

