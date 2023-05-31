package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {
	
	public void BrowserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\VelocityTraining\\Chrome_driver_101_selenium_file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://vctcpune.com/selenium/practice.html");
		String h = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
		Set<String> m = driver.getWindowHandles();
		
		for(String ch : m) {
			if(!h.equals(ch)) {
				driver.switchTo().window(ch);
				driver.findElement(By.xpath("//a[text()='About us']")).click();
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(3000);
				driver.quit();
				
			}}
		}

	public static void main(String[] args) throws InterruptedException {
		Window_Handling o = new Window_Handling();
		o.BrowserLaunch();
		}
	}
