package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.initialize;

public class homeGooglePage {
	@FindBy(name="q")
	private WebElement searchBox;
	
	public homeGooglePage() {
		PageFactory.initElements(initialize.getDriver(), this);
	}
	
	public void searchPhrase(String phrase) {
		searchBox.sendKeys(phrase);
		searchBox.submit();
	}

}
