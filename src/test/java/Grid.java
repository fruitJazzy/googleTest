import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pages.GoogleResultPage;
import pages.GoogleSearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

@RunWith(JUnit4.class)
public class Grid {

    @Test
    public void googleSearchTest() {
        GoogleSearchPage searchPage = new GoogleSearchPage();
        GoogleResultPage resultPage = new GoogleResultPage();
        open(System.getProperty("base_url"));
        searchPage.search("adsterra");
        Assert.assertEquals("Adsterra", resultPage.results().get(0).text().);
    }



    @AfterClass
    public static void tearDown() {
        closeWebDriver();
    }
}
