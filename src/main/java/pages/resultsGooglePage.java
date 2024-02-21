package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.initialize;

public class resultsGooglePage {
	
	@FindBy(xpath=".//h3[@class='LC20lb MBeuO DKV0Md']")
	private List<WebElement> results;
	
	public resultsGooglePage() {
		PageFactory.initElements(initialize.getDriver(), this);
	}
	
	public boolean endResult(String phrase) {
		boolean outcomes=true;
		for(WebElement element:results) {
			if(!element.getText().contains(phrase.toLowerCase())) {
				outcomes=false;
				break;
			}
		}	
	
		return outcomes;
	}


}
