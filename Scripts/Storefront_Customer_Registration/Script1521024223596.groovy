import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

ExcelData data = findTestData('Data Files/New Test Accounts')



WebUI.openBrowser('')

WebUI.navigateToUrl('https://qal.beautypie.com/uk')

WebUI.click(findTestObject('Page_Gifting/Page_BEAUTY PIE/a_GIFT MEMBERSHIPS'))

WebUI.scrollToElement(findTestObject('Page_Gifting/a_ADD TO BAG'), 0)

WebUI.click(findTestObject('Page_Gifting/a_ADD TO BAG'))

WebUI.scrollToElement(findTestObject('Page_Shopping Bag/a_Create Account And Checkout'), 0)

WebUI.click(findTestObject('Page_Shopping Bag/a_Create Account And Checkout'))

WebUI.click(findTestObject('Page_Register/input_logonId'))

for (def index : (1..data. getRowNumbers() - 1)) {

WebUI.setText(findTestObject('Page_Register/input_logonId'), data.internallyGetValue("demo_usn", index))

WebUI.setText(findTestObject('Page_Register/input_logonPassword'), data.internallyGetValue("demo_pwd", index))

}
