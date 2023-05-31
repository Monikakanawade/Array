package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimentionAndPointClass {
	
	public void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\VelocityTraining\\Chrome_driver_101_selenium_file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Dimension p = new Dimension(200,400);
	    System.out.println(p.getHeight()+ p.getWidth());
		driver.manage().window().setSize(p);


		Point a = new Point(400,500);
		System.out.println(driver.manage().window().getPosition());
		driver.manage().window().setPosition(a);

	}
	public static void main(String[] args) {
		DimentionAndPointClass n = new DimentionAndPointClass();
		n.BrowserLaunch();
	}}



