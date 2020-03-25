package com.cts.Stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.AutomationPages.AddressPage;
import com.cts.AutomationPages.CheckOutPage;
import com.cts.AutomationPages.CheckOutPage2;
import com.cts.AutomationPages.ConfirmOrderPage;
import com.cts.AutomationPages.ContactUspPage;
import com.cts.AutomationPages.DetailsPage;
import com.cts.AutomationPages.HeaderPage;
import com.cts.AutomationPages.InitialPage;
import com.cts.AutomationPages.MainPage;
import com.cts.AutomationPages.PaymentPage;
import com.cts.AutomationPages.SelectionPage;
import com.cts.AutomationPages.ShippingCheckoutPage;
import com.cts.AutomationPages.deleteIconPage;
import com.cts.AutomationPages.saveAddressPage;
import com.cts.AutomationPages.signInDetailsPage;
import com.cts.AutomationPages.updatePage;
import com.cts.pages.CreateAccountPage;
import com.cts.pages.HomePage;
import com.cts.pages.SearchPage;
import com.cts.pages.SignOutPage;
import com.cts.pages.SigninPage;
import com.cts.pages.WishlistPage;
import com.cts.pages.popupmessagepage;
import com.cts.utils.ExcelUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logaStepDefinition {
	WebDriver driver;

	@Given("User have a browser with logaAutomationpage")
	public void user_have_a_browser_with_logaAutomationpage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}

	@When("click on signin button and User have to get the account details from ExcelSheet {string} and sheetname {string} and User should click on Register Button")
	public void click_on_signin_button_and_User_have_to_get_the_account_details_from_ExcelSheet_and_sheetname_and_User_should_click_on_Register_Button(
			String fileDetails, String sheetName) throws IOException {
		String str[][] = ExcelUtils.getSheetIntoStringArray(fileDetails, sheetName);
		HomePage.clickOnSignIn(driver);
		SigninPage.enterEmail(driver, str[0][0]);
		SigninPage.clickOnCreateAccount(driver);
		CreateAccountPage.fillRegForm(driver, str[0][1], str[0][2], str[0][3], str[0][4], str[0][5], str[0][6],
				str[0][7], str[0][8]);
	}

	@Then("the application navigate to next page contains page header as {string}")
	public void the_application_navigate_to_next_page_contains_page_header_as(String string) {
		SigninPage.getPageHeader(driver);
	}

	@When("click on signin button and User have to get the account details from ExcelSheet {string} and sheetname {string} and click on Register Button")
	public void click_on_signin_button_and_User_have_to_get_the_account_details_from_ExcelSheet_and_sheetname_and_click_on_Register_Button(
			String fileDetails, String sheetName) throws IOException {
		String str[][] = ExcelUtils.getSheetIntoStringArray(fileDetails, sheetName);
		HomePage.clickOnSignIn(driver);
		SigninPage.enterEmail(driver, str[1][0]);
		SigninPage.clickOnCreateAccount(driver);
//		CreateAccountPage.fillRegForm(driver, str[0][1], str[0][2], str[0][3], str[0][4], str[0][5], str[1][6],
//				str[0][7], str[0][8]);
	}

	@Then("the error message should print in the console")
	public void the_error_message_should_print_in_the_console() {

	}

	@When("click on signin button and user should click on login button and enter username as {string} and enter password as {string} and click on signin button")
	public void click_on_signin_button_and_user_should_click_on_login_button_and_enter_username_as_and_enter_password_as_and_click_on_signin_button(
			String emailid, String password) {
		HomePage.clickOnSignIn(driver);
		SigninPage.enterValidEmailAddresss(driver, emailid);
		SigninPage.enterValidPassword(driver, password);
		SigninPage.clickOnLogin(driver);
	}

	@Then("i should access to the portal with title as My account and click on SignOut")
	public void i_should_access_to_the_portal_with_title_as_My_account_and_click_on_SignOut() {
		SignOutPage.clickOnSignOut(driver);
	}

	@When("click on signin button and user should click login button and enter username as {string} and enter password as {string} and click on signin button")
	public void click_on_signin_button_and_user_should_click_login_button_and_enter_username_as_and_enter_password_as_and_click_on_signin_button(
			String emailid, String password) {
		HomePage.clickOnSignIn(driver);
		SigninPage.enterValidEmailAddresss(driver, emailid);
		SigninPage.enterValidPassword(driver, password);
		SigninPage.clickOnLogin(driver);
	}

	@Then("error message should print in the console")
	public void error_message_should_print_in_the_console() {
		SigninPage.getErrorText(driver);
	}

	@When("User enter {string} in search box")
	public void user_enter_in_search_box(String searchproduct) {

		HomePage.clickSearchIcon(driver, searchproduct);
		HomePage.clickSubmitIcon(driver);
	}

	@Then("Assert for the presence of Faded Short Sleeve T-shirts and close browser")
	public void assert_for_the_presence_of_Faded_Short_Sleeve_T_shirts_and_close_browser() {

		String shirtActualText = HomePage.getSearchShirtDetail(driver);
		Assert.assertEquals(shirtActualText, "Faded Short Sleeve T-shirts");
		System.out.println(shirtActualText);
	}

	@Then("Assert for the presence of No results were found for your search Tables element and close the browser")
	public void assert_for_the_presence_of_No_results_were_found_for_your_search_Tables_element_and_close_the_browser() {
		String errmsg = HomePage.getFailedmessage(driver);
		System.out.println(errmsg);

	}

	@When("User click on women Icon")
	public void user_click_on_women_Icon() {
		HomePage.clickWomenIcon(driver);
	}

	@When("move to tops and select for medium size and short sleeve button")
	public void move_to_tops_and_select_for_medium_size_and_short_sleeve_button() {

		SearchPage.clicktopsIcon(driver);
		SearchPage.clickmediumIcon(driver);
		SearchPage.clicksleeveIcon(driver);
	}

	@Then("check both the medium size and short sleeve is checked")
	public void check_both_the_medium_size_and_short_sleeve_is_checked() {
		System.out.println("checked");
		driver.quit();
	}

	@When("move to image icon")
	public void move_to_image_icon() {
		SearchPage.dressimage(driver);
	}

	@Then("User click on quantity icon")
	public void user_check_on_quantity_icon() {
		SearchPage.plusicon(driver);
		driver.quit();
	}

