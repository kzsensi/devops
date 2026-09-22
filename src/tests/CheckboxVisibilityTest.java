package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxVisibilityTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        if (checkbox1.isDisplayed()) {
            System.out.println("Test Passed: checkbox is visible");
        } else {
            System.out.println("Test Failed: checkbox is not visible");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}