import com.codeborne.selenide.Configuration;
import config.MyGridProvider;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pages.GoogleResultPage;
import pages.GoogleSearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

@RunWith(JUnit4.class)
public class Grid {

    @BeforeClass
    public static void setUp() {
        Configuration.browser = MyGridProvider.class.getName();
    }

    @Test
    public void googleSearchTest() {
        GoogleSearchPage searchPage = new GoogleSearchPage();
        GoogleResultPage resultPage = new GoogleResultPage();
        open(System.getProperty("base_url"));
        searchPage.search("adsterra");
        Assert.assertTrue(resultPage.results().get(0).text().contains("Adsterra"));
    }



    @AfterClass
    public static void tearDown() {
        closeWebDriver();
    }
}
