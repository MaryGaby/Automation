package ar.com.informatorio.calidad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyStoreSession extends BasePage{

	@FindBy(xpath = "(//*[@class='row']/descendant::h1)[1]")
		
	private WebElement firstHeading;

	public MyStoreSession(WebDriver driver) {
		super(driver);
	}

	public String getFirstHeadingText() {
		return firstHeading.getText();
	}
}
