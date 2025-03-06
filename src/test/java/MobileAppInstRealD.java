import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileAppInstRealD {

            public static void main(String[] args) throws MalformedURLException, InterruptedException {
                DesiredCapabilities Dcp =new DesiredCapabilities();
                Dcp.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
                Dcp.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
                Dcp.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
                Dcp.setCapability(MobileCapabilityType.DEVICE_NAME,"CPH1823");
                Dcp.setCapability(MobileCapabilityType.UDID,"NNHAQOM7YPSGW4Z9");
//                Dcp.setCapability("appPackage", "rs.webrest.ar");
//                Dcp.setCapability("appActivity", "rs.webrest.ar.MainActivity");
                Dcp.setCapability("ignoreHiddenApiPolicyError", true);
                Dcp.setCapability("noReset", true);  // Prevents resetting app state
                Dcp.setCapability("fullReset", false);
                //Give or update the pathh accourding to apk saved for install
                Dcp.setCapability(MobileCapabilityType.APP,"D:\\InspectorAPk\\AR_30May2024-11-14-09_release.apk");
                URL url = new URL("http://127.0.0.1:4723/wd/hub");


                System.out.println("Android Driver is started");


                AppiumDriver<MobileElement> driver = new AndroidDriver<>(url, Dcp);


                //driver.quit();




    }



}
