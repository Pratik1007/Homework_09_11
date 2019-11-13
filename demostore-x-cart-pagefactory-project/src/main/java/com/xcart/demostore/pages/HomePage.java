package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Crated By Pratik
 */
public class HomePage extends Util {

    @FindBy(xpath = "//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]")
    WebElement _signinLink;
    @FindBy(xpath = "//a[contains(@class,'popup-button default-popup-button create-account-link')]")
    WebElement _createNewAccountLink;
    @FindBy(id = "login")
    WebElement _emailField;
    @FindBy(id = "password")
    WebElement _passwordField;
    @FindBy(id = "password-conf")
    WebElement _confirmPasswordField;
    @FindBy(xpath = "//div[contains(@class,'button submit')]//button[contains(@class,'submit')]")
    WebElement _createBtn;
    @FindBy(xpath = "//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][contains(text(),'Hot deals')]")
    WebElement _hotDealLink;
    @FindBy(xpath = "//ul[@class='nav navbar-nav top-main-menu']//a[@href='sale-products/']")
    WebElement _saleLink;
    @FindBy(xpath = "//a[contains(text(),'Lace-Up Boots in Light Brown')]")
    WebElement _laceUpBoots;
    @FindBy(xpath = "//h1[@class='fn title']")
    WebElement _bootsPageVerificationText;

    public void clickOnSigninLink() {
        clickOnElement(_signinLink);
    }

    public void clickOnCreateNewAccountLink() {
        clickOnElement(_createNewAccountLink);
    }

    public void enterEmailInEmailField(String email) {
        sendTextToElement(_emailField, generateRandomNumber() + email);
    }

    public void enterPasswordInPasswordField(String password) {
        sendTextToElement(_passwordField, password);
    }

    public void enterPasswordInConfirmPasswordField(String password){
        sendTextToElement(_confirmPasswordField, password);
    }

    public void clickOnCreateAccontBtn() {
        clickOnElement(_createBtn);
    }

    public void clickOnSaleLink() {
        WebDriverWait wait = new WebDriverWait(driver, 20);

        Actions action = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(_hotDealLink));

        action.moveToElement(_hotDealLink).build().perform();
        clickOnElement(_saleLink);
    }

    public void clickOnLaceUpBoots(){
        clickOnElement(_laceUpBoots);
    }

    public String verifyLaceUpBootsPageText() {
        return getTextFromElement(_bootsPageVerificationText);
    }
}
