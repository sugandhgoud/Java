package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Involefirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.marionette","C:\\Users\\sugandh\\Downloads\\geckodriver-v0.9.0-win64");
		WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.google.com");
	}

}
