package appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basic extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		//xpath id className, androidUIAutomator
		/*xpath syntax
		 *	//tagname[@attribute='value']
		 *tagname bisa diisi className 
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click(); //android.widget.TextView itu class yang diambil di UIAutomatorViewer
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click(); //pake xpathnya sampe nama class (ga pake attribute='value' nya) terus kasih kondisi ambil element yang kedua, karena di class ini ada 2 instance
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello"); //cara typing
		driver.findElementsByClassName("android.widget.Button").get(1).click(); //ketika classnamenya ga unique dan mau ambil element kedua
	}

}
