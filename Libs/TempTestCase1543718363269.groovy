import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/2d/2vs8zjt95wdggbh_ky6dl54r0000gp/T/Katalon/20181202_093923/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'https://katalon-demo-cura.herokuapp.com/\')\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/a_Make Appointment\'))\n\nWebUI.setText(findTestObject(\'Page_CURA Healthcare Service/input_Username_username\'), \'John Doe\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_CURA Healthcare Service/input_Password_password\'), \'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM\')\n\nWebUI.click(findTestObject(\'Page_CURA Healthcare Service/button_Login\'))\n\n// Verify \"Make Appointment\" text to check if login sucessfully or not\nWebUI.verifyElementText(findTestObject(\'Page_CURA Healthcare Service/h2_Make Appointment\'), \'Make another Appointment\', \n    FailureHandling.STOP_ON_FAILURE)\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

