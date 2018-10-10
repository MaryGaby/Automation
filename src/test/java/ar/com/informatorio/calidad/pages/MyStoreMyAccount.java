package ar.com.informatorio.calidad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyStoreMyAccount extends BasePage{
	
	@FindBy(name = "email_create")
	private WebElement emailRegisterTextBox;
	
	@FindBy(name = "SubmitCreate")
	private WebElement createButton;
	
	@FindBy(name = "email")
	private WebElement emailTextBox;
	
	@FindBy(name = "passwd")
	private WebElement passwordTextBox;

	@FindBy(name = "SubmitLogin")
	private WebElement signInButton;

	
	public MyStoreMyAccount(WebDriver driver) {
		super(driver);
	}
	
	public MyStoreAccountCreation createAccount(String email){

    	this.emailRegisterTextBox.clear();
    	this.emailRegisterTextBox.sendKeys(email);
    	this.createButton.click();
		return new MyStoreAccountCreation(driver);
	}
	
		
	public MyStoreSession login(String email, String password){

		this.emailTextBox.clear();
		this.emailTextBox.sendKeys(email);
		this.passwordTextBox.clear();
		this.passwordTextBox.sendKeys(password);
		this.signInButton.click();
		return new MyStoreSession(driver);
	}
	
	public MyStoreSession login(User aUser){

		this.emailTextBox.clear();
		this.emailTextBox.sendKeys(aUser.getEmail());
		this.passwordTextBox.clear();
		this.passwordTextBox.sendKeys(aUser.getPassword());
		this.signInButton.click();
		return new MyStoreSession(driver);
	}
	
	
	

}
