import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCalcwith2 {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities Dcp = new DesiredCapabilities();
        Dcp.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        Dcp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        Dcp.setCapability("appium:ignoreHiddenApiPolicyError", true);
//        Dcp.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
//        Dcp.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        // Automatically detect the connected device using adb command
        String deviceName = System.getenv("ANDROID_DEVICE") != null ? System.getenv("ANDROID_DEVICE") : "Android";
        Dcp.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        // Set APK file from Project Root Folder
        String apkPath = System.getProperty("user.dir") + "\\InspectorAPk\\com.design.smoon-1.5-APK4Fun.com.apk";
        Dcp.setCapability(MobileCapabilityType.APP, apkPath);
        Dcp.setCapability("appPackage", "com.design.smoon");
        Dcp.setCapability("appActivity", "com.design.smoon.activities.SplashActivity");
        Dcp.setCapability(MobileCapabilityType.NO_RESET, true);
        //Give or update the pathh accourding to apk saved for install
        // Dcp.setCapability(MobileCapabilityType.APP,"D:\\InspectorAPk\\com.the511plus.MultiTouchTester.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        System.out.println("Android Driver is started");


        AndroidDriver driver = new AndroidDriver(url, Dcp);

        WebElement close = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.design.smoon:id/md_buttonDefaultPositive\"]"));
        close.click();
        Thread.sleep(5000);
        WebElement share = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.design.smoon:id/share\"]"));
        share.click();

        Thread.sleep(5000);
        driver.removeApp("com.design.smoon");
        driver.quit();


    }

    }
