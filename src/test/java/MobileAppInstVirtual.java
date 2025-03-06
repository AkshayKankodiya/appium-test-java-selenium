import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileAppInstVirtual {
        @Test    public void main1() throws MalformedURLException, InterruptedException {
    //public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities Dcp =new DesiredCapabilities();
        Dcp.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        Dcp.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        Dcp.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        Dcp.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
        //Give or update the pathh accourding to apk saved for install
        Dcp.setCapability(MobileCapabilityType.APP,"D:\\InspectorAPk\\com.the511plus.MultiTouchTester.apk");
            Dcp.setCapability("appPackage", "com.the511plus.MultiTouchTester.MultiTouchTester");
            Dcp.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester - MultiTouch Tester");




        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        System.out.println("Android Driver is started");


        AndroidDriver driver= new AndroidDriver(url,Dcp);

        Thread.sleep(5000);

        driver.quit();











}}