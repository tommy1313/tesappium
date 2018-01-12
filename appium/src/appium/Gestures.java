package appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//tap
		TouchAction t = new TouchAction(driver);
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
	}

}
