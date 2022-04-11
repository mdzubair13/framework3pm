package org.stepDefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.HelperClass;
import org.pojo.ForgettenPojo;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllDetailClass  extends HelperClass{
	LoginPojo l;
	ForgettenPojo f;
	
	@Given("browser lunch")
	public void browser_lunch() {
	   launchChromeBrowser();
	   getUrl("https://www.facebook.com/");
	}

	@When("login button")
	public void login_button() {
		f= new ForgettenPojo();
		btnClick(f.getForgpass());
		
	}

	@Then("close the browser")
	public void close_the_browser() {
	  closeBroswer();
	}
	@Given("to open facebook through chrome")
	public void to_open_facebook_through_chrome() {
	   launchChromeBrowser();
	   getUrl("https://www.facebook.com/");
	}

	@When("user have enter valid user and invalid password")
	public void user_have_enter_valid_user_and_invalid_password(io.cucumber.datatable.DataTable d) {
	 //1D
		Map<String, String> m = d.asMap(String.class, String.class);
		String email = m.get("emailid");
		String pass = m.get("password");
		l = new LoginPojo();
		fill(l.getTxtuser(), email);
		fill(l.getTxtpass(), pass);
	}

	@Then("invalid password msg")
	public void invalid_password_msg() {
	   System.out.println("end");
	}

	@When("user have enter valid user and valid password")
	public void user_have_enter_valid_user_and_valid_password(io.cucumber.datatable.DataTable d) {
		//2D		
		List<Map<String, String>> a = d.asMaps();
		String email = a.get(2).get("username");
		String pass = a.get(1).get("password");
		
		l = new LoginPojo();
		fill(l.getTxtuser(), email);
		fill(l.getTxtpass(), pass);
		
		
	}


}
