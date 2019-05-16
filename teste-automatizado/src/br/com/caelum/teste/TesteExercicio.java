package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteExercicio {

	@Test
	public void deveAdiconarUmUsuario() {
		
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe"); 
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/usuarios");
				
		driver.findElement(By.linkText("Novo Usu�rio")).click();
		
		WebElement nome = driver.findElement(By.name("usuario.nome"));
		WebElement email = driver.findElement(By.name("usuario.email"));
		
		nome.sendKeys("Willian Pires Nunes");
		email.sendKeys("williampiresnunes@hotmail.com");
		
		driver.findElement(By.id("btnSalvar")).click();
					
		boolean achouNome = driver.getPageSource().contains("Willian Pires Nunes");
		boolean achouEmail = driver.getPageSource().contains("williampiresnunes@hotmail.com");
		
		assertTrue(achouNome);
		assertTrue(achouEmail);
		
		driver.close();
	}
}
