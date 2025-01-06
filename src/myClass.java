import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myClass {

	
	
	WebDriver driver = new ChromeDriver();

	String WebSite = "https://codenboxautomationlab.com/practice/";

	Random rand = new Random();

	@BeforeTest
	public void mySetup() {

		driver.manage().window().maximize();
		driver.get(WebSite);
	}


// this is my first test
	@Test(priority = 1, description = "Radio button", invocationCount = 1, enabled = true)

	public void Radio_Button_Example() throws InterruptedException {

		List<WebElement> AllRadioButtons = driver.findElements(By.className("radioButton"));
		// to click on the first item
//AllRadioButtons.get(0).click();	

		int randomIndex = rand.nextInt(AllRadioButtons.size()); // size is 3 so it it will generate 0,1,2
		AllRadioButtons.get(randomIndex).click();

		// l3yon mahdi

		for (int i = 0; i < AllRadioButtons.size(); i++) {
			Thread.sleep(1000);
			AllRadioButtons.get(i).click();
		}
	}

	
}
