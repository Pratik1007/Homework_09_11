package com.xcart.demostore.testsuite;


import com.xcart.demostore.loadproperty.LoadProperty;
import com.xcart.demostore.pages.HomePage;
import com.xcart.demostore.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ItemTest extends TestBase {

    @Test
            public void userShouldNavigateToLaceUpBootsPageSucessfully(){

        HomePage homePage = new HomePage();
        LoadProperty loadProperty = new LoadProperty();

        homePage.clickOnSigninLink();
        homePage.clickOnCreateNewAccountLink();
        homePage.enterEmailInEmailField(loadProperty.getProperty("email"));
        homePage.enterPasswordInPasswordField(loadProperty.getProperty("password"));
        homePage.enterPasswordInConfirmPasswordField(loadProperty.getProperty("password"));
        homePage.clickOnCreateAccontBtn();
        homePage.clickOnSaleLink();
        homePage.clickOnLaceUpBoots();

        Assert.assertEquals(homePage.verifyLaceUpBootsPageText(), "Lace-Up Boots in Light Brown");


    }





}
