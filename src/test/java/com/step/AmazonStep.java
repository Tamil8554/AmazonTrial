package com.step;

import java.io.IOException;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.AmazonBase;
import com.pojo.AmazonPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AmazonStep extends AmazonBase {
	public static AmazonPojo p;	
	
	@Given("To launch url")
	public void to_launch_url() {
	
		launchUrl("https://www.amazon.in/");
		maximize();
		wait(5);
	    
	}

	@When("To click signIn button")
	public void to_click_sign_in_button() throws InterruptedException {
	    p = new AmazonPojo();
	    p.move(p.getHelloSignIn());
	    sleep(2000);
	    click(p.getHelloSignIn());
	   // click(p.getCart());
	}
	
	@When("To click signIn")
	public void to_click_sign_in() {
	    p = new AmazonPojo();
	    click(p.getSignIn());
	}

	@When("To enter valid mailID")
	public void to_enter_valid_mail_id() throws IOException {
	    p = new AmazonPojo();
	    String data = data(1,1);
	    fill(p.getEmailId(), data);
	    
	}
	@When("To enter valid password")
	public void to_enter_valid_password() throws IOException {
		p = new AmazonPojo();
	    String data = data(2,2);
	    fill(p.getPassWord(), data);
	}

	@When("To click continue button")
	public void to_click_continue_button() {
	    p = new AmazonPojo();
	    click(p.getContinueButton());
	}	
	
	
	@When("To enter invalid mailID")
	public void to_enter_invalid_mail_id() throws IOException {
		  p = new AmazonPojo();
		    String data = data(2,1);
		    fill(p.getEmailId(), data);
	}


	@When("To enter invalid password")
	public void to_enter_invalid_password() throws IOException {
		p = new AmazonPojo();
	    String data = data(1,2);
	    fill(p.getPassWord(), data);
	    
	}
	
	@When("To check the error message")
	public void to_check_the_error_message() {
		p = new AmazonPojo();
		String text=p.getErrorMessage().getText();
		//System.out.println(text);
		
	    
	}
	
	@When("To check the error message with assertion")
	public void to_check_the_error_message_with_assertion() {
		
		p = new AmazonPojo();
		String text=p.getErrorMessage().getText();
		System.out.println(text);
		Assert.assertEquals("Entered mail id is wrong", text);
	    
	}


	

	
	  @Then("To take screenshot1") 
	  public void to_take_screenshot1() throws IOException, InterruptedException { 
		  sleep(2000);
		  screenShot("C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\Evidences\\AfterLogIn.png");
		  }
	  
	  @Then("To take screenshot2")
	  public void to_take_screenshot2() throws  IOException, InterruptedException {
		  sleep(2000);
		  screenShot(
	  "C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\Evidences\\invalidPassword.png");
	  }
	  
	  @Then("To take screenshot3") 
	  public void to_take_screenshot3() throws IOException, InterruptedException 
	  { 
		  sleep(2000);
		  screenShot(
	  "C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\Evidences\\invalidMailID.png");
	  }
	 
	@Then("To take screenshot4")
	public void to_take_screenshot4() throws IOException, InterruptedException {
		sleep(2000);
		screenShot("C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\Evidences\\iphoneOrder.png");
	}
	@Then("To take screenshot5")
	public void to_take_screenshot5() throws IOException, InterruptedException {
		sleep(2000);
		screenShot("C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\Evidences\\iphoneChangedOrder1.png");
	}
	@Then("To take screenshot6")
	public void to_take_screenshot6() throws IOException, InterruptedException {
		sleep(2000);
		screenShot("C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\Evidences\\iphoneChangedOrder2.png");
	   
	}
	@Then("To take screenshot7")
	public void to_take_screenshot7() throws IOException, InterruptedException {
		sleep(2000);
		screenShot("C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\Evidences\\skyBagOrder.png");
	    
	}
	@Then("To take screenshot8")
	public void to_take_screenshot8() throws IOException, InterruptedException {
		sleep(2000);
		screenShot("C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\Evidences\\debitCardSelection.png");
	    
	}


	
	@When("To enter value iphone13 in search option")
	public void to_enter_value_iphone13_in_search_option() {
		p = new AmazonPojo();
		fill(p.getSearchBar(), "iphone13");
		
	  
	}
	@When("To scroll down to product iphone13")
	public void to_scroll_down_to_product_iphone13() throws InterruptedException {
		p = new AmazonPojo();
		scrollDown(p.getIphone13());
		sleep(3000);
	}
	
	@When("To select Apple iPhone {int} \\(128GB) - \\(Product) RED")
	public void to_select_apple_i_phone_128gb_product_red(Integer int1) {
		p = new AmazonPojo();
		click(p.getIphone13());
	    
	}
	
	@When("To click add to cart button")
	public void to_click_add_to_cart_button() throws InterruptedException {
		window(1);
		p = new AmazonPojo();
		click(p.getAddToCart());
		sleep(2000);
		driver.findElement(By.id("attach-close_sideSheet-link")).click();
	    
	}
	@When("To click cart button")
	public void to_click_cart_button() throws InterruptedException {
		window(1);
		sleep(2000);
		//driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		click(p.getCart());
	}


	@When("To change the order quantity")
	public void to_change_the_order_quantity() {
		window(1);
		p = new AmazonPojo();
		click(p.getQtyButton());
		click(p.getQty2());		
	  
	}

	@When("To go to homepage")
	public void to_go_to_homepage() {
		window(1);
		p = new AmazonPojo();
		click(p.getHomeButton());
		
	   
	}

	@When("To go to cart page")
	public void to_go_to_cart_page() {
		window(1);
		p = new AmazonPojo();
		click(p.getCart());
	    
	}

	@When("To decrease the order quantity")
	public void to_decrease_the_order_quantity() {
		window(1);
		p = new AmazonPojo();
		click(p.getQtyButton());
		click(p.getQty1());	
	}

	@When("To enter value backbag in search option")
	public void to_enter_value_backbag_in_search_option() {
		window(1);
		p = new AmazonPojo();
		fill(p.getSearchBar(), "backbag");
	    
	}

	@When("To scroll down to product SkyBags")
	public void to_scroll_down_to_product_sky_bags() throws InterruptedException {
		window(1);
		p = new AmazonPojo();
		scrollDown(p.getSkyBag());
		sleep(3000);
	  
	}

	@When("To select product SkyBags")
	public void to_select_product_sky_bags() {
		window(1);
		p = new AmazonPojo();
		click(p.getSkyBag());
	    
	}
	
	@When("To click add to cart button in SkyBag window")
	public void to_click_add_to_cart_button_in_sky_bag_window() {
		window(2);
		p = new AmazonPojo();
		click(p.getAddToCart());
		
	    
	}

	@When("To click proceed to buy option")
	public void to_click_proceed_to_buy_option() {
		window(2);
		p = new AmazonPojo();
		click(p.getProceedToBuyButton());
	    
	}
	
	@When("To conform delivery address")
	public void to_conform_delivery_address() throws InterruptedException {
		window(2);
		p = new AmazonPojo();
		click(p.getUseThisAddressButton());
		sleep(2000);
	    
	}
	@When("To select Pay with Debit card option")
	public void to_select_pay_with_debit_card_option() throws InterruptedException {
		window(2);
		p = new AmazonPojo();
		click(p.getDebitCardOption());
		sleep(3000);
	}
	@When("To click Enter card details option")
	public void to_click_enter_card_details_option() throws InterruptedException {
		window(2);
		p = new AmazonPojo();
		click(p.getEnterCardDetailsButton());
		sleep(3000);
	    
	}
	
	@When("To click cart button in homepage")
	public void to_click_cart_button_in_homepage() {
		window(0);
		p = new AmazonPojo();
		click(p.getCart());		
	    
	}
	
	@When("To delete first order")
	public void to_delete_first_order() throws InterruptedException {
		sleep(2000);
		p = new AmazonPojo();
		click(p.getDeleteButton1());
	  
	}
	@When("To delete second order")
	public void to_delete_second_order() throws InterruptedException {
		sleep(5000);
		p = new AmazonPojo();
		click(p.getDeleteButton2());
	   
	}

}
