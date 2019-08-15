package br.com.princesinha.AutomacaoCasosDeFamilia;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	protected WebDriver driver;

	protected abstract void createWebdriver();

	public void quitWebdriver() {
		if (null != driver) {
			driver.quit();
			driver = null;
		}
	}

	public WebDriver getWebdriver() {
		if (null == driver) {
			createWebdriver();
		}
		return driver;
	}
}
