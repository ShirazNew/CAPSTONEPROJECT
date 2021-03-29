package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class CapstoneObjects2 extends Base {
	
	public CapstoneObjects2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;

	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	private WebElement login;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;

	@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	private WebElement loginBTN;
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement loginDashboard;

	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement regAffAccounLink;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxID;
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement paymentMethod;
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement aboutUs;
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement continueBTN;
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessagein;

	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffilInfo;

	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]/label[1]/input[1]")
	private WebElement bankTransfBTN;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNumber;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumber;

	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement ContinueAffilBTN;

	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement editAffilMessage;

	// a[contains(text(),'Edit your account information')]
	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editAccountInfo;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement accFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement accLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement accEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement accTelephoneNo;
	@FindBy(xpath = "//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement accContinueBT;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]")
	private WebElement accMessageSuccess;

	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}

	public void clickOnLogin() {
		WebDriverUtility.clickOnElement(login);
	}

	public void enterUnserName(String username) {
		WebDriverUtility.enterValue(email, username);
	}

	public void enterPassord(String pas) {
		WebDriverUtility.enterValue(password, pas);
	}

	public void clickOnLoginBT() {
		WebDriverUtility.clickOnElement(loginBTN);
	}

	public void accountDashboard() {
		WebDriverUtility.isElementDisplayed(loginDashboard);
	}

	public void clickOnAffiAccount() {
		WebDriverUtility.clickOnElement(regAffAccounLink);
	}

	public void enterCompany(String compaany) {
		WebDriverUtility.enterValue(company, compaany);
	}

	public void enterWebsite(String websit) {
		WebDriverUtility.enterValue(website, websit);
	}

	public void enterTaxId(String taxid) {
		WebDriverUtility.enterValue(taxID, taxid);
	}

	public void enterPaymentMethod(String name) {
		WebDriverUtility.enterValue(paymentMethod, name);
	}

	public void clickOnAboutUs() {
		WebDriverUtility.clickOnElement(aboutUs);
	}

	public void clickOnContinueBTN() {
		WebDriverUtility.clickOnElement(continueBTN);
	}

	public void successMessageDisply() {
		WebDriverUtility.isElementDisplayed(successMessagein);
	}

	public void clickOnEditAffInfo() {
		WebDriverUtility.clickOnElement(editAffilInfo);
	}

	public void clickOneBankTransfer() {
		WebDriverUtility.clickOnElement(bankTransfBTN);
	}

	public void enterBankName(String Bname) {
		WebDriverUtility.enterValue(bankName, Bname);
	}

	public void enterABA(String aba) {
		WebDriverUtility.enterValue(abaNumber, aba);
	}

	public void enterSwiftCode(String swift) {
		WebDriverUtility.enterValue(swiftCode, swift);
	}

	public void accountName(String accName) {
		WebDriverUtility.enterValue(accountName, accName);
	}

	public void enterAccountNumber(String accNum) {
		WebDriverUtility.enterValue(accountNumber, accNum);
	}

	public void clickAffContinue() {
		WebDriverUtility.clickOnElement(ContinueAffilBTN);
	}

	public void AffSuccerssMessage() {
		WebDriverUtility.isElementDisplayed(editAffilMessage);
	}

	public void clickOnEditAccInfo() {
		WebDriverUtility.clickOnElement(editAccountInfo);
	}

	public void validateFname(String string) {
		WebDriverUtility.isElementDisplayed(accFirstName);
	}

	public void validateLastName(String lastname) {
		WebDriverUtility.isElementDisplayed(accLastName);
	}

	public void validateEmail(String email) {
		WebDriverUtility.isElementDisplayed(accEmail);
	}

	public void validatePhonNo(String email) {
		WebDriverUtility.isElementDisplayed(accTelephoneNo);
	}

	public void clickAccContinueBTN() {
		WebDriverUtility.isElementDisplayed(accContinueBT);
	}

	public void accSuccessMessageDisply() {
		WebDriverUtility.isElementDisplayed(accMessageSuccess);
		

		
	}

}
