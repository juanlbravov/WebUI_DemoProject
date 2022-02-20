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

WebUI.navigateToUrl(GlobalVariable.URL_QA)

WebUI.waitForPageLoad(0)

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/00.DashboardAndMenuOptions/00_Dashboard/h5_Forms'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/00.DashboardAndMenuOptions/00_Dashboard/h5_Forms'))

WebUI.verifyElementPresent(findTestObject('01.Page_ToolsQA/02.Forms/div_main-header_Forms'), 0)

WebUI.verifyElementPresent(findTestObject('01.Page_ToolsQA/02.Forms/div_Select_ItemToStart'), 0)

WebUI.click(findTestObject('01.Page_ToolsQA/02.Forms/li_btn-light_Practice Form'))

WebUI.verifyElementNotPresent(findTestObject('01.Page_ToolsQA/02.Forms/div_Select_ItemToStart'), 0)

WebUI.verifyElementVisible(findTestObject('01.Page_ToolsQA/02.Forms/h5_StudentRegistrationForm'))

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/02.Forms/checkbox_hobbies_Sports'), 0)

WebUI.setText(findTestObject('01.Page_ToolsQA/02.Forms/input_firstName'), 'FirstName')

WebUI.setText(findTestObject('01.Page_ToolsQA/02.Forms/input_lastName'), 'LastName')

WebUI.setText(findTestObject('01.Page_ToolsQA/02.Forms/input_Email'), 'email@test.corp')

WebUI.check(findTestObject('01.Page_ToolsQA/02.Forms/input_gender-radio_Male'))

WebUI.setText(findTestObject('01.Page_ToolsQA/02.Forms/input_MobileNumber'), '1234567890')

WebUI.click(findTestObject('01.Page_ToolsQA/02.Forms/div_input_dateOfBirth'))

WebUI.selectOptionByValue(findTestObject('01.Page_ToolsQA/02.Forms/div_input_dateOfBirth_2Year'), '1970', false)

WebUI.selectOptionByIndex(findTestObject('01.Page_ToolsQA/02.Forms/div_input_dateOfBirth_1Mounth'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01.Page_ToolsQA/02.Forms/div_input_dateOfBirth_3day24'))

WebUI.setText(findTestObject('01.Page_ToolsQA/02.Forms/input_subjects'), 'subjectsInput')

WebUI.scrollToElement(findTestObject('01.Page_ToolsQA/02.Forms/checkbox_hobbies_Sports'), 0)

WebUI.check(findTestObject('01.Page_ToolsQA/02.Forms/checkbox_hobbies_Sports'))

WebUI.check(findTestObject('01.Page_ToolsQA/02.Forms/checkbox_hobbies_Reading'))

WebUI.check(findTestObject('01.Page_ToolsQA/02.Forms/checkbox_hobbies_Music'))

WebUI.uploadFile(findTestObject('01.Page_ToolsQA/02.Forms/uploadFile_uploadPicture'), 'C:\\Workspace\\Github\\Katalon\\WebUI_DemoProject\\attached_documents\\JuanLuisBravoV.jpg')

WebUI.setText(findTestObject('01.Page_ToolsQA/02.Forms/input_currentAddress'), 'C/ CurrentAddress 88 28000 Madrid')

WebUI.click(findTestObject('01.Page_ToolsQA/02.Forms/div_Select State'))

WebUI.click(findTestObject('01.Page_ToolsQA/02.Forms/div_Haryana'))

WebUI.click(findTestObject('01.Page_ToolsQA/02.Forms/div_Select City'))

WebUI.click(findTestObject('01.Page_ToolsQA/02.Forms/div_Panipat'))

WebUI.click(findTestObject('01.Page_ToolsQA/02.Forms/button_submit'))

