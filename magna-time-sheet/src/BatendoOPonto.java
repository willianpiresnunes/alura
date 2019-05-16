import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BatendoOPonto {

	private FirefoxDriver driver;

	@Before
	public void inicializa() {
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		
		this.driver = new FirefoxDriver();
		driver.get("http://intranet.magnasistemas.com.br/wps/portal/intranet/login/!ut/p/z1/04_"
				+ "Sj9CPykssy0xPLMnMz0vMAfIjo8zizS0MnQ2NDYx8LMx8DQ0cPXydwky83QwNvM31wwkpiAJKG-AAjgb6XmAFcP3uRl6mIP3epk6WBkYG5mYgFxgV-Tr7putHFSSWZOhm5qXl60eUpyblJmbmAK2PImRAFCEnFORGVPmkBXsCANQ0Xx8!/dz/d5/L2dBISEvZ0FBIS9nQSEh/");

	}

	@Test
	public void batendoOPontoTimeSheet() {

		WebElement login = driver.findElement(By.name("wps.portlets.userid"));
		WebElement senha = driver.findElement(By.name("password"));
		login.sendKeys("wnunes");
		senha.sendKeys("William1");
		
		driver.findElement(By.id("login.button.login")).click();

		driver.findElement(By.className("TimeSheet")).click();

		// assertTrue(driver.getPageSource().contains("Nome obrigatorio!"));
		// assertTrue(driver.getPageSource().contains("E-mail obrigatorio!"));

		// driver.close();
	}
}
