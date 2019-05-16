package br.com.caelum.teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AcessandoMagna {


	@Test
	public void acessaMagna() {

		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://intranet.magnasistemas.com.br/wps/portal/intranet/login/"
		+"!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8zizS0MnQ2NDYx8LMx8DQ0cPXydwky83QwNvM"
		+"31wwkpiAJKG-AAjgZA_VFgJXAT3I28TEEmeJs6WRoYGZibQRXgMaMgN8Ig01FREQDSmPeA/dz/d5/L2dBISEvZ0FBIS9nQSEh/");
		
		WebElement login = driver.findElement(By.id("userID"));
		WebElement senha = driver.findElement(By.id("password"));
		
		login.sendKeys("wnunes");
		senha.sendKeys("William1");
		
		WebElement entrar = driver.findElement(By.id("login.button.login"));
		entrar.click();
		
		WebElement timesheet = driver.findElement(By.linkText("Timesheet"));
		timesheet.click();
		
		

	}

}
