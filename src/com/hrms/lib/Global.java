package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
//Test Data
	public String url = "http://183.82.125.5/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
public String ln = "Aman";
public String fn = "preet";	
public String del_id="0205";	
//Objects
public String txt_loginname = "txtUserName";
public String txt_password = "txtPassword";
public String btn_login = "Submit";
public String btn_logout = "Logout";
public String xpath_Add = "//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
public String txt_lastname = "txtEmpLastName";
public String txt_Firstname = "txtEmpFirstName";
public String btn_save = "btnEdit";
public String frameid="rightMenu";
public String delemp_name="loc_code";
public String del_empid="Emp. ID";
public String del_fename="loc_name";
public String del_xpath="//input[@value='Search']";
public String del_fename2="chkLocID[]";
public String del_xpath2="//input[@value='Delete']";



}
