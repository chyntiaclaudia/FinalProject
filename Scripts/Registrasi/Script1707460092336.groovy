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

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__usernameRegisterPage'), 'cicicaca')

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/label_Email'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__emailRegisterPage'), 'cicici@gmail.com')

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__passwordRegisterPage'), 
    'JF0lU91WphA42I2PstvcPg==')

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/label_Confirm password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__confirm_passwordRegisterPage'), 
    'JF0lU91WphA42I2PstvcPg==')

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/label_First Name'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_PERSONAL DETAILS_first_nameRegisterPage'), 
    'cici')

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/label_Last Name'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_- Use maximum 30 character_last_nameR_6ef033'), 
    'caca')

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/label_Phone Number'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_- Use maximum 30 character_phone_numb_7c938a'), 
    '081234567890')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/Page_Advantage Shopping/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:168', true)

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/label_City'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_Country_cityRegisterPage'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/label_Address'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_- Use maximum 25 character_addressReg_9e23b3'), 
    'Cempaka Putih')

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/label_State  Province  Region'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_- Use maximum 50 character_state__pro_272a54'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_- Use maximum 10 character_postal_cod_639c2f'), 
    '01234')

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_Receive exclusive offers and promotio_5c7450'))

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/button_REGISTER'))

WebUI.closeBrowser()

