package com.step;

import com.pojo.AmazonPojo;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends AmazonPojo {
	
	@Before
	public static void openBrowser() {
		launchBrowser();
	}
	
	@After
	
	public static void closeBrowser() {
		close();

	}

}
