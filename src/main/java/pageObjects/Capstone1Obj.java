package pageObjects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	import core.Base;
	import utilities.WebDriverUtility;

	public class Capstone1Obj extends Base {
		
		public Capstone1Obj() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath ="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
		private WebElement DeskTop;
		
		
		@FindBy(xpath ="//a[contains(text(),'Show All Desktops')]")
		private WebElement showAllDesktope;
		
		@FindBy(xpath = "//div[@id='content']")
		private WebElement desktopItems;
		
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
		private WebElement AddTohpCart;
		
		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement slectQuantity;
		
		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement AddToCart;
		
		@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
		private WebElement addSuccessfullMessage;
		
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]")
		private WebElement addToCartCanon;
		
		
		@FindBy(css = "#input-option226")
		private WebElement selectColor;
		
		
		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement selectQuantityCanon;
		
		
		
		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement addToCartC;
		
		@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
		private WebElement CanonAddMessage;
		
		@FindBy(xpath= "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
		private WebElement CanonEOS;
		
		@FindBy(xpath= "//a[contains(text(),'Write a review')]")
		 private WebElement CanonReview;
		
		@FindBy(xpath ="//input[@id='input-name']")
		private WebElement name;
		
		@FindBy(xpath ="//textarea[@id='input-review']")
		private WebElement Review;
		
		@FindBy(xpath ="//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[5]")
		private WebElement rating;
		
		@FindBy(xpath ="//button[@id='button-review']")
		private WebElement Continue;
		
		@FindBy(xpath ="//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
		private WebElement Reviewmessage;
		
		
		
		
		
		@FindBy(xpath ="//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
		private WebElement LaptopAndNotebook;
		
		@FindBy(xpath ="//a[contains(text(),'Show All Laptops & Notebooks')]")
		private WebElement ShowAllLaptop;

		@FindBy(xpath ="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
		private WebElement macBookItem;
		
		@FindBy(xpath ="//button[@id='button-cart']")
		private WebElement addToCartBTN;
		
		@FindBy(xpath ="//body/div[@id='product-product']/div[1]")
		private WebElement sucessMessage ;
		

		
		@FindBy(xpath ="//input[@id='input-quantity']")
		private WebElement quantity;
		@FindBy(xpath ="//a[contains(text(),'Apple')]")
		private WebElement item;
		@FindBy(xpath ="//h2[contains(text(),'$602.00')]")
		private WebElement amount;
		
		

		@FindBy(xpath ="//span[@id='cart-total']")
		private WebElement cartOption;
		
		@FindBy(xpath ="//tbody/tr[1]/td[5]/button[1]/i[1]")
		private WebElement xButton;
		
		@FindBy(xpath ="//span[@id='cart-total']")
		private WebElement emptyCart;
		
		@FindBy(xpath= "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
		private WebElement comprisonMacBook;
		
		@FindBy(name="/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[3]")
		private WebElement MacAircomprison;
		
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[3]")
	private WebElement MBsuccessMessage;

		@FindBy(xpath = "//a[contains(text(),'product comparison')]")
		private WebElement productComparison;
		
		@FindBy(xpath= "//div[@id='content']")
		private WebElement comparisonChart;
		
		@FindBy(xpath= "//a[contains(text(),'MacBook Pro')]")
		private WebElement clickMacBookPro;
		
		@FindBy(xpath="//h2[contains(text(),'$2,000.00')] ")
		private WebElement MacBookProPrice;
		
		@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2] ")
		private WebElement HeartIcon;
		
		@FindBy(xpath=" //body/div[@id='product-category']/div[1]")
		private WebElement loginMessage;
		
		
		
		
		
		
		public void clickOnDeskTop() {
			WebDriverUtility.clickOnElement(DeskTop);
		}
		public void clickOneShowAllD() {
			WebDriverUtility.clickOnElement(showAllDesktope);
		}

		public void showAllDesktopItems() {
			WebDriverUtility.isElementDisplayed(showAllDesktope);
		}
	public void HpAddCartClick(String value) {
		WebDriverUtility.clickOnElement(AddTohpCart);
	}
	public void slectQuantity(String value) {
		WebDriverUtility.enterValue(slectQuantity, value);
		slectQuantity.clear();
		slectQuantity.sendKeys(value);
		
	}
	public void AddToCart() {
		WebDriverUtility.clickOnElement(AddToCart);
	}
	public boolean successfullyMessage(String value) {
		boolean successMessage = addSuccessfullMessage.isDisplayed();
		return successMessage;
	}
	public void addConnonToCart() {
		WebDriverUtility.clickOnElement(addToCartCanon);
	}
	public void selectColor() {
		Select avaialbeOptions = new Select(driver.findElement(By.id("input-option226")));
		avaialbeOptions.selectByIndex(1);
		
	}


	public void SeclectQuantity(String value) {
		WebDriverUtility.clickOnElement(selectQuantityCanon);
	}
	public void addToCartCanon() {
		WebDriverUtility.clickOnElement(addToCartC);
	}
	public boolean successfullyMessageCanon() {
		boolean CanonAddedMessage = CanonAddMessage.isDisplayed();
		return CanonAddedMessage;
	}
	public void clickOnCanonEOS() {
		WebDriverUtility.clickOnElement(CanonEOS);
	}
	public void clickOnCanonReview() {
		WebDriverUtility.clickOnElement(CanonReview);
	}
	public void name(String myName) {
		WebDriverUtility.enterValue(name, myName);
	}
	public void Reviewfield(String review) {
		WebDriverUtility.enterValue(Review, review);
	}
	public void rating() {
		WebDriverUtility.clickOnElement(rating);
		
	}
	public void Continue() {
		WebDriverUtility.clickOnElement(Continue);
	}
	public void Reviewmessage() {
		WebDriverUtility.isElementDisplayed(Reviewmessage);
		
		
		
		
	}
	public void clickOnLaptopAndNotebook() {
		WebDriverUtility.clickOnElement(LaptopAndNotebook);
	}
	public void clickOnShowLaptop() {
		WebDriverUtility.clickOnElement(ShowAllLaptop);
	}
	public void clickmacBookItem() {
		WebDriverUtility.clickOnElement(macBookItem);
	}
	public void ClickaddToCartBTN() {
		WebDriverUtility.clickOnElement(addToCartBTN);
	}

	public void showsucessMessage() {
		WebDriverUtility.isElementDisplayed(sucessMessage);
	}
	public void showCartAmountMessage(int quantity2, int intem, int amount2) {
		WebDriverUtility.isElementDisplayed(quantity);
		WebDriverUtility.isElementDisplayed(item);
		WebDriverUtility.isElementDisplayed(amount);
	}
	public void clickcartOption() {
		WebDriverUtility.clickOnElement(cartOption);
	}
	public void clickxButton() {
		WebDriverUtility.clickOnElement(xButton);
	}
	public void showemptyCart (int zero) {
		WebDriverUtility.clickOnElement(emptyCart);
	}
		

	public void clickOnComparisonMacBook() {
		WebDriverUtility.clickOnElement(comprisonMacBook);
	}
	/*public void macMassageDisplay() {
		WebDriverUtility.isElementDisplayed(MBsuccessMessage);
	}*/

	public void clickOnMacAirComprison() {
		WebDriverUtility.clickOnElement(MacAircomprison);
	}

	public void displayedMD() {
		WebDriverUtility.isElementDisplayed(MBsuccessMessage);
	}

	public void clickonProductComparison() {
		WebDriverUtility.clickOnElement(productComparison);
	}

	public void showProductChart() {
		WebDriverUtility.isElementDisplayed(comparisonChart);
	}

	public void clickonMackBookPro() {
		WebDriverUtility.clickOnElement(clickMacBookPro);
	}
	public void DisplayedPriceTag() {
	 WebDriverUtility.isElementDisplayed(MacBookProPrice);
		
		}
	public void clickOnHeartIcon() {
		WebDriverUtility.clickOnElement(HeartIcon);
	}
	public void DisplayedCreateAccount() {
		WebDriverUtility.isElementDisplayed(loginMessage);
	}


	}



	

