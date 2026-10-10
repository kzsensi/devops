package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonVisibilityTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        if (loginButton.isDisplayed()) {
            System.out.println("Test Passed: login button is visible");
        } else {
            System.out.println("Test Failed: login button is not visible");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
