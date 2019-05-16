package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsuariosSystemTest {

	private WebDriver driver;
	private UsuariosPage usuarios;

	@Before
	public void inicializa() {
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.usuarios = new UsuariosPage(driver);
	}

	@Test
	public void deveAdicionarUmUsuario() {

		usuarios.visita();
		usuarios.novo().cadastra("Willian Pires Nunes", "williampiresnunes@hotmail.com");

		assertTrue(usuarios.existeNaListagem("Willian Pires Nunes", "williampiresnunes@hotmail.com"));
	}

	@After
	public void finaliza() {

		driver.close();
	}

}
