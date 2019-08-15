package br.com.princesinha.AutomacaoCasosDeFamilia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaInicialBuzzfeed {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public PaginaInicialBuzzfeed(WebDriver driver) {
		this.driver = driver;

}
	public void acessaPagina () {
		driver.get("https://www.buzzfeed.com/br");

	}
	
	public void acessaPaginaDeTestes () {
		driver.findElement(By.linkText("Testes")).click();
		
	}
}