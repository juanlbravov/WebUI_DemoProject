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

'Menu_Elements'
WebUI.click(findTestObject('01.Page_ToolsQA/00.DashboardAndMenuOptions/00_Dashboard/h5_Elements'))

'Opcion_Check_Box'
WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/00.MenuOptions/02_span_Check Box'))

'abrir tido flecha'
WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/02.CheckBox/EXPAND_CLOSE_svg_Book Store API_rct-icon rct-icon-expand-close'))

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/02.CheckBox/check_despues_de_Home'))

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/02.CheckBox/check_despues_de_Desktop'))

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/02.CheckBox/check_despues_de_Documentos'))

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/02.CheckBox/COLLAPSE_svg_Book Store API_rct-icon rct-icon-collapse-all'))

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/02.CheckBox/Home_rct-icon-check'))

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/02.CheckBox/EXPAND_rct-icon-expand-all'))

WebUI.click(findTestObject('01.Page_ToolsQA/01.Elements/02.CheckBox/Home_rct-icon-expand-close'))

