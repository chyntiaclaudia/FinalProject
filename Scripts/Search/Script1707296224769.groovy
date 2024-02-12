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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Search/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Advantage Shopping/input_OR_username'), 'cintilu.cu')

WebUI.setEncryptedText(findTestObject('Object Repository/Search/Page_Advantage Shopping/input_Username_password'), 'WoESHQlZqz2JwR7VDauQsA==')

WebUI.click(findTestObject('Object Repository/Search/Page_Advantage Shopping/button_SIGN IN'))

def searchTerm = ['laptop', 'laptop asus', 'headset']

// Lakukan pencarian berdasarkan kata kunci yang berbeda
for (int i = 0; i < searchTerm.size(); i++) {
	if (searchTerm[i] == 'laptop' || searchTerm[i] == 'laptop asus' || searchTerm[i] == 'headset') {
		// Jika kata kunci dikenali, isi bidang pencarian dan kirim tombol Enter
		WebUI.setText(findTestObject('Object Repository/Search/Page_Advantage Shopping/input_DEMO_mobile_search'), searchTerm[i])
		WebUI.sendKeys(findTestObject('Object Repository/Search/Page_Advantage Shopping/input_DEMO_mobile_search'), Keys.chord(Keys.ENTER))
	} else {
		// Jika kata kunci tidak dikenali, cetak pesan kesalahan
		println('No results for ' + searchTerm[i])
	}

	// Tunggu beberapa saat sebelum melanjutkan ke kata kunci pencarian berikutnya
	WebUI.delay(2)
}

WebUI.closeBrowser()