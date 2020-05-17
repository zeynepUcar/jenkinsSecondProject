package utilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    //singleton

    private static WebDriver driver;


    public static WebDriver getDriver(){

        if (driver == null){ //i need to learn well
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;

    }

    public static void closeDriver(){

        if (driver!= null){
            driver.quit();
            driver = null;
        }

    }
}
