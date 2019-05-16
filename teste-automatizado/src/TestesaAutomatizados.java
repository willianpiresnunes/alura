import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestesaAutomatizados {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe"); 
		//abre firefox:
		WebDriver driver = new FirefoxDriver();
		//acessa o site do google:
		driver.get("http://www.bing.com.br");
		//digita no campo "q" do google:
		WebElement campoDeBusca = driver.findElement(By.name("q"));
		campoDeBusca.sendKeys("Caelum");
		//submete o form:
		campoDeBusca.submit();
	}
}
