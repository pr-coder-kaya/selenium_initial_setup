import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C;\\.......chromedriver.exe"); // it must be ended with .exe extension for Windows OS

        System.setProperty("webdriver.chrome.driver", "/Users/akinkaya/IdeaProjects/selenium_initial_setup/chromedriver"); // for macOS

        WebDriver driver = new ChromeDriver(); // Instantiating ChromeDriver
        driver.get("https://www.google.com/"); // Navigate to URL
        driver.quit(); // Quit driver instance
    }
}
