package app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_cucu {

	public static WebDriver driver = null;

	public static void browserlaunch() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

	}

	public static void inputValue(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clickValue(WebElement element) {

		element.click();
	}

}
