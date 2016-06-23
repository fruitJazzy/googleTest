package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Renat on 23.06.2016.
 */
public class GoogleSearchPage {

    private SelenideElement input = $("[name='q']");

    public void search(String query) {
        input.val(query).pressEnter();
    }
}
