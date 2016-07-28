package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

	@FindBy(id = "advs")
	private WebElement searchForm;

	@FindBy(id = "advs-keywords")
	private WebElement keywordsField;

	@FindBy(name = "submit")
	private WebElement searchButton;



	public SearchResultsPage() {
		PageFactory.initElements(driver, this);
		implicitWaitForElement(searchForm);
	}

	public void performSearch (String searchTerm) {
		keywordsField.sendKeys(searchTerm);
		searchButton.click();
	}



}
