import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
//        desiredCapabilities.setCapability("udid", "9621353782000QI");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Any Device Name");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
        desiredCapabilities.setCapability("appActivity", ".ApiDemos");
//        desiredCapabilities.setCapability("avd", "");
//        IF APP IS ALREADY INSTALLED < COMMENT BELOW LINE
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/saiashishdarapureddy/Desktop/folders/IOS Development/XCUIAutomationScripts/ApiDemos-debug.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
        String sessionId = driver.getSessionId().toString();
    }

//    install apk info on the app
//    activities available on the app

}
