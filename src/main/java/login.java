import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class login {
    String url;
    WebDriver driver;

    @Before
    public void inicializar() {

        url = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "c:\\temp\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void finalizar() {
        driver.quit();
    }

    @Test
    public void automacao() throws InterruptedException {

        driver.get(url);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
        Thread.sleep(5000);
    }


}

