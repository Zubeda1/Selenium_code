package pages;

import driver.DriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class HeaderPage extends DriverManager {
    /*pagefactory not working*/
    @FindBy(how = How.CLASS_NAME,using = "new-todo")
    private WebElement searchTextBox;

    public void searchSomething() {
        searchTextBox.sendKeys("london deals");
       searchTextBox.sendKeys(Keys.RETURN);
       applyimplicitwait();

    }

    @Test
    public void runTest(){
        runOnChrome();
        navigateTo();
        applyimplicitwait();
        driver.findElement(By.className("new-todo")).sendKeys("london deals");
        applyimplicitwait();
        driver.findElement(By.className("new-todo")).sendKeys(Keys.RETURN);
        //closeBrowser();

    }
  public boolean searchItem() {
       String actual = "london deals";
       Assert.assertThat(actual, is(equalToIgnoringCase("London Deals")));
       return true;
   }
}


