package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {

    public static final String XPATH_COOKIE = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String XPATH_OPEN_REGISTRATION_FORM = "//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_BIRTH_DAY =  "//select[@name=\"birthday_day\"]";
    public static final String XPATH_BIRTH_MONTH = "//select[@name=\"birthday_month\"]";
    public static final String XPATH_BIRTH_YEAR = "//select[@name=\"birthday_year\"]";
    public static final String FORM_IS_LOADED = "//span[@class=\"_5k_4\"]";


    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");
        driver.findElement(By.xpath(XPATH_COOKIE)).click();
        driver.findElement(By.xpath(XPATH_OPEN_REGISTRATION_FORM)).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FORM_IS_LOADED)));

        WebElement birthDay = driver.findElement(By.xpath(XPATH_BIRTH_DAY));
        Select day = new Select(birthDay);
        day.selectByValue("1");

        WebElement birthMonth = driver.findElement(By.xpath(XPATH_BIRTH_MONTH));
        Select month = new Select(birthMonth);
        month.selectByValue("1");

        WebElement birthYear = driver.findElement(By.xpath(XPATH_BIRTH_YEAR));
        Select year = new Select(birthYear);
        year.selectByValue("2000");

    }
}