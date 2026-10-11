package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsernameFieldVisibilityTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement username = driver.findElement(By.id("username"));

        if (username.isDisplayed()) {
            System.out.println("Test Passed: username field is visible");
        } else {
            System.out.println("Test Failed: username field is not visible");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
