package firstAttempt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VTigerWidgets {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.cssSelector("#loginFormDiv > form > div:nth-child(6) > button")).click();
		
		driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();

		driver.findElement(By.cssSelector("a[data-name='History']")).click();
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.xpath("//*[@id=\"tab_2\"]/div/div[1]/div/div[1]/ul/li[16]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"56\"]/div[3]/div[2]/a[3]/i")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/button[2]")).click();



	}

}
