package utilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import static utilities.Driver.getAppiumDriver;

public class ExcelDataReader {
	static AndroidDriver driver = (AndroidDriver) getAppiumDriver();
	private Workbook workbook;

	public ExcelDataReader(String filePath) {
		try (FileInputStream fis = new FileInputStream(filePath)) {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getData(int rowIndex, int colIndex) {
		Sheet sheet = workbook.getSheetAt(0); // İlk sayfa
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(colIndex);
		return cell.toString();
	}

	public void signInWithExcelData(ExcelDataReader excelReader, int row, int roleColumn) {


		getAppiumDriver(); // applikation a giris yap

		ReusableMethods.wait(2);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement profileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				MobileBy.AndroidUIAutomator("new UiSelector().description(\"Profile\")")
		));

		profileElement.click();


	 	driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiSelector().description(\"Sign In\")")).click();// signIn e tiklar

		ReusableMethods.wait(2);
		WebElement useEmailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				MobileBy.AndroidUIAutomator("new UiSelector().description(\"*Use Email Instead\")")
		));
		useEmailElement.click(); // use email e tiklar
		WebElement emailBox= driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiSelector().className(\"android.widget.EditText\").instance(0)"));// email box a tiklar

		ReusableMethods.wait(2);
		// Excelden verileri al
		String email = excelReader.getData(row, roleColumn); // Email sütunu

		String password = excelReader.getData(row, 3);       // sifre sütunu
		WebElement passwordBox = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiSelector().className(\"android.widget.EditText\").instance(1)"));

		// giris islemi
		emailBox.click();
		emailBox.sendKeys(email);
		ReusableMethods.wait(1);
		passwordBox.click();
		passwordBox.sendKeys(password);

		ReusableMethods.wait(1);
		//	signIn e tikla
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiSelector().description(\"Sign In\").instance(1)")).click();

		System.out.println("Signed in with email: " + email);
	}

}

