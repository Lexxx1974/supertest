package ru.sf;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class StepDefinitions {
    private static  WebDriver webDriver1;
    static {
            System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/untitled2/src/test/resources/chromedriver.exe" );
            webDriver1 = new ChromeDriver();
    }

    @Given("url of h&m {string}")
    public void url_of_h_m(String url) {
        webDriver1.get(url);

    }

}
