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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('01.Page_ToolsQA/00.DashboardAndMenuOptions/img'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/00.DashboardAndMenuOptions/00_Dashboard/h5_Elements'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/00.DashboardAndMenuOptions/00_Dashboard/h5_Elements'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/01_span_Text Box'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/01_span_Text Box'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/02_span_Check Box'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/02_span_Check Box'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/03_span_Radio Button'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/03_span_Radio Button'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/04_span_Web Tables'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/04_span_Web Tables'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/05_span_Buttons'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/05_span_Buttons'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/06_span_Links'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/06_span_Links'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/07_span_Broken Links - Images'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/07_span_Broken Links - Images'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/08_span_Upload and Download'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/08_span_Upload and Download'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/09_span_Dynamic Properties'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/09_span_Dynamic Properties'))

