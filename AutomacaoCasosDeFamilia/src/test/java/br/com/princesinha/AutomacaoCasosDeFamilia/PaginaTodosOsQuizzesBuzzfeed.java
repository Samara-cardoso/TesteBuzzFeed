package br.com.princesinha.AutomacaoCasosDeFamilia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaTodosOsQuizzesBuzzfeed {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public PaginaTodosOsQuizzesBuzzfeed(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void encontrarTesteCasosDeFamilia () {
		driver.findElement(By.xpath("//a[contains(text(),'Qual caso bizarro do \"Casos de Família\" é você?')]")).click();
	}

}
