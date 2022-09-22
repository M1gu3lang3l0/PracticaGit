package co.com.google.translate.pages.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://www.wordreference.com/")

public class HomePage extends PageObject
{
    @FindBy(xpath= "//*[@id=\"si\"]")
    WebElement textBoxSourceLanguage;

    @FindBy(xpath = "//*[@id=\"text_form\"]/input[2]")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id=\"enes:7174\"]/td[3]")
    WebElement textResultLanguage;


    public void enterTheWordToTranslate(String englishWord){
        textBoxSourceLanguage.sendKeys(englishWord);
    }

    public void clickOnEnglishSourceButton()
    {
        btnSearch.click();
    }

    public String resultWordToTranslate()
    {
        return textResultLanguage.getText();
    }
}
