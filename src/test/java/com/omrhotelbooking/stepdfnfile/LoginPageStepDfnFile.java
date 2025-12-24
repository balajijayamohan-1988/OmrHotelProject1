package com.omrhotelbooking.stepdfnfile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDfnFile {
	WebDriver driver;
	
	@Given("User is on omrHotel page")
	public void user_is_on_omr_hotel_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.omrbranch.com/");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {

	}

	@When("User click the login button")
	public void user_click_the_login_button() {

	}

	@Then("user should verify after login success message")
	public void user_should_verify_after_login_success_message() {

	}
}
