package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addbuttonvisibility {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));

        if (addButton.isDisplayed()) {
            System.out.println("Test Passed: Add Element button is visible");
        } else {
            System.out.println("Test Failed: Add Element button is not visible");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}