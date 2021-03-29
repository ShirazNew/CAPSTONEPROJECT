package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CapstoneObjects2;
import utilities.WebDriverUtility;

public class Capstone2StepD extends Base {
	
	CapstoneObjects2 obj3 = new CapstoneObjects2();

	@Given("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		obj3.clickOnMyAccount();
		Thread.sleep(3000);
		WebDriverUtility.screenShot();

	}

	@When("^User clicks on Login$")
	public void user_clicks_on_Login() throws Throwable {
		obj3.clickOnLogin();
		WebDriverUtility.screenShot();

	}

	@When("^User enter username ‘userName’ and password 'password’ And User click on Login button'$")
	public void user_enter_username_userName_and_password_password_And_User_click_on_Login_button(String Username,
			String password) throws Throwable {
		obj3.enterUnserName(Username);
		obj3.enterPassord(password);
		WebDriverUtility.screenShot();
	}

	@When("^User click on Login button'$")
	public void user_click_on_Login_button() throws Throwable {
		obj3.clickOnLoginBT();
		WebDriverUtility.screenShot();

	}

	@When("^User should be logged in to MyAccounts dashboard$")
	public void user_should_be_logged_in_to_MyAccounts_dashboard() throws Throwable {
		obj3.accountDashboard();
		Thread.sleep(3000);
		WebDriverUtility.screenShot();

	}

	@When("^User click on ‘Register for an Affiliate Account’ link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
		obj3.clickOnAffiAccount();
		WebDriverUtility.screenShot();

	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable affiliate) throws Throwable {
		List<Map<String, String>> affiliateIfno = affiliate.asMaps(String.class, String.class);
		obj3.enterCompany(affiliateIfno.get(0).get("company"));
		obj3.enterWebsite(affiliateIfno.get(0).get("website"));
		obj3.enterTaxId(affiliateIfno.get(0).get("taxID"));
		obj3.enterPaymentMethod(affiliateIfno.get(0).get("paymentMethod"));
		WebDriverUtility.screenShot();

		Thread.sleep(3000);

	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
		obj3.clickOnAboutUs();
		Thread.sleep(3000);
		WebDriverUtility.screenShot();

	}

	@When("^User click Continue button$")
	public void user_click_Continue_button() throws Throwable {
		obj3.clickOnContinueBTN();
		Thread.sleep(3000);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		obj3.successMessageDisply();
		WebDriverUtility.screenShot();
		Thread.sleep(3000);
	}

	@When("^User click on ‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
		obj3.clickOnEditAffInfo();
		WebDriverUtility.screenShot();
		Thread.sleep(2000);
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		obj3.clickOneBankTransfer();
		WebDriverUtility.screenShot();
		Thread.sleep(2000);
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable affEdit) throws Throwable {
		List<Map<String, String>> affiliateEdit = affEdit.asMaps(String.class, String.class);
		obj3.enterBankName(affiliateEdit.get(0).get("bankName"));
		obj3.enterABA(affiliateEdit.get(0).get("abaNumber"));
		obj3.enterSwiftCode(affiliateEdit.get(0).get("swiftCode"));

		obj3.accountName(affiliateEdit.get(0).get("accountName"));
		Thread.sleep(2000);
		obj3.enterAccountNumber(affiliateEdit.get(0).get("accountNumber"));
		WebDriverUtility.screenShot();

		Thread.sleep(2000);
	}

	@When("^User clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {
		obj3.clickAffContinue();
		WebDriverUtility.screenShot();
		Thread.sleep(2000);
	}

	@Then("^User should see a success's message$")
	public void user_should_see_a_success_s_message() throws Throwable {
		obj3.AffSuccerssMessage();
		WebDriverUtility.screenShot();
		Thread.sleep(2000);
	}

	@When("^User click on ‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		obj3.clickOnEditAccInfo();
		logger.info("User clicked on the 'edit your account information link'");
		WebDriverUtility.screenShot();

	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable AccInfo) throws Throwable {
		List<Map<String, String>> accEdit = AccInfo.asMaps(String.class, String.class);
		obj3.validateFname(accEdit.get(0).get("firstname"));
		obj3.validateLastName(accEdit.get(0).get("lastName"));
		obj3.validateEmail(accEdit.get(0).get("email"));
		obj3.validatePhonNo(accEdit.get(0).get("telephone"));
		Thread.sleep(2000);
		logger.info("user entered modified the information");
		WebDriverUtility.screenShot();
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		obj3.clickAccContinueBTN();
		Thread.sleep(2000);
		WebDriverUtility.screenShot();
		logger.info("User clicked on continue button");

	}

	@Then("^User should see a message ‘Success: 'Your account has been successfully updated'$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
		obj3.accSuccessMessageDisply();
		logger.info("User is able to see the message");
		WebDriverUtility.screenShot();
	}


}
