package com.react.pages;

import com.react.driver.DriverManager;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class HeaderPage extends DriverManager {

    @FindBy(how = How.CLASS_NAME, using = "new-todo")
    private WebElement searchTextBox;

    public void searchSomething() {
        PageFactory.initElements(driver, this);
        searchTextBox.sendKeys("london deals");
        searchTextBox.sendKeys(Keys.RETURN);
        applyImplicitWait();
    }

    public void runTest() {
        runOnChrome();
        navigateTo();
        applyImplicitWait();
        driver.findElement(By.className("new-todo")).sendKeys("london deals");
        applyImplicitWait();
        driver.findElement(By.className("new-todo")).sendKeys(Keys.RETURN);
    }

    public boolean searchItem() {
        String actual = "london deals";
        MatcherAssert.assertThat(actual, is(equalToIgnoringCase("London Deals")));
        return true;
    }
}
