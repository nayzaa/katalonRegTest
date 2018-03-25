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

WebUI.navigateToUrl('https://butterfried.github.io/SE323-proj01-registration/index_s.html')

WebUI.click(findTestObject('See enroll/Page_Student/td_1'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_1'), 0)

WebUI.click(findTestObject('See enroll/Page_Student/td_IT AND MODERN LIFE'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_IT AND MODERN LIFE'), 0)

WebUI.click(findTestObject('See enroll/Page_Student/td_701'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_701'), 0)

WebUI.click(findTestObject('See enroll/Page_Student/td_2'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_2'), 0)

WebUI.click(findTestObject('See enroll/Page_Student/td_1'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_1'), 0)

WebUI.click(findTestObject('See enroll/Page_Student/td_Tuesday'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_Tuesday'), 0)

WebUI.click(findTestObject('See enroll/Page_Student/td_12.30 - 14.30'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_12.30 - 14.30'), 0)

WebUI.click(findTestObject('See enroll/Page_Student/td_RB6201'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_RB6201'), 0)

WebUI.rightClick(findTestObject('See enroll/Page_Student/td_p'))

WebUI.click(findTestObject('See enroll/Page_Student/td_p'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_p'), 0)

WebUI.click(findTestObject('See enroll/Page_Student/td_Withdraw'))

WebUI.verifyElementPresent(findTestObject('See enroll/Page_Student/td_Withdraw'), 0)

WebUI.closeBrowser()

