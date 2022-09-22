package co.com.google.translate.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import co.com.google.translate.pages.steps.GoogleHomePage;

public class GoogleTranslateStepDefinitions
{

    @Steps
    GoogleHomePage traductor;
    @Given("that Susan wants to translate a word")
    public void thatSusanWantsToTranslateAWord() {
        traductor.opensGoogleTranslatePage();
    }
    @When("she translates the word {string} from English to Spanish")
    public void sheTranslatesTheWordFromEnglishToSpanish(String word) {
        traductor.enterTheWordToTranslate(word);
    }
    @Then("she should see the word {string} in the screen")
    public void sheShouldSeeTheWordInTheScreen(String result) {

        traductor.validationTheWordToTranslate(result);
    }
}