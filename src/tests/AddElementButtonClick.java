package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddElementButtonClick {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        WebElement deleteButton = driver.findElement(By.className("added-manually"));

        if (deleteButton.isDisplayed()) {
            System.out.println("Test Passed: Delete button is displayed after clicking Add Element");
        } else {
            System.out.println("Test Failed: Delete button is not displayed");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}