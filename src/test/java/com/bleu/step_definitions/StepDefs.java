package com.bleu.step_definitions;

import com.bleu.pages.LoginPage;
import com.bleu.utilities.ConfigurationReader;
import com.bleu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class StepDefs {

    @Given("user navigate to the logged page")
public void user_navigate_to_the_logged_page() {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
}
    @When("user submit username and password")
    public void user_submit_username_and_password() {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }
    @When("Enter the login button")
    public void enter_the_login_button() {

    }
    @Then("user should be login")
    public void user_should_be_login() {

    }
    @Given("the user clicks More tab on the top of the home page")
    public void the_user_clicks_more_tab_on_the_top_of_the_home_page() throws Throwable {
        WebElement more = Driver.get().findElement(By.xpath("//*[@id=\"feed-add-post-form-link-text\"]"));
        more.click();

    }
    @Given("the user select appreciation")
    public void the_user_select_appreciation() throws InterruptedException {
        Thread.sleep(3000);
        Driver.get().findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[2]/span[2]")).click();
        Thread.sleep(3000);

    }
    @Given("The user clicks Attachment icon")
    public void the_user_clicks_attachment_icon() throws InterruptedException {
        Thread.sleep(2000);

     WebElement attachment= Driver.get().findElement(By.xpath("//*[@id=\"bx-b-uploadfile-blogPostForm\"]"));
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(attachment).click().build().perform();

        }


    @Then("the user selects files or pictures from local discs")
    public void the_user_selects_files_or_pictures_from_local_discs() throws InterruptedException {
        Thread.sleep(4000);

     WebElement clickIcon =Driver.get().findElement(By.xpath("//*[@id=\"bx-b-uploadfile-blogPostForm\"]"));
        Thread.sleep(4000);
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(clickIcon).click().build().perform();


        WebElement upload= Driver.get().findElement(By.id("//*[@id=\"diskuf-selectdialog-niRJRlt\"]/div[2]/table/tbody/tr[1]/td[1]/div/input"));

        actions.moveToElement(clickIcon).sendKeys("\"C:\\Users\\DENOR24\\Desktop\\resim.jpg\"").build().perform();



    }
    @Given("click Quote icon to add command")
    public void click_quote_icon_to_add_command() throws InterruptedException {
        Thread.sleep(3000);
       WebElement quote=Driver.get().findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[3]/div[2]/span[4]/span/i"));
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(quote).click().build().perform();



    }
    @Then("the user copy or write the message")
    public void the_user_copy_or_write_the_message() throws InterruptedException {
        Thread.sleep(2000);
        WebElement quote1=Driver.get().findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[3]/div[2]/span[4]/span/i"));
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(quote1).sendKeys("En hakiki mursit ilimdir,fen.").build().perform();

    }
    @Given("the user clicks hashtag # icon to add mention")
    public void the_user_clicks_hashtag_icon_to_add_mention() throws InterruptedException {
        Thread.sleep(4000);
       WebElement hastag=Driver.get().findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[3]/div[2]/span[6]"));
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(hastag).click().build().perform();

    }
    @Then("user write mention")
    public void user_write_mention() throws InterruptedException {
        Thread.sleep(3000);


        WebElement hastag1=Driver.get().findElement(By.id("TAGS_blogPostForm67abSn"));
        hastag1.sendKeys("M.K.A.");



    }
    @Given("the user clicks icon to add link")
    public void the_user_clicks_icon_to_add_link() throws InterruptedException {
        Thread.sleep(3000);
        WebElement addbutton=Driver.get().findElement(By.xpath("//*[@id=\"bx-b-link-blogPostForm\"]/span"));
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(addbutton).click().build().perform();
    }
    @Then("the user copies the link to the text box in order to add")
    public void the_user_copies_the_link_to_the_text_box_in_order_to_add() throws InterruptedException {
        Thread.sleep(2000);
        WebElement linkIcon=Driver.get().findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[3]/div[2]/span[2]/span/i"));

        Actions actions = new Actions(Driver.get());
        actions.moveToElement(linkIcon).click().build().perform();
        Thread.sleep(2000);
    WebElement text=Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-text"));
        text.clear();
        Thread.sleep(2000);

        actions.moveToElement(text).sendKeys("translate").build().perform();

        Thread.sleep(2000);
WebElement linkText=Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-href"));
        linkText.clear();
        Thread.sleep(4000);

        actions.moveToElement(linkText).sendKeys("https://translate.google.no/?hl=tr&tab=rT").build().perform();


WebElement saveButton=Driver.get().findElement(By.xpath("//*[@id=\"undefined\"]"));

        actions.moveToElement(saveButton).click().build().perform();

    }

    @Then("click to send button")
    public void click_to_send_button() throws InterruptedException {
        Thread.sleep(2000);
       WebElement sendButton2=Driver.get().findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[3]/button[1]"));
   sendButton2.click();


    }
}
