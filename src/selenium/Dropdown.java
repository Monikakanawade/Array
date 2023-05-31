package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\VelocityTraining\\Chrome_driver_101_selenium_file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://vctcpune.com/selenium/practice.html");
 
	  WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select v = new Select(dropdown);
//		v.selectByVisibleText("Option2");
//		v.selectByIndex(2);
		v.selectByValue("option2");
}
	public static void main(String[] args) {
		Dropdown k = new Dropdown();
		k.BrowserLaunch();
	}}
