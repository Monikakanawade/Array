package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropAction {
	public void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\VelocityTraining\\Chrome_driver_101_selenium_file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
 
	WebElement	Dragable = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement Droppable = driver.findElement(By.xpath("//div[@id='trash']"));
	Actions w = new Actions(driver);
	w.dragAndDrop(Dragable, Droppable).perform();
}
	public static void main(String[] args) {
		Drag_And_DropAction r = new Drag_And_DropAction ();
		r.BrowserLaunch();
	}}
