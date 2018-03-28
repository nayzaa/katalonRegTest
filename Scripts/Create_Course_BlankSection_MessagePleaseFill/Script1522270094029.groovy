import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pannatat.github.io/test.SE323-project.io/index_a.html')

WebUI.setText(findTestObject('STC-03 Create course_OR/Page_Admin/input_courseName'), 'Crypto Currency')

WebUI.setText(findTestObject('STC-03 Create course_OR/Page_Admin/input_courseId'), '123321')

WebUI.click(findTestObject('STC-03 Create course_OR/Page_Admin/input_radio1'))

WebUI.selectOptionByValue(findTestObject('STC-03 Create course_OR/Page_Admin/select_Please select'), '1', true)

WebUI.click(findTestObject('STC-03 Create course_OR/Page_Admin/input_uk-checkbox'))

WebUI.click(findTestObject('STC-03 Create course_OR/Page_Admin/input_uk-checkbox'))

WebUI.setText(findTestObject('STC-03 Create course_OR/Page_Admin/input_student'), '40')

WebUI.setText(findTestObject('STC-03 Create course_OR/Page_Admin/input_credit'), '3')

WebUI.setText(findTestObject('STC-03 Create course_OR/Page_Admin/input_uk-input uk-form-width-l'), 'Surasung Vunlai')

WebUI.click(findTestObject('STC-03 Create course_OR/Page_Admin/button_Add Course'))

WebUI.closeBrowser()

