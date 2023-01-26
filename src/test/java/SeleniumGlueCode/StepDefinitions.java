package SeleniumGlueCode;

import POM.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class StepDefinitions {

    MainPage mainPage;

    public WebDriver driver;
    @Given("Estoy en el sitio https:\\/\\/ayuda.transbank.cl\\/")
    public void estoy_en_el_sitio_https_ayuda_transbank_cl() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\56936\\IdeaProjects\\Challenge_3_Test_Automation\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver =new ChromeDriver();

        mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.cargarSitio("https://ayuda.transbank.cl/");
        mainPage.maximizarBrowser();
    }

    @When("I access the news website")
    public void i_access_the_news_website() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("I search for a post using a existent title")
    public void i_search_for_a_post_using_a_existent_title() {
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }
    @Then("the news website must return the searched post in a results page")
    public void the_news_website_must_return_the_searched_post_in_a_results_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @When("I try to sign up or create a new account")
    public void i_try_to_sign_up_or_create_a_new_account() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("I try to register a account with a invalid email format")
    public void i_try_to_register_a_account_with_a_invalid_email_format() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("It returns a error message {string} on a visible place")
    public void it_returns_a_error_message_on_a_visible_place(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
