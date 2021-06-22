package StepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//This for demo of Git
public class Basiccontactform {
	WebDriver driver;

	@Before
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Resource//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@Given("^Go to mycontactsform site$")
public void GotoSite(){
		driver.get("https://www.mycontactform.com/samples/basiccontact.php");
	}
@Then("^Add the \"(.*)\" and \"(.*)\"$")	
	public void EnterCredentials(String nam,String emai){
		driver.findElement(By.name("q[1]")).sendKeys(nam);
		driver.findElement(By.name("email")).sendKeys(emai);

	}

@Then("^Enter the \"(.*)\"$")
public void AddMessage(String message){
driver.findElement(By.name("q[2]")).sendKeys(message);
	
}
	
	@Then("^Click on submit Button$")
	public void clickonSubmit(){
		driver.findElement(By.name("submit")).click();
	}
	
	
	@After
	public void quit(){
		driver.quit();
		
	}

}
