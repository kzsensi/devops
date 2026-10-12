package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLoadingStartButtonVisibilityTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));

        if (startButton.isDisplayed()) {
            System.out.println("Test Passed: start button is visible");
        } else {
            System.out.println("Test Failed: start button is not visible");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
