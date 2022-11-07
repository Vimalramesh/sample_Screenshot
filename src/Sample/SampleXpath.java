package Sample;

import java.sql.Driver;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleXpath {
	public static void main(String[] args) {
		
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vimal\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
	List<WebElement> dresses = driver.findElements(By.xpath("//div[@class=\"product-productMetaInfo\"]"));
    int size = dresses.size();
    System.out.println(size);
    
    for (WebElement pro : dresses) {
		String text = pro.getText();
		System.out.println(text);
	}
    
    List<WebElement> list = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
    for (WebElement prod : list) {
    	String text = prod.getText();
    	System.out.println(text);
		
	}
    
	    
	}

}
