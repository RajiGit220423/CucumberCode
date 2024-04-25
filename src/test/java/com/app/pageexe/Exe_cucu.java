package com.app.pageexe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.app.locator.Locator_cucu;
import app.base.BaseClass_cucu;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Exe_cucu extends Locator_cucu {
	
	public static void firstname(String name) {
	
		BaseClass_cucu.inputValue(Locator_cucu.firstname(), name);
	}
	
}
