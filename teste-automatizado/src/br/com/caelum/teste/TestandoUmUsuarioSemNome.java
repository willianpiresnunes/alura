package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestandoUmUsuarioSemNome {

	@Test
	public void deveTestarUmUsuarioSemNome() {

		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/usuarios/new");

		WebElement email = driver.findElement(By.name("usuario.email"));

		email.sendKeys("williampiresnunes@hotmail.com");

		WebElement botaoSalvar = driver.findElement(By.id("btnSalvar"));
		botaoSalvar.click();

		assertTrue(driver.getPageSource().contains("Nome obrigatorio!"));

		driver.close();
	}
}
