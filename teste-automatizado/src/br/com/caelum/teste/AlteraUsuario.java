package br.com.caelum.teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlteraUsuario {

	private WebDriver driver;

	public AlteraUsuario(WebDriver driver) {
		this.driver = driver;
	}

	public UsuariosPage para(String nome, String email) {
		WebElement txtNome = driver.findElement(By.name("usuario.nome"));
		WebElement txtEmail = driver.findElement(By.name("usuario.email"));

		txtEmail.clear();
		txtNome.clear();

		txtNome.sendKeys(nome);
		txtEmail.sendKeys(email);

		txtNome.submit();
		return new UsuariosPage(driver);

	}
}
