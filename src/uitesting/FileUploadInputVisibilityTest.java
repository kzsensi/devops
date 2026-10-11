package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadInputVisibilityTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement fileInput = driver.findElement(By.id("file-upload"));

        if (fileInput.isDisplayed()) {
            System.out.println("Test Passed: file upload input is visible");
        } else {
            System.out.println("Test Failed: file upload input is not visible");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
