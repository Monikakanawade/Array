package selenium;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	

	public void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\VelocityTraining\\Chrome_driver_101_selenium_file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		String path = "D:\\screenshots\\mainpage.png";
		TakesScreenshot u = ((TakesScreenshot).driver);
		
		

} 
	public static void main(String[] args) {
		Screenshot T = new Screenshot();
		T.BrowserLaunch();
	}}
