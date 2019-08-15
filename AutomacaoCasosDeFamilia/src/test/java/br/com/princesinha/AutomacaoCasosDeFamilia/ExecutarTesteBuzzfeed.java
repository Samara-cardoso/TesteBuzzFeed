package br.com.princesinha.AutomacaoCasosDeFamilia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutarTesteBuzzfeed {

	private WebDriver driver;

	@Before
	public void setUpBeforeClass() throws Exception {
		ChromeDriverManager manager = new ChromeDriverManager();
		driver = manager.getWebdriver();
	}

	@Test
	public void test() {
		PaginaInicialBuzzfeed paginaInicial = new PaginaInicialBuzzfeed(driver);
		PaginaTodosOsQuizzesBuzzfeed paginaTestes = new PaginaTodosOsQuizzesBuzzfeed(driver);
		PaginaQuizzCasosDeFamiliaBuzzfeed paginaCasosDeFamilia = new PaginaQuizzCasosDeFamiliaBuzzfeed(driver);

		paginaInicial.acessaPagina();
		paginaInicial.acessaPaginaDeTestes();
		paginaTestes.encontrarTesteCasosDeFamilia();
		paginaCasosDeFamilia.respondeQuestao1();
		paginaCasosDeFamilia.respondeQuestao2();
		paginaCasosDeFamilia.respondeQuestao3();
		paginaCasosDeFamilia.respondeQuestao4();
		paginaCasosDeFamilia.respondeQuestao5();
		paginaCasosDeFamilia.gravaResultado(paginaCasosDeFamilia.verificaResultadoTeste(),paginaCasosDeFamilia.getEnderecoArquivo());
		paginaCasosDeFamilia.gravarImagemDaTela(paginaCasosDeFamilia.getEnderecoArquivo());
	}
   @After
   public void fecharChrome() {
	   driver.close();
   }
	
}
