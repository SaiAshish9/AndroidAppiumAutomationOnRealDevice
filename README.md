```
https://appium.io/docs/en/writing-running-appium/caps/
https://appium.io/docs/en/commands/session/create/
```

```
{
  "platformName": "Android",
  "platformVersion": "11.0",
  "deviceName": "Pixel 2",
  "app": "/Users/saiashishdarapureddy/Desktop/folders/IOS Development/XCUIAutomationScripts/ApiDemos-debug.apk",
  "appPackage": "io.appium.android.apis",
  "appActivity": ".view.TextFields",
  "automationName": "UIAutomator2"
}
```

``` 
IntelliJ => New Project => Gradle ( Eclipse IDE for Java Developers )
```

```
adb shell dumpsys window | grep -E mCurrentFocus 

used for current appPackage and appActivity
```

```
adb devices for udid
```
