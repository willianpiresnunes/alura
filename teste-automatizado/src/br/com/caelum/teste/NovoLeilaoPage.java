package br.com.caelum.teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NovoLeilaoPage {

	private final WebDriver driver;

	public NovoLeilaoPage(WebDriver driver) {
		this.driver = driver;

	}

	public void preenche(String nome, double valor, String usuario, boolean usado) {

		WebElement txtNome = driver.findElement(By.name("leilao.nome"));
		WebElement txtValor = driver.findElement(By.name("leilao.valorInicial"));

		txtNome.sendKeys(nome);
		txtValor.sendKeys(String.valueOf(valor));

		Select cbusuario = new Select(driver.findElement(By.name("leilao.usuario.id")));
		cbusuario.selectByVisibleText(usuario);

		if (usado) {
			WebElement ckUsado = driver.findElement(By.name("leilao.usado"));
			ckUsado.click();
		}

		txtNome.submit();
	}

	public boolean mensagemDeValidacaoNome(String string) {
		return driver.getPageSource().contains("Nome obrigatorio");
	}

	public boolean mensagemDeValidacaoValor(String string) {
		return driver.getPageSource().contains("Valor inicial deve ser maior que zero!");

	}

}
