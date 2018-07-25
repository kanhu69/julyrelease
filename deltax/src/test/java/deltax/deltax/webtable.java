package deltax.deltax;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\SEL_Sotware\\Chromedriver\\chromedriver.exe");
		//create chrome instance
	WebDriver	driver = new ChromeDriver();
      driver.get("https://money.rediff.com/index.html");
      driver.manage().window().maximize();
      //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     // driver.findElement(By.id("srchword")).sendKeys("kanhu");
    //a[.='Tata Consultancy']
      driver.findElement(By.xpath("//a[.='S&P BSE Sensex']")).click();
     
      List<WebElement> wd = driver.findElements(By.xpath("//td[6][@class='numericalColumn']"));
     for (WebElement td1 : wd) 
     {
    	 String text = td1.getText();
    	 System.out.println(text);
		
	}
	}

}
