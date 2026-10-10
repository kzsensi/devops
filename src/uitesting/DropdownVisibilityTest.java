package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownVisibilityTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));

        if (dropdown.isDisplayed()) {
            System.out.println("Test Passed: dropdown is visible");
        } else {
            System.out.println("Test Failed: dropdown is not visible");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
