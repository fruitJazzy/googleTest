import com.codeborne.selenide.WebDriverRunner;
import config.WebDriverFactory;
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
public class GoogleSearchTest {

    @BeforeClass
    public static void setUp() {
        WebDriverRunner.setWebDriver(WebDriverFactory.createDriver());
    }

    @Test
    public void googleSearchTest() {
        GoogleSearchPage searchPage = open("http://google.com", GoogleSearchPage.class);

        GoogleResultPage resultPage = searchPage.search("adsterra");
        Assert.assertTrue(resultPage.results().get(0).text().contains("Adsterra"));
    }



    @AfterClass
    public static void tearDown() {
        closeWebDriver();
    }
}
