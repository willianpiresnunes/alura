import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsandoOChrome {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com.br");
		WebElement campoDeBusca = driver.findElement(By.name("q"));
		campoDeBusca.sendKeys("arautos do evangelio");
		
		campoDeBusca.submit();
		
	}
}
