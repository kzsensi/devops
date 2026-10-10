package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxVisibilityTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement inputBox = driver.findElement(By.tagName("input"));

        if (inputBox.isDisplayed()) {
            System.out.println("Test Passed: input box is visible");
        } else {
            System.out.println("Test Failed: input box is not visible");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
