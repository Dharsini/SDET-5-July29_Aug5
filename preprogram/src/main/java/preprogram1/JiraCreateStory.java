package preprogram1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class JiraCreateStory

{
    public static void main(String[] args) throws Exception 
    
    {
        
       WebDriverManager.chromedriver().setup();
       
       WebDriver driver = new ChromeDriver();

        
       driver.get("https://api-training.atlassian.net/");

        
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();

        
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
            
        usernameField.sendKeys(" hari.radhakrishnan@testleaf.com");
        passwordField.sendKeys("India@123");

       
        WebElement submitButton = driver.findElement(By.id("login-submit"));
        submitButton.click();

        
        Thread.sleep(5000);

        
        WebElement createButton = driver.findElement(By.id("create_link"));
        createButton.click();

        
        WebElement issueTypeField = driver.findElement(By.id("issuetype-field"));
        issueTypeField.click();
        WebElement storyOption = driver.findElement(By.id("issuetype-suggestions-issuetype-story"));
        storyOption.click();

        
        WebElement summaryField = driver.findElement(By.id("summary"));
        WebElement descriptionField = driver.findElement(By.id("description"));
            
        summaryField.sendKeys("SDET-5 Test Story Summary");
        descriptionField.sendKeys("This is a SDET-5 test story created using Selenium.");

        
        WebElement createIssueButton = driver.findElement(By.id("create-issue-submit"));
        createIssueButton.click();

       
        Thread.sleep(5000);

        System.out.println("Test story created successfully!");

        
        driver.quit();
    }
}

            
