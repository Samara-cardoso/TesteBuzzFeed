package br.com.princesinha.AutomacaoCasosDeFamilia;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaQuizzCasosDeFamiliaBuzzfeed {
	Random gerador = new Random();
	String resultadoEsperado = "Você tirou:";

	private WebDriver driver;
	private WebDriverWait wait;

	public PaginaQuizzCasosDeFamiliaBuzzfeed(WebDriver driver) {
		this.driver = driver;
	}

	public void respondeQuestao1() {
		int respostaPergunta = gerador.nextInt(4);
		System.out.println(respostaPergunta);
		switch (respostaPergunta) {
		case 0:
			driver.findElement(By.xpath("//span[contains(text(),'Ignora e cuida da sua vida')]/..")).click();
			break;
		case 1:
			driver.findElement(By.xpath("//span[contains(text(),'Assiste de longe')]/..")).click();
			break;
		case 2:
			driver.findElement(By.xpath("//span[contains(text(),'Filma tudo e joga na internet')]/..")).click();
			break;
		case 3:
			driver.findElement(By.xpath("//span[contains(text(),'Geralmente eu estou envolvido(a) no barraco')]/.."))
					.click();
			break;
		}
	}

	public void respondeQuestao2() {
		int respostaPergunta = gerador.nextInt(4);
		System.out.println(respostaPergunta);
		switch (respostaPergunta) {
		case 0:
			driver.findElement(By.xpath("//span[contains(text(),'Adoro, vou em todos')]/..")).click();
			break;
		case 1:
			driver.findElement(By.xpath("//span[contains(text(),'Gosto, mas às vezes tenho preguiça')]/..")).click();
			break;
		case 2:
			driver.findElement(By.xpath("//span[contains(text(),'Só vou pra comer e depois já vou embora')]/.."))
					.click();
			break;
		case 3:
			driver.findElement(By.xpath("//span[contains(text(),'Nunca vou')]/..")).click();
			break;
		}
	}

	public void respondeQuestao3() {
		int respostaPergunta = gerador.nextInt(4);
		System.out.println(respostaPergunta);
		switch (respostaPergunta) {
		case 0:
//			driver.findElement(By.xpath("//div[contains(text(), 'A Grande Família')]")).click();
			clickJS("//div[contains(text(), 'A Grande Família')]");
			break;
		case 1:
			clickJS("//div[contains(text(), 'A Família Dinossauros')]");
			break;
		case 2:
			clickJS("//div[contains(text(), 'Todo Mundo Odeia o Chris')]");
			break;
		case 3:
			clickJS("//div[contains(text(), 'Os Simpsons')]");
			break;

		}
	}

	public void respondeQuestao4() {
		int respostaPergunta = gerador.nextInt(4);
		System.out.println(respostaPergunta);
		switch (respostaPergunta) {
		case 0:
			driver.findElement(By.xpath("//span[contains(text(),'Gente folgada')]/..")).click();
			break;
		case 1:
			driver.findElement(By.xpath("//span[contains(text(),'Gente mentirosa')]/..")).click();
			break;
		case 2:
			driver.findElement(By.xpath("//span[contains(text(),'Gente intrometida')]/..")).click();
			break;
		case 3:
			driver.findElement(By.xpath("//span[contains(text(),'Gente fofoqueira')]/..")).click();
			break;
		}

	}

	public void respondeQuestao5() {
		int respostaPergunta = gerador.nextInt(4);
		System.out.println(respostaPergunta);
		switch (respostaPergunta) {
		case 0:
			driver.findElement(By.xpath("//span[contains(text(),'Treta')]/..")).click();
			break;
		case 1:
			driver.findElement(By.xpath("//span[contains(text(),'Barraco')]/..")).click();
			break;
		case 2:
			driver.findElement(By.xpath("//span[contains(text(),'Briga')]/..")).click();
			break;
		case 3:
			driver.findElement(By.xpath("//span[contains(text(),'Fuá')]/..")).click();
			break;
		}

	}

	public void clickJS(String xpath) {
		((JavascriptExecutor) driver).executeScript(
				"document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();",
				xpath);
	}



	
//	public void verificaSeResultadoApareceu() {
//		public boolean resultado;
//		if () {
//			
	public String verificaResultadoTeste() {
		String resultado = "Caso do papel de trouxa";
		try {
			WebElement localizador = driver.findElement(By.xpath("//h3[contains(text(),'Caso do papel de trouxa')]"));
			System.out.println("Resultado do teste foi 'Caso do Papel de Trouxa'");
		} catch (Exception e) {
			resultado = "Outro caso";
			System.out.println("Resultado do teste não foi 'Caso do Papel de Trouxa'");
		}
		return resultado;
		
	}
	

		
	public String getEnderecoArquivo() {
		String enderecoArquivo = "C:\\Pasta_de_Testes\\";
		return enderecoArquivo;
	}

	
	public void gravaResultado (String resultado1,String enderecoArquivo)  { 
		
		
		try  {
			File file2 = new File (enderecoArquivo);
			
			
			if(file2.exists()) {
				file2.delete();
			} 
			
			if(!file2.exists()){
				file2.createNewFile();
			}
			
			FileWriter arq = new FileWriter(enderecoArquivo + "ResultadoTeste.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.print(resultado1);
			System.out.println("Resultado do teste gravado com sucesso");
			gravarArq.close();
		} catch (Exception e) {
			System.out.println("Não foi possível gravar o resultado do teste");
		}
	}	
			
		public void gravarImagemDaTela (String enderecoArquivo) {
		        
		        try {
		            
		            Robot robot = new Robot();
		            BufferedImage bi = robot.createScreenCapture(new Rectangle(1360,768));
		            ImageIO.write(bi, "jpg", new File(enderecoArquivo + "capturaTeste.jpg"));
		            
		        } catch (AWTException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		
		}
	
			

	
		
		
		
		
		
		
		
	


