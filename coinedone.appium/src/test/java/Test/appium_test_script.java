package Test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class appium_test_script {
	public static String app_url="https://c1-client.herokuapp.com/login";
	public static  WebDriver d;	
	@ Test
	public static void class_time_shedule() throws MalformedURLException , InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo TB-8505F");
		cap.setCapability(MobileCapabilityType.UDID, "HA1G5XE0");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");	
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap. setCapability("chromeOptions", ImmutableMap.of("w3c", false));	
		cap.setCapability("autoGrantPermissions", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		d =new AppiumDriver<MobileElement>(url, cap);
		d.get(app_url);
		Thread.sleep(4000);
		MobileElement usrname = d.findElement(By.id("TextField0"));
		usrname.sendKeys("Nandu@mailinator.com");
		Thread.sleep(3000);
		MobileElement passwrd=  d.findElement(By.id("TextField3"));
		passwrd.sendKeys("123456");
		Thread.sleep(3000);
		MobileElement login= d.findElement(By.id("id__6"));
		login.click();
		System.out.println("application launched");

		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[contains(text(),'Schedule')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[contains(text(),'Add Days')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[5]/div[3]/ul[1]/div[1]/ul[1]/div[4]/div[1]")).click();
		Thread.sleep(3000);
		//setup time
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		//am_slot
		d.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]/h6[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[contains(text(),'OK')]")).click();	
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		//pms_slot
		d.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]/h6[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/div[4]/button[1]/span[1]")).click();		
		Thread.sleep(4000);
		d.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[2]/p[1]/div[1]/button[2]/span[1]")).click();
		Thread.sleep(3000);
		System.out.println("Time sheduled for class");
		Thread.sleep(3000);
		d.quit();}


	@ Test
	public static void study_time_shedule() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo TB-8505F");
		cap.setCapability(MobileCapabilityType.UDID, "HA1G5XE0");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");	
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap. setCapability("chromeOptions", ImmutableMap.of("w3c", false));	
		cap.setCapability("autoGrantPermissions", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		d =new AppiumDriver<MobileElement>(url, cap);
		d.get(app_url);
		Thread.sleep(4000);

		MobileElement usrname = d.findElement(By.id("TextField0"));
		usrname.sendKeys("Nandu@mailinator.com");
		Thread.sleep(3000);
		MobileElement passwrd=  d.findElement(By.id("TextField3"));
		passwrd.sendKeys("123456");
		Thread.sleep(3000);
		MobileElement login= d.findElement(By.id("id__6"));
		login.click();
		System.out.println("application launched");

		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[contains(text(),'Schedule')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id='demo-customized-select']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='menu- ']/div[3]/ul[1]/li[2]")).click();
		Thread.sleep(3000);	
		d.findElement(By.xpath("//span[contains(text(),'Add Days')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[5]/div[3]/ul[1]/div[1]/ul[1]/div[5]/div[1]")).click();
		Thread.sleep(3000);
		//setup time
		MobileElement element1 = d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		element1.click();
		Thread.sleep(2000);
		//am_slot
		MobileElement element4 = d.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]/h6[1]"));
		element4.click();
		Thread.sleep(3000);
		MobileElement element5 = d.findElement(By.xpath("//span[contains(text(),'OK')]"));
		element5.click();
		Thread.sleep(2000);
		MobileElement element6 = d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		element6.click();                                    
		Thread.sleep(3000);
		//pms_slot
		MobileElement element11 = d.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]/h6[1]"));
		element11.click();
		Thread.sleep(3000);
		MobileElement element9 = d.findElement(By.xpath("//span[contains(text(),'OK')]"));
		element9.click();
		Thread.sleep(3000);
		MobileElement element10 = d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/div[1]/div[4]/button[1]/span[1]"));
		element10.click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[2]/p[1]/div[1]/button[2]/span[1]")).click();
		System.out.println("time sheduled for study");
		Thread.sleep(3000);
		d.quit();}

	@ Test
	public static void free_time_shedule() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo TB-8505F");
		cap.setCapability(MobileCapabilityType.UDID, "HA1G5XE0");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");	
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap. setCapability("chromeOptions", ImmutableMap.of("w3c", false));	
		cap.setCapability("autoGrantPermissions", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		d =new AppiumDriver<MobileElement>(url, cap);
		d.get(app_url);
		Thread.sleep(4000);

		MobileElement usrname = d.findElement(By.id("TextField0"));
		usrname.sendKeys("Nandu@mailinator.com");
		Thread.sleep(3000);
		MobileElement passwrd=  d.findElement(By.id("TextField3"));
		passwrd.sendKeys("123456");
		Thread.sleep(3000);
		MobileElement login= d.findElement(By.id("id__6"));
		login.click();
		System.out.println("application launched");

		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[contains(text(),'Schedule')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id='demo-customized-select']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='menu- ']/div[3]/ul[1]/li[3]")).click();
		Thread.sleep(3000);	
		d.findElement(By.xpath("//span[contains(text(),'Add Days')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[5]/div[3]/ul[1]/div[1]/ul[1]/div[3]/div[1]")).click();
		Thread.sleep(3000);
		//setup time
		MobileElement element1 = d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		element1.click();
		Thread.sleep(2000);
		//am_slot
		MobileElement element4 = d.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]/h6[1]"));
		element4.click();
		Thread.sleep(3000);
		MobileElement element5 = d.findElement(By.xpath("//span[contains(text(),'OK')]"));
		element5.click();
		Thread.sleep(2000);
		MobileElement element6 = d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		element6.click();                                    
		Thread.sleep(3000);
		//pms_slot
		MobileElement element10 = d.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]/h6[1]"));
		element10.click();
		Thread.sleep(3000);
		MobileElement element9 = d.findElement(By.xpath("//span[contains(text(),'OK')]"));
		element9.click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/div[1]/div[4]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[2]/p[1]/div[1]/button[2]/span[1]")).click();
		System.out.println("free time sheduled");
		Thread.sleep(3000);
		d.quit();
	}

	@ Test
	public static void class_time_restriction() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo TB-8505F");
		cap.setCapability(MobileCapabilityType.UDID, "HA1G5XE0");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");	
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap. setCapability("chromeOptions", ImmutableMap.of("w3c", false));	
		cap.setCapability("autoGrantPermissions", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		d =new AppiumDriver<MobileElement>(url, cap);
		d.get(app_url);
		Thread.sleep(4000);

		MobileElement usrname = d.findElement(By.id("TextField0"));
		usrname.sendKeys("Nandu@mailinator.com");
		Thread.sleep(3000);

		MobileElement passwrd=  d.findElement(By.id("TextField3"));
		passwrd.sendKeys("123456");
		Thread.sleep(3000);

		MobileElement login= d.findElement(By.id("id__6"));
		login.click();

		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[contains(text(),'Class-time')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[3]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/label[1]/span[1]/span[1]/input[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[3]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		d.quit();
	}
	@ Test
	public static void Study_time_restriction() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo TB-8505F");
		cap.setCapability(MobileCapabilityType.UDID, "HA1G5XE0");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");	
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap. setCapability("chromeOptions", ImmutableMap.of("w3c", false));	
		cap.setCapability("autoGrantPermissions", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		d =new AppiumDriver<MobileElement>(url, cap);
		d.get(app_url);
		Thread.sleep(4000);

		MobileElement usrname = d.findElement(By.id("TextField0"));
		usrname.sendKeys("Nandu@mailinator.com");
		Thread.sleep(3000);

		MobileElement passwrd=  d.findElement(By.id("TextField3"));
		passwrd.sendKeys("123456");
		Thread.sleep(3000);

		MobileElement login= d.findElement(By.id("id__6"));
		login.click();

		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@id='Study-time']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[3]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[3]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		MobileElement apps=	d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		apps.sendKeys("byju");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[2]/nav[1]/li[1]/div[2]/label[1]/span[1]/span[1]/input[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[3]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		d.quit();}

	@ Test
	public static void free_time_restriction() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo TB-8505F");
		cap.setCapability(MobileCapabilityType.UDID, "HA1G5XE0");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");	
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap. setCapability("chromeOptions", ImmutableMap.of("w3c", false));	
		cap.setCapability("autoGrantPermissions", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		d =new AppiumDriver<MobileElement>(url, cap);
		d.get(app_url);
		Thread.sleep(4000);

		MobileElement usrname = d.findElement(By.id("TextField0"));
		usrname.sendKeys("Nandu@mailinator.com");
		Thread.sleep(3000);
		MobileElement passwrd=  d.findElement(By.id("TextField3"));
		passwrd.sendKeys("123456");
		Thread.sleep(3000);

		MobileElement login= d.findElement(By.id("id__6"));
		login.click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@id='Free-time']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("https://demosite.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);}
}










