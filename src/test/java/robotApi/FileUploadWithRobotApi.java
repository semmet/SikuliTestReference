package robotApi;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public class FileUploadWithRobotApi {

    Robot robot;

    @Test
    public void fileUplode() throws Exception {

        robot = new Robot();

        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("http://demo.automationtesting.in/Register.html");


        robot.setAutoDelay(2000);

        StringSelection stringSelection = new StringSelection("");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        robot.mouseMove(600, 500);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON2_MASK);

        robot.mouseWheel(300);

        Color color = robot.getPixelColor(100,100);
        System.out.println("Red : " + color.getRed());
        System.out.println("Green : " + color.getGreen());
        System.out.println("Blue : " + color.getBlue());

        Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

    }


    }

