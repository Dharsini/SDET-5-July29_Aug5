package July29_Aug4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceEditCase {
	
    public static void main(String[] args) {
    	
    	WebDriverManager.chromedriver().setup();
		System.out.println(System.getProperty("webdriver.chrome.driver"));


        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Step 1: Login to https://login.salesforce.com
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("dharsinieee@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Archanadharsini07*");
        driver.findElement(By.id("Login")).click();

        
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        

        //  Click on toggle menu button
        driver.findElement(By.className("slds-icon-waffle")).click();

        //  Click view All and click Sales from App Launcher
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//p[text()='Sales']")).click();

        //  Click on Cases tab visible or select from more.
        driver.findElement(By.xpath("//span[text()='Cases']")).click();

        //  Click on the Dropdown icon and select Edit from the case
        String caseOwnerAlias = "case_owner_alias"; // Replace with the actual alias
        WebElement caseDropdown = driver.findElement(By.xpath("//a[contains(@title, '" + caseOwnerAlias + "')]"));
        caseDropdown.click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();

        //  Update Status as Working
        WebElement statusDropdown = driver.findElement(By.xpath("//span[text()='Status']/parent::label/following-sibling::div//a"));
        statusDropdown.click();
        driver.findElement(By.xpath("//a[text()='Working']")).click();

        //  Update Priority to low
        WebElement priorityDropdown = driver.findElement(By.xpath("//span[text()='Priority']/parent::label/following-sibling::div//a"));
        priorityDropdown.click();
        driver.findElement(By.xpath("//a[text()='Low']")).click();

        //  Update Case Origin as Phone
        WebElement caseOriginDropdown = driver.findElement(By.xpath("//span[text()='Case Origin']/parent::label/following-sibling::div//a"));
        caseOriginDropdown.click();
        driver.findElement(By.xpath("//a[text()='Phone']")).click();

        //  Update SLA violation to No
        WebElement slaViolationDropdown = driver.findElement(By.xpath("//span[text()='SLA Violation']/parent::label/following-sibling::div//a"));
        slaViolationDropdown.click();
        driver.findElement(By.xpath("//a[text()='No']")).click();

        //  Click on Save and Verify Status as Working
        driver.findElement(By.xpath("//button[text()='Save']")).click();

        
        // Close the browser
        driver.quit();
    }
}

