package deltax.deltax;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SEL_Sotware\\Chromedriver\\chromedriver.exe");
		//create chrome instance
	WebDriver	driver = new ChromeDriver();
      driver.get("https://money.rediff.com/index.html");
      driver.manage().window().maximize();
     
      driver.findElement(By.xpath("//a[.='S&P BSE Sensex']")).click();
     // WebElement wt = driver.findElement(By.id("leftcontainer"));
      System.out.println("1");
        List<WebElement> wt1 = driver.findElements(By.xpath("//td[3]"));
        for (WebElement td1 : wt1) 
        {
       	 String text = td1.getText();
       	 System.out.println(text);
   		
   	}

	}

}
