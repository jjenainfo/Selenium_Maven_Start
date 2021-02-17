package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter("xtentReport.html");
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Google search test");
        WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		test.log(Status.INFO,"Test case started");
		driver.get("https://google.com");
		test.pass("Browser opens");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		test.pass("srearching for testing");
		
		/*driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		test.pass("clicked on search button");*/
		
		driver.close();
		driver.quit();
		test.pass("browser closed");
		
		test.info("searching process success");
		
		extent.flush();
		

	}

}
