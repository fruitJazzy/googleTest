package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by Renat on 23.06.2016.
 */
public class GoogleResultPage {

    private ElementsCollection results = $$("#ires .srg .g");

    public ElementsCollection results() {
        return results;
    }
}
