package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//timeout driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
		//driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));  
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//WebDriverManager.chromedriver().driverVersion("98.0.4758.102").setup();
		//driver.get("https://google.com");
		driver.get("http://localhost/Hotel%20Management%20System/Login.php");
		Thread.sleep(2000);
		driver.findElement(By.name("floatingInput")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("floatingPassword")).sendKeys("12345" + Keys.ENTER);
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("dropdown09"));
		actions.moveToElement(elementLocator).click().build().perform();
		Thread.sleep(2000);
		WebElement elementLocator1 = driver.findElement(By.xpath("//a[@href='addrooms.php']"));
		//Actions actions = new Actions(driver);
		actions.moveToElement(elementLocator1).click().build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.name("roomno")).sendKeys("504");
		Thread.sleep(2000);
		WebElement selectElement = driver.findElement(By.name("avail"));
		Select selectObject = new Select(selectElement);
		selectObject.selectByVisibleText("Available");
		Thread.sleep(2000);
		WebElement selectElement1 = driver.findElement(By.name("status"));
		Select selectObject1 = new Select(selectElement1);
		selectObject1.selectByVisibleText("Clean");
		Thread.sleep(2000);
		driver.findElement(By.name("roomprice")).sendKeys("5000");
		Thread.sleep(2000);
		WebElement selectElement2 = driver.findElement(By.name("bedtype"));
		Select selectObject2 = new Select(selectElement2);
		selectObject2.selectByVisibleText("Single Bed");
		WebElement elementLocator6 = driver.findElement(By.xpath("//div[@class='col-sm-3']"));
		actions.moveToElement(elementLocator6).click().build().perform();
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		
		/*
		
		WebElement selectElement = driver.findElement(By.id("dropdown09"));
		Select selectObject = new Select(selectElement);
		selectObject.selectByVisibleText("Add Room");
		Thread.sleep(2000);
		
		*/
		
		driver.switchTo( ).alert( ).accept();
		driver.navigate().refresh();
		
		WebElement elementLocator2 = driver.findElement(By.xpath("//a[@href='reception.php']"));
		//Actions actions = new Actions(driver);
		actions.moveToElement(elementLocator2).click().build().perform();
		Thread.sleep(5000);
		
		WebElement elementLocator3 = driver.findElement(By.xpath("//a[@href='roomdetails.php']"));
		//Actions actions = new Actions(driver);
		actions.moveToElement(elementLocator3).click().build().perform();
		Thread.sleep(5000);
		
		WebElement elementLocator4 = driver.findElement(By.xpath("//input[@type='submit']"));
		actions.moveToElement(elementLocator4).click().build().perform();
		Thread.sleep(5000);
		
		WebElement elementLocator5 = driver.findElement(By.xpath("//button[@type='submit']"));
		actions.moveToElement(elementLocator5).click().build().perform();
		Thread.sleep(5000);
		
		
		
	}
}
