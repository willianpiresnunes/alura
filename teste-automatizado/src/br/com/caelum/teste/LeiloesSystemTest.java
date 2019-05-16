package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeiloesSystemTest {
	
	private WebDriver driver;
	private LeiloesPage leiloes;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		driver = new FirefoxDriver();
		leiloes = new LeiloesPage(driver);
		
		UsuariosPage usuarios = new UsuariosPage(driver);
		usuarios.visita();
		usuarios.novo().cadastra("Stela Maris", "StelaMaris@icloud.com");
	}
	@Test
	public void deveCadastrarUmLeilao() {
		
		leiloes.visita();
		NovoLeilaoPage novoLeilao = leiloes.novo();
		novoLeilao.preenche("",1 , "Stela Maris", true);
		
		assertTrue(leiloes.mensagemDeValidacaoNome("Nome obrigatorio!"));
		assertTrue(leiloes.mensagemDeValidacaoValor("Valor inicial deve ser maior que zero!"));
	}

	
}
