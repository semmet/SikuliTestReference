import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ScreenshotTest {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void captureScreenShotTest1(){
        driver.navigate().to("http://spree.shiftedtech.com/");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);


    }
}
