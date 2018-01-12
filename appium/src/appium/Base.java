package appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		File f = new File("src"); //src itu foldernya
		File fs = new File(f, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5emulator");
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath()); //absolutepath biar dia ambil sendiri path apknya jadi di masing2 machine bisa dapet pathnya ketimbang di hardcode
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap); //connect ke server dan kasih parameter connect kemana dan capability apa
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
		//AndroidUIAutomator
		
		
		
	}

}
