package testing.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.opencart.com/");
		wd.manage().window().maximize();
		wd.findElement(By.xpath("//*[@id=\'search\']/input"));
		wd.findElement(By.linkText("Returns")).click();
		wd.navigate().back();
		wd.findElement(By.linkText("Gift Certificates")).click();
		wd.quit();

	}

}
