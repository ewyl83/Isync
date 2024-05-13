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
import com.kms.katalon.core.annotation.Keyword as Keyword
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.identity.bisync.cloud/Account/Login')

WebUI.setText(findTestObject('Object Repository/Page_Login  Bisync/input_Email_Email'), 'ms@cubevalue.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Bisync/input_Password_Password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Login  Bisync/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Bisync Cloud/a_Operation'))

WebUI.click(findTestObject('Object Repository/Page_Bisync Cloud/a_Create Order'))

WebUI.selectOptionByValue(findTestObject('Page_Bisync Cloud/select_Outlet'), '813', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bisync Cloud/select_Select CategoryASSETSBEVERAGEFOODMAR_b3348c'), 
    '192', true)

WebUI.click(findTestObject('Object Repository/Page_Bisync Cloud/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Bisync Cloud/input_CK 1 Vendor_quantity-Ingredient-21028-43721'), '5')

WebUI.click(findTestObject('Object Repository/Page_Bisync Cloud/button_CK 1 Vendor_addProduct-Ingredient-21_e5f3ae'))

WebUI.scrollToElement(findTestObject('Page_Bisync Cloud/button_Review'), 3)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

def element = WebUiCommonHelper.findWebElement(findTestObject('Page_Bisync Cloud/button_Review'), 20)

((JavascriptExecutor)driver).executeScript("arguments[0].click();", element)

//((JavascriptExecutor)driver).executeScript("arguments[0].click();", element)
WebUI.click(findTestObject('Object Repository/Page_Bisync Cloud/button_Order'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_AllTEST 1 OUTLET 1TEST 1 OUTLET 2TES_7bc2fe'), '813', 
    true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/div_Submitted_action-pop buttons-2'), '', false)
WebUI.scrollToElement(findTestObject('Page_Bisync Cloud/ul_SubmittedToShipApproved'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Bisync Cloud/button_Search'))

WebUI.mouseOver(findTestObject('Page_Bisync Cloud/div_Submitted_action-pop buttons-2'))

//WebUI.click(findTestObject('Page_Bisync Cloud/div_Submitted_action-pop buttons-2'))
WebUI.click(findTestObject('Object Repository/svg_Submitted_svg-inline--fa fa-search fa-w-16'))

WebUI.scrollToElement(findTestObject('Page_Bisync Cloud/td_5'), 5)

WebUI.verifyTextPresent('5', false)

//WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Bisync Cloud/td_5'), 'value', '5', 10)
WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Page_Bisync Cloud/a_Close'), 20)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))

//WebUI.click(findTestObject('Object Repository/img'))

//WebUI.click(findTestObject('Object Repository/a_Sign Out'))

WebUI.navigateToUrl('https://uat.bisync.cloud/Account/Logout')

WebUI.closeBrowser()