//	@When("Click on SignIn and username as {string} and password as {string} and Add to wishlistIcon and User enter {string} in search box")
//	public void click_on_SignIn_and_username_as_and_password_as_and_Add_to_wishlistIcon_and_User_enter_in_search_box(
//			String emailid, String password, String value) {
//		HomePage.clickOnSignIn(driver);
//		SigninPage.enterValidEmailAddresss(driver, emailid);
//		SigninPage.enterValidPassword(driver, password);
//		SigninPage.clickOnLogin(driver);
//		SearchPage.searchLoc(driver, value);
//		SearchPage.SearchButtonLoc(driver);
//		SearchPage.clickimage(driver);
//		WishlistPage.addToWishlist(driver);
//
//	}

	@When("The user click on signIn")
	public void the_user_click_on_signIn() {
		DetailsPage details = new DetailsPage(driver);
		details.clickSignIn();
	}

	@When("The user enter emailId {string} and Password {string} and click on SignIn")
	public void the_user_enter_emailId_and_Password_and_click_on_SignIn(String email, String Password) {

		signInDetailsPage signIn = new signInDetailsPage(driver);
		signIn.enterEmail(email);
		signIn.enterPassword(Password);
		signIn.clickSignIn();
	}

	@Then("The user should access to nextPage")
	public void the_user_should_access_to_nextPage() {
		HeaderPage header = new HeaderPage(driver);
		header.AccountClick();
		driver.quit();
	}

	@When("the user move to women and select required items")
	public void the_user_move_to_women_and_select_required_items() {
		SelectionPage select = new SelectionPage(driver);
		select.clickWomenMenu();

	}

	@Then("the user should navigate to the next page")
	public void the_user_should_navigate_to_the_next_page() {
		driver.quit();
	}

	@When("The user move to image and click on AddToCart and next click on checkout button")
	public void the_user_move_to_image_and_click_on_AddToCart_and_next_click_on_checkout_button()
			throws InterruptedException {
		InitialPage initial = new InitialPage(driver);

		initial.moveToImage();
		initial.clickOnAddToCart();
		initial.clickOnProceed();
	}

	@When("When The user click on proceed to checkout")
	public void when_The_user_click_on_proceed_to_checkout() {
		CheckOutPage checkout = new CheckOutPage(driver);
		checkout.checkoutPage();
		CheckOutPage2 checkout1 = new CheckOutPage2(driver);
		checkout1.clickadress();

	}

	@When("The user enter emailId {string} and Password {string} and  on click on SignIn")
	public void the_user_enter_emailId_and_Password_and_on_click_on_SignIn(String email, String Password) {
		signInDetailsPage signIn = new signInDetailsPage(driver);
		signIn.enterEmail(email);
		signIn.enterPassword(Password);
		signIn.clickSignIn();
	}

	@Then("The user should access  to next portal")
	public void the_user_should_access_to_next_portal() {
		driver.quit();
	}


