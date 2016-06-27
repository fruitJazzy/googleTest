package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by Renat on 23.06.2016.
 */
public class GoogleSearchPage {

    private SelenideElement input = $("[name='q']");

    public GoogleResultPage search(String query) {
        input.val(query).pressEnter();
        return page(GoogleResultPage.class);
    }
}
