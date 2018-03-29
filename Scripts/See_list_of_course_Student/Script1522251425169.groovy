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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://butterfried.github.io/SE323-proj01-registration/courses_s.html')

WebUI.click(findTestObject('See list of course/Page_Courses list/a_012200 - MIND VOLUNTEER (3 S'))

WebUI.click(findTestObject('See list of course/Page_Courses list/td_001'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_001'), 0)

WebUI.click(findTestObject('See list of course/Page_Courses list/td_Rapee Sangsakorn'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_Rapee Sangsakorn'), 0)

WebUI.click(findTestObject('See list of course/Page_Courses list/td_3'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_3'), 0)

WebUI.click(findTestObject('See list of course/Page_Courses list/td_0'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_0'), 0)

WebUI.click(findTestObject('See list of course/Page_Courses list/td_TuF'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_TuF'), 0)

WebUI.click(findTestObject('See list of course/Page_Courses list/td_12.30-15.30'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_12.30-15.30'), 0)

WebUI.click(findTestObject('See list of course/Page_Courses list/td_AKB4801'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_AKB4801'), 0)

WebUI.click(findTestObject('See list of course/Page_Courses list/td_35'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_35'), 0)

WebUI.click(findTestObject('See list of course/Page_Courses list/td_35'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_35'), 0)

WebUI.click(findTestObject('See list of course/Page_Courses list/td_Enroll'))

WebUI.verifyElementPresent(findTestObject('See list of course/Page_Courses list/td_Enroll'), 0)

WebUI.closeBrowser()

