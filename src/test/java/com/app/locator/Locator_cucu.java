package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import app.base.BaseClass_cucu;

public class Locator_cucu extends BaseClass_cucu {

	public static WebElement firstname() {
		
		return driver.findElement(By.id("firstName"));
	
	}
}
