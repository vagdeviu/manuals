package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class General extends Global{
//Reusable functions
public void openApplication() {
System.setProperty("webdriver.chrome.driver","E:\\vagdevi\\drivers\\chromedriver_win32\\ChromeDriver.exe");
driver = new ChromeDriver();
driver.navigate().to(url);
System.out.println("App Opened");
}
public void closeApplication() {
	driver.close();
	System.out.println("App Closed");
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
System.out.println("Login Completed");
}

public void Addemp() throws Exception {
	driver.switchTo().frame(frameid);
	driver.findElement(By.xpath(xpath_Add)).click();
	driver.findElement(By.name(txt_lastname)).sendKeys(ln);
	driver.findElement(By.name(txt_Firstname)).sendKeys(fn);
	driver.findElement(By.id(btn_save)).click();
	System.out.println("Added emp");
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
}
public void delemp() throws Exception {
	driver.switchTo().frame(frameid);
	Select st=new Select(driver.findElement(By.name(delemp_name)));
	st.selectByVisibleText(del_empid);
	driver.findElement(By.name(del_fename))).Sendkeys(del_id));
	driver.findElement(By.xpath(del_xpath)).click();
	driver.findElement(By.name("chkLocID[]")).click();
	driver.findElement(By.xpath("//input[@value='Delete']")).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	

	
}

public void logout() {
	driver.findElement(By.linkText(btn_logout)).click();
	System.out.println("logout Completed");
}
}
