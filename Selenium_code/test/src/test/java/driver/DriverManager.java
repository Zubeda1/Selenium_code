package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

    public class DriverManager {
        public DriverManager()
        {
            PageFactory.initElements(driver, this);
        }
        public static WebDriver driver;
        private String browser ="chrome";

        public void runOnChrome(){
            switch(browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    break;
                default:
                    driver = new FirefoxDriver();
            }
        }
        public void applyimplicitwait(){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        public void navigateTo (){
            driver.get("http://todomvc.com/examples/react/#/");
        }
        public void closeBrowser(){
            driver.quit();
        }




    }




