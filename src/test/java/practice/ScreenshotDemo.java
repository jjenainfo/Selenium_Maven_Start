package practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://google.com");
		String Str=driver.getTitle();
		takescreenshot(driver,Str);
		driver.quit();
	}
	public static String takescreenshot(WebDriver driver,String name) throws IOException {
		
		String date=new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sourceFile =screenshot.getScreenshotAs(OutputType.FILE);
		String destFile= "./Screenshot/screenshot"+ name + date +".PNG";
		File destinationFile = new File(destFile);
		FileUtils.copyFile(sourceFile, destinationFile);
		return destFile;
		
		
	}
	

}


