package br.com.caelum.teste;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeiloesPage {

	private WebDriver driver;

	public LeiloesPage(WebDriver driver) {
		this.driver = driver;

	}

	public void visita() {
		driver.get("http://localhost:8080/leiloes");

	}

	public NovoLeilaoPage novo() {
		driver.findElement(By.linkText("Novo Leil�o")).click();
		return new NovoLeilaoPage(driver);
	}

	public boolean existe(String produto, double valor, String usuario, boolean usado) {
		return driver.getPageSource().contains(produto) && driver.getPageSource().contains(String.valueOf(valor))
				&& driver.getPageSource().contains(usado ? "Sim" : "N�o");

	}

	public DetalhesDoLeilaoPage detalhes(int posicao) {
		List<WebElement> elementos = driver.findElement(By.linkText("exibir"));
		elementos.get(posicao -1).click();
		
		return new DetalhesDoLeilaoPage(driver);
		
		
	}
	
	public boolean mensagemDeValidacaoNome(String string) {
		return false;
	}

	public boolean mensagemDeValidacaoValor(String string) {
		return false;
	}
	

}
