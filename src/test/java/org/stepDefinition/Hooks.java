package org.stepDefinition;

import org.baseclass.HelperClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends HelperClass {
	
	
	@Before
	public void bef() {
	System.out.println("Bef");
	}
	
	@Before(order=2)
	public void bef1() {
	System.out.println("bef-2");
	}
	
	@Before(order=1)
	public void bef2() {
	System.out.println("bef-1");

	}
	
	@After
	
	public void aft(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot t=(TakesScreenshot)driver;
			byte[] sc = t.getScreenshotAs(OutputType.BYTES);
			s.embed(sc, "image/png");
		}
		
		
		System.out.println("aft");
	}
	
@After(order=1)
	public void aft1() {
		System.out.println("aft-1");
	}

@After(order=2)
public void aft2() {
	System.out.println("aft=2");
}

}
