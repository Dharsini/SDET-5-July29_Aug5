package July29_Aug4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SaleforceCreateCase {
	

	
	    public static void main(String[] args) {
	        
	    	WebDriverManager.chromedriver().setup();
			System.out.println(System.getProperty("webdriver.chrome.driver"));
			
			ChromeDriver driver = new ChromeDriver();

	        
	        driver.get("https://salesforce.com/");
	        // maximizing the window
	     
			driver.manage().window().maximize();
			
			
			
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	       
	        WebElement loginButton = driver.findElement(By.id("loginButton"));
	        loginButton.click();

	        // login process

	        WebElement usernameField = driver.findElement(By.id("username"));
	        
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement loginButton1 = driver.findElement(By.id("login"));
	        
	        usernameField.sendKeys("dharsinieee@gmail.com");
	        passwordField.sendKeys("Archanadharsini07*");
	        loginButton1.click();

	       // click on global actions icon
	        WebElement globalActionsIcon = driver.findElement(By.id("globalActionsIcon"));
	        globalActionsIcon.click();

	        // click on case
	        WebElement newCaseoption = driver.findElement(By.xpath("//a[contains(text(), 'New Case')]"));
	        newCaseoption.click();

	        // click on contact and select from the drop down

	        WebElement contactDropdown = driver.findElement(By.id("contactName"));
	        contactDropdown.click();
	        WebElement contactoption = driver.findElement(By.xpath("//li[contains(text(), 'Contact Name')]"));
	        contactoption.click();

	        // click on case origin dropdown and select email

	        WebElement caseOriginDropdown = driver.findElement(By.id("caseOrigin"));
	        caseOriginDropdown.click();
	        WebElement emailoption = driver.findElement(By.xpath("//li[contains(text(), 'Email')]"));
	        emailoption.click();

	        
            // click on the statusdropdown and select escalated option
	        WebElement statusDropdown = driver.findElement(By.id("status"));
	        statusDropdown.click();
	        WebElement escalatedOption = driver.findElement(By.xpath("//li[contains(text(), 'Escalated')]"));
	        escalatedOption.click();

	        // fill the subjec and description
	        WebElement subjectField = driver.findElement(By.id("subject"));
	        
	        WebElement descriptionField = driver.findElement(By.id("description"));
	        
	        subjectField.sendKeys("Testing");
	        descriptionField.sendKeys("Dummy");

	        // click on save button
	        WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(), 'Save')]"));
	        saveButton.click();

	        // for the case created message and verify it 
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Case created successfully')]")));

	        driver.quit();
	        
	    }
	}



