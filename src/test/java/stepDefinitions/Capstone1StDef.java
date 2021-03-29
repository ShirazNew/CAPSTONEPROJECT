package stepDefinitions;


	import java.util.List;
	import java.util.Map;

	import core.Base;
	import cucumber.api.DataTable;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
import pageObjects.Capstone1Obj;
	import utilities.WebDriverUtility;

	public class Capstone1StDef extends Base {

		Capstone1Obj obj1 = new Capstone1Obj();
		

		@When("^User click on the desktop$")
		public void user_click_on_the_desktop() throws Throwable {
			obj1.clickOnDeskTop();
			logger.info("user clicked on the desktop");
			WebDriverUtility.screenShot();

		}

		@When("^User click on all desktop$")
		public void user_click_on_all_desktop() throws Throwable {
			obj1.clickOneShowAllD();
			logger.info("user clicked on show all desktop");
			WebDriverUtility.screenShot();

		}

		@Then("^User should all items are present in Desktop page$")
		public void user_should_all_items_are_present_in_Desktop_page() throws Throwable {
			obj1.showAllDesktopItems();
			logger.info("user is able to see all items on the desktop");
			WebDriverUtility.screenShot();
		}

		@When("^User click on Desktops tab$")
		public void user_click_on_Desktops_tab() throws Throwable {
			obj1.clickOnDeskTop();
			logger.info("user clicked on desktop tab");
			WebDriverUtility.screenShot();
		}

		@When("^User click on Show all desktops$")
		public void user_click_on_Show_all_desktops() throws Throwable {
			obj1.clickOneShowAllD();
			logger.info("User clicked on the show all desktop");
			WebDriverUtility.screenShot();

		}

		@When("^User click ADD TO CART option on ‘HP LP(\\d+)’ item$")
		public void user_click_ADD_TO_CART_option_on_HP_LP_item(String value) throws Throwable {
			obj1.HpAddCartClick(value);
			logger.info("user added HP to the cart");
			WebDriverUtility.screenShot();

		}

		@When("^User select quantity '(\\d+)'$")
		public void user_select_quantity(String value) throws Throwable {
			obj1.slectQuantity(value);
			logger.info("user selected the quantity");
			WebDriverUtility.screenShot();
		}

		@When("^User click add to Cart button$")
		public void user_click_add_to_Cart_button() throws Throwable {
			obj1.AddToCart();
			logger.info("user clicked on the add to cart button");
			WebDriverUtility.screenShot();

		}

		@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
		public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(String value)
				throws Throwable {
			obj1.successfullyMessage(value);
			logger.info("user was able to see a message Successfully added");
			WebDriverUtility.screenShot();

		}

		@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
		public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg) throws Throwable {
			obj1.addConnonToCart();
			logger.info("Canon has been added");
			WebDriverUtility.screenShot();

		}

		@When("^User select color from dropdown ‘Red’$")

		public void user_select_color_from_dropdown_Red() throws Throwable {
			obj1.selectColor();
			logger.info("color was selected");
			WebDriverUtility.screenShot();

		}

		@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
		public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(String value)
				throws Throwable {
			obj1.successfullyMessageCanon();
			logger.info("Success message is seen");
			WebDriverUtility.screenShot();

		}

		@When("^User click on Canon EOS (\\d+)D item$")
		public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
			obj1.clickOnCanonEOS();
			logger.info("user click one  Canon EO");
			WebDriverUtility.screenShot();
			Thread.sleep(400);
		}

		@When("^User click on write a review link$")
		public void user_click_on_write_a_review_link() throws Throwable {
			obj1.clickOnCanonReview();
			logger.info("user click one  Canon EO review");
			WebDriverUtility.screenShot();

		}

		@When("^user fill the review information with below information$")
		public void user_fill_the_review_information_with_below_information(DataTable reviewInfo) throws Throwable {
			List<Map<String, String>> ReviewInfor = reviewInfo.asMaps(String.class, String.class);
			obj1.name(ReviewInfor.get(0).get("yourname"));
			logger.info("User put the name");
			WebDriverUtility.screenShot();
			obj1.Reviewfield(ReviewInfor.get(0).get("YourReview"));
			logger.info("User wrote a review");
			WebDriverUtility.screenShot();
			obj1.rating();
			logger.info("user selected the rating range");
			WebDriverUtility.screenShot();
		}

		@When("^User click on Continue Button$")
		public void user_click_on_Continue_Button() throws Throwable {
			obj1.Continue();
			logger.info("user clicked on continue button");
			WebDriverUtility.screenShot();

		}

		@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval'”$")
		public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()
				throws Throwable {
			obj1.Reviewmessage();
			logger.info("user is able to see a messge ");
			
		}
		
		
		
		
		
		
		@When("^User click on Laptop &NoteBook tab$")
		public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
			obj1.clickOnLaptopAndNotebook();
			Thread.sleep(2000);
		   
		}

		@When("^User click on Show all Laptop &NoteBook option$")
		public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
			obj1.clickOnShowLaptop();
			Thread.sleep(2000);
		}

		@When("^User click on MacBook item$")
		public void user_click_on_MacBook_item() throws Throwable {
			obj1.clickmacBookItem();
			Thread.sleep(2000);
		}

		@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
		public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
			obj1.showsucessMessage();
			Thread.sleep(2000);
		}
		

		@Then("^User should see ‘(\\d+) item\\(s\\)-(\\d+)\\.(\\d+)’ showed to the cart$")
		public void user_should_see_item_s_showed_to_the_cart(int quantity, int intem, int amount) throws Throwable {
			obj1.showCartAmountMessage(quantity, intem, amount);
			Thread.sleep(2000);
		   
		}

		@Then("^User click on cart option$")
		public void user_click_on_cart_option() throws Throwable {
			obj1.clickcartOption();
			Thread.sleep(2000);
		}

		@Then("^user click on red X button to remove the item from cart$")
		public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
			obj1.clickxButton();
			Thread.sleep(2000);
		}

		@Then("^item should be removed and cart should show ‘(\\d+) item\\(s\\)’$")
		public void item_should_be_removed_and_cart_should_show_item_s(int arg1) throws Throwable {
			obj1.showemptyCart(arg1);
			Thread.sleep(2000);
		   
		}
		
		
		
		
		
		@Given("^User click on product comparison icon on ‘MacBook’$")
		public void user_click_on_product_comparison_icon_on_MacBook() throws Throwable {
			obj1.clickOnComparisonMacBook();
			Thread.sleep(2000);
			
		}
		

		/*@Given("^User click on product comparison icon on ‘MacBook Air$")
		public void user_click_on_product_comparison_icon_on_MacBook_Air()  {
		obj1.clickOnMacAirComprison();
			
		}
		@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
		public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws Throwable {
		  obj1.displayedMD();
		  Thread.sleep(2000);
		}*/

		@Then("^User click on Product comparison link$")
		public void user_click_on_Product_comparison_link() throws Throwable {
			obj1.clickonProductComparison();
			Thread.sleep(2000);
		  
		}

		@Then("^User should see Product Comparison Chart$")
		public void user_should_see_Product_Comparison_Chart() throws Throwable {
			obj1.showProductChart();
			Thread.sleep(2000);
		   
		}
		
		@When("^User click on ‘MacBook Pro’ item$")
		public void user_click_on_MacBook_Pro_item() throws Throwable {
		    obj1.clickonMackBookPro();
		    logger.info("user clicked on MacBookPro");
		    WebDriverUtility.screenShot();
		}

		@Then("^User should see  ‘\\$(\\d+),(\\d+)\\.(\\d+)’ price tag is present on UI$")
		public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2, int arg3) throws Throwable {
		   obj1.DisplayedPriceTag();
		   logger.info("user saw the price tag");
		    WebDriverUtility.screenShot();
		}
		
		
		
		@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
		public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws Throwable {
		    obj1.clickOnHeartIcon();
		    logger.info("user clicked on Sony VaIO laptop");
		  WebDriverUtility.screenShot();
		}

		@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
		public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list() throws Throwable {
		    obj1.DisplayedCreateAccount();
		    logger.info("user saw the message to login or create an account");
		    WebDriverUtility.screenShot();
		}
		





	}



