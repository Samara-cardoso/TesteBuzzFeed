package br.com.princesinha.AutomacaoCasosDeFamilia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void createWebdriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		this.driver = new ChromeDriver(options);
	}

}
