package com.sce.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



/***
 * 
 * @author William
 * Web Automation Demo
 * @date 20180427
 */
public class DemoTest {
	//    System.setProperty("webdriver.chrome.driver","/Users/zhangcheng/eclipse-workspace/WebAutomationDemo/tools/chromedriver")；
	//	WebDriver driver = new ChromeDriver();
	//	driver.get("www.baidu.com");

	//	public static void main() {
	//		WebDriver driver = new ChromeDriver();
	//		driver.get("www.baidu.com");
	//	}

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","tools/chromedriver");
		//		System.setProperties("webdriver.chrome.driver","/Users/zhangcheng/eclipse-workspace/WebAutomationDemo/tools/chromedriver");
		WebDriver driver = null;

		DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(desiredCapabilities);

        Thread.sleep(5000);
        System.out.println("等待浏览器启动");
		driver.get("http://www.baidu.com");
	}

}
