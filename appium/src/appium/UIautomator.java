package appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomator extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		// syntax driver.findElementByAndroidUIAutomator("attribute(\"value\")") quote in quote harus kasih backslash
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		// validate clickable feature for all options
			// driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size()); //UiSelector buat pilih properties di uiautomator //katanya ngebug ni appium jd hasilnya salah, katanya sih jalan di appium 1.6.5
	}

}
