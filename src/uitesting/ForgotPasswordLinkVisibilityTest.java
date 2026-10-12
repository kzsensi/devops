package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordLinkVisibilityTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement forgotPassword = driver.findElement(By.id("forgot_password"));

        if (forgotPassword.isDisplayed()) {
            System.out.println("Test Passed: forgot password link is visible");
        } else {
            System.out.println("Test Failed: forgot password link is not visible");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