@When("The user click on update and  click on save and proceed to checkout")
	public void the_user_click_on_update_and_click_on_save_and_proceed_to_checkout() {
		AddressPage adress = new AddressPage(driver);
		adress.deliveryUpdate();
		saveAddressPage save = new saveAddressPage(driver);
		save.saveDelivery();
	}

	@When("The user move to image and click on AddToCart1 and next click on checkout button")
	public void the_user_move_to_image_and_click_on_AddToCart1_and_next_click_on_checkout_button()
			throws InterruptedException {
		InitialPage initial = new InitialPage(driver);
		initial.moveToImage();
		initial.clickOnAddToCart();
		initial.clickOnProceed();
	}

	@When("When The user click on proceed to checkout1")
	public void when_The_user_click_on_proceed_to_checkout1() {
		CheckOutPage checkout = new CheckOutPage(driver);
		checkout.checkoutPage();
		CheckOutPage2 checkout1 = new CheckOutPage2(driver);
		checkout1.clickadress();
	}

	@When("The user click on  delivery update and  click on save and proceed to checkout")
	public void the_user_click_on_delivery_update_and_click_on_save_and_proceed_to_checkout() {
		AddressPage adress = new AddressPage(driver);
		adress.deliveryUpdate();
		saveAddressPage save = new saveAddressPage(driver);
		save.saveDelivery();
		adress.clickOnProceed();
		
	}

	@Then("The user should access to Address Portal")
	public void the_user_should_access_to_Address_Portal() {
		
		driver.quit();
	}

	@When("The user click on  billing update and  click on save and proceed to checkout")
	public void the_user_click_on_billing_update_and_click_on_save_and_proceed_to_checkout() {
		AddressPage billing = new AddressPage(driver);
		billing.billingUpdate();
		updatePage update = new updatePage(driver);
		update.billingSave();
		billing.clickOnProceed();

	}

	@Then("The user should access to Address Portal1")
	public void the_user_should_access_to_Address_Portal1() {
		driver.quit();
	}

	@When("click on delete icon")
	public void click_on_delete_icon() {
		deleteIconPage delete = new deleteIconPage(driver);
		delete.clickOnDelete();
	}

	@Then("item is deleted from the cart")
	public void item_is_deleted_from_the_cart() {
		driver.quit();
	}

	@When("the user click on proceed to checkout")
	public void the_user_click_on_proceed_to_checkout() {
		ShippingCheckoutPage checkout = new ShippingCheckoutPage(driver);
		checkout.clickOnproceed();
	}

	@Then("the application popsup error message.")
	public void the_application_popsup_error_message() {
		driver.quit();
	}

	@When("the user click on checkbox and proceed to checkout")
	public void the_user_click_on_checkbox_and_proceed_to_checkout() {
		ShippingCheckoutPage withcheckbox = new ShippingCheckoutPage(driver);
		withcheckbox.clickOncheckbox();
		withcheckbox.clickOnproceed();
	}

	@Then("the application naviagates to nextpage")
	public void the_application_naviagates_to_nextpage() {
		driver.quit();

	}

	@When("the user click on paybycheck and click confirm order")
	public void the_user_click_on_paybycheck_and_click_confirm_order() {
		PaymentPage check = new PaymentPage(driver);
		check.payByCheck();
		
	}

	@When("the user click on paybybankwire and click confirm order")
	public void the_user_click_on_paybybankwire_and_click_confirm_order() {
		PaymentPage bank = new PaymentPage(driver);
		bank.paybybankwire();
		
	}

	@Then("the order is confirmed")
	public void the_order_is_confirmed() {
		
		driver.quit();
	}
	
	@When("the user clicks on contactus")
	public void the_user_clicks_on_contactus() {
	    MainPage contact=new MainPage(driver);
	    contact.clickOnContactUs();
	}

	@When("the user choose heading")
	public void the_user_choose_heading() {
		ContactUspPage heading=new ContactUspPage(driver);
		heading.chooseHeading("Customer service");
	}

	@When("the user enters email address as {string} and orderReference as {string}")
	public void the_user_enters_email_address_as_and_orderReference_as(String email, String order) {
		ContactUspPage emaill=new ContactUspPage(driver);
		emaill.enterEmail(driver, email);
		emaill.enterOrder(driver, order);
	}

	@When("upload {string}")
	public void upload(String file) {
		
		ContactUspPage fi=new ContactUspPage(driver);
		fi.uploadFile(driver, file);
	}
	@When("send message as {string}")
	public void send_message_as(String message) {
		ContactUspPage msg=new ContactUspPage(driver);
		msg.enterMessage(driver, message);
	    
	}

	

	@When("click on send")
	public void click_on_send() {
		ContactUspPage send=new ContactUspPage(driver);
		send.clickOnSend(driver);
	}

	@Then("user will get meassage")
	public void user_will_get_meassage() {
	   driver.close();
	}

}