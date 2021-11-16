package ru.deliveryClub;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    @Test
    public void FirstTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.delivery-club.ru/");
        driver.quit();

    }


}
