import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCalculmob {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities Dcp = new DesiredCapabilities();
        Dcp.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        Dcp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        Dcp.setCapability("appium:ignoreHiddenApiPolicyError", true);
//        Dcp.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
//        Dcp.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        // Automatically detect the connected device using adb command
        String deviceName = System.getenv("ANDROID_DEVICE") != null ? System.getenv("ANDROID_DEVICE") : "Android";
        Dcp.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);

        Dcp.setCapability("appPackage", "com.vivo.calculator");
        Dcp.setCapability("appActivity", "com.vivo.calculator.Calculator");
        Dcp.setCapability(MobileCapabilityType.NO_RESET, true);
        //Give or update the pathh accourding to apk saved for install
        // Dcp.setCapability(MobileCapabilityType.APP,"D:\\InspectorAPk\\com.the511plus.MultiTouchTester.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        System.out.println("Android Driver is started");


        AppiumDriver driver = new AppiumDriver(url, Dcp);
        Thread.sleep(5000);

        WebElement btn7= driver.findElement(By.id("com.vivo.calculator:id/digit_7"));
        btn7.click();

        WebElement btnPlus =driver.findElement(By.id("com.vivo.calculator:id/op_add"));
        btnPlus.click();

        WebElement btn8= driver.findElement(By.id("com.vivo.calculator:id/digit_8"));
        btn8.click();
        WebElement btnAns= driver.findElement(By.id("com.vivo.calculator:id/eq"));
        btnAns.click();

        WebElement btnMinu = driver.findElement(By.id("com.vivo.calculator:id/op_sub"));

        WebElement btn3 =driver.findElement(By.id("com.vivo.calculator:id/digit_3"));

        btnMinu.click();
        btn8.click();
        btnAns.click();
        btnPlus.click();
        btn3.click();
        btnAns.click();








    }
}