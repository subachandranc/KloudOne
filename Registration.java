package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class Registration {

	//Homepage URL
	static String Url = " https://www.kloudlearn.com/";
	public WebDriver driver;

	@BeforeClass
	public void Homepage() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SubachandranChandras\\eclipse-workspace\\WebDriverBasics\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(Url);
		Thread.sleep(5000);
		System.out.println("Homepage opened");
	}

	@Test(priority = 0)
	public void Signup() throws Exception {

		// Click Signup button
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"navbar-main\"]/div/ul/li[3]/a/button"));
		signup.click();
		System.out.println("Signup button Clicked");
		Thread.sleep(2000);

		// Register button
		WebElement register = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/span/div/div/a/button"));
		register.click();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void Register() throws InterruptedException {

		// Registration form filling with details
		WebElement Email = driver.findElement(By.id("org_email"));
		Email.sendKeys("abc123@gmail.com");
		System.out.println("Email entered");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("1234567890");
		System.out.println("Password entered");
		Thread.sleep(1000);

		WebElement workspace = driver.findElement(By.id("org_name"));
		workspace.sendKeys("abc software solutions");
		System.out.println("Workspace entered");
		Thread.sleep(1000);

		WebElement Firstname = driver.findElement(By.id("first_name"));
		Firstname.sendKeys("Ganesh");
		System.out.println("FirstName entered");
		Thread.sleep(1000);

		WebElement Lastname = driver.findElement(By.id("last_name"));
		Lastname.sendKeys("S");
		System.out.println("LastName entered");
		Thread.sleep(1000);

		//Click submit button
		WebElement submit = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[3]/div/div[6]/div/div/span/button"));
		submit.click();
		System.out.println("Register button clicked");
		Thread.sleep(5000);

		driver.quit();

	}

}
