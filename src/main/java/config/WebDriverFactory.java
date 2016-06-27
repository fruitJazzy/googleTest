package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Renat on 27.06.2016.
 */
public class WebDriverFactory {

    private static WebDriver webDriver = null;

    public static WebDriver getInstance(String url, String browser, String platform) {
        WebDriver webDriver = null;

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (browser.equals("chrome")) {
            capabilities = DesiredCapabilities.chrome();
        }
        if (browser.equals("firefox")) {
            capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
        }

        capabilities.setCapability("platform", platform);

        try {
            webDriver = new RemoteWebDriver(new URL(url), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return webDriver;
    }

    public static WebDriver createDriver() {
        return getInstance(
                System.getProperty("node_url"),
                System.getProperty("browser"),
                System.getProperty("platform")
        );
    }

}
