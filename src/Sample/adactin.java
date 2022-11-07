package Sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class adactin {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vimal\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		TakesScreenshot screen = (TakesScreenshot) driver;
		
		File src = screen.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\vimal\\eclipse-workspace\\Selinium\\Screenshot\\img1.png");
		
		FileHandler.copy(src, dest);
		
		
		
		

	}

}
