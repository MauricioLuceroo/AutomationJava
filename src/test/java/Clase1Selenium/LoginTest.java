package Clase1Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        LoginTestExitoso();
    }public static void LoginTestExitoso(){
        System.out.println("Test: Login Exitoso");
            WebDriver driver = null;
            try {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.get("https://sauce-demo.myshopify.com/");
            }catch ( Exception e){
                throw new RuntimeException(e);
            }
    }
}
