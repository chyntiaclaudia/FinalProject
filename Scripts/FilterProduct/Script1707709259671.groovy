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

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

WebUI.click(findTestObject('Object Repository/FilterProduct/Page_Advantage Shopping/div_TABLETS                        Shop Now'))
WebUI.click(findTestObject('Object Repository/FilterProduct/Page_Advantage Shopping/h4_PROCESSOR'))
WebUI.click(findTestObject('Object Repository/FilterProduct/Page_Advantage Shopping/input_PROCESSOR_processor_0'))
WebUI.click(findTestObject('Object Repository/FilterProduct/Page_Advantage Shopping/input_PROCESSOR_processor_0'))

switch (processor) {
    case 'Z3795':
        WebUI.check(findTestObject('Object Repository/sort/Page_Advantage Shopping/tablet1'))
        break
    case 'Z8500':
        WebUI.check(findTestObject('Object Repository/sort/Page_Advantage Shopping/tablet2'))
        break
    case '5300':
        WebUI.check(findTestObject('Object Repository/sort/Page_Advantage Shopping/tablet3'))
        break
    default:
        // Kasus default, tidak melakukan apapun
        break
}
WebUI.delay(3) // Tunggu beberapa saat setelah setiap klik

WebUI.closeBrowser()
