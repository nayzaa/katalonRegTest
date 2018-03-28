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

WebUI.click(findTestObject('STC-08 See Tuition_OR/Page_Student (1)/a_Tuition Fee'))

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/legend_Tution Fee'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/p_Name  Surasung Vunlai'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/th_Course'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/th_Credits'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/th_Fee'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_001223 - ENGL FOR HUMAN  MA'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_3 credits'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_60'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_951100 - MODERN LIFE AND AN'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_3 credits'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_60'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_953323 - SOFWARE CONS TESTM'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_3 credits'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_60'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_953411 - AI FOR SE'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_3 credits'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_60'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_953422 - SOFTWARE QUALITY A'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_3 credits'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_60'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/th_Total Credits'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_15'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/th_Total Fee'), 0)

WebUI.verifyElementPresent(findTestObject('STC-08 See Tuition_OR/Page_Tution Fee (1)/td_300 Baht'), 0)

WebUI.closeBrowser()

