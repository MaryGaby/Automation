package ar.com.informatorio.calidad.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyStoreHomePage extends BasePage{
	
	
	@FindBy(className = "login")
	private WebElement signInButton;

	
	
	public MyStoreHomePage(WebDriver driver) {
		super(driver);
	
	}


	public MyStoreMyAccount signIn() {
		this.signInButton.click();
		return new MyStoreMyAccount(driver);
	}

}
