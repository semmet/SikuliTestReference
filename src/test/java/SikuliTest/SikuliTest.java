package SikuliTest;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SikuliTest {

    @Test
    public void test1() throws FindFailed {

        Screen screen = new Screen();

        Pattern chooseFileButton = new Pattern();
        Pattern fileName = new Pattern();
        Pattern openButton = new Pattern();

        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("http://demo.automationtesting.in/Register.html");

        screen.click(chooseFileButton);
        screen.type(fileName, "");
        screen.click(openButton) ;




    }


}
