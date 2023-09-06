package July29_Aug4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceTaskCreation {
    public static void main(String[] args) {
        
    	WebDriverManager.chromedriver().setup();
    	
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("dharsinieee@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Archanadharsini07*");
        driver.findElement(By.id("Login")).click();

        
        driver.findElement(By.xpath("//div[contains(@class,'slds-global-actions')]")).click();

        
        driver.findElement(By.xpath("//button[@title='View All']")).click();

        
        WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']"));
        searchInput.sendKeys("task");
        driver.findElement(By.xpath("//p[text()='Task']")).click();

        
        driver.findElement(By.xpath("//a[contains(@title,'New Task')]")).click();

        
        WebElement subjectInput = driver.findElement(By.xpath("//span[text()='Subject']/../following-sibling::input"));
        subjectInput.sendKeys("Bootcamp");

        
        driver.findElement(By.xpath("//span[text()='Status']/../following-sibling::div//a")).click();
        driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();

        
        driver.findElement(By.xpath("//button[@title='Save']")).click();

        
        WebElement successMessage = driver.findElement(By.xpath("//span[text()='Task created']"));

        if (successMessage.isDisplayed()) {
            System.out.println("Test passed. 'Task created' message displayed.");
        } else {
            System.out.println("Test failed. 'Task created' message not displayed.");
        }

        
        driver.quit();
    }
}
