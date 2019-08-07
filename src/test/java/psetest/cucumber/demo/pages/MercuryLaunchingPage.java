package psetest.cucumber.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import psetest.cucumber.demo.page.base.BasePage;

public class MercuryLaunchingPage extends BasePage {

	public MercuryLaunchingPage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);

	}

	/**
	 * Method to launch the URL.
	 * 
	 * @param urlToNavigate is the url name
	 * @return MercuryLaunchingPage
	 */
	public MercuryLaunchingPage launchBrowserAndNavigateToMainMenuPage(final String urlToNavigate) {
		this.driver.get(urlToNavigate);
		return this;
	}

}
