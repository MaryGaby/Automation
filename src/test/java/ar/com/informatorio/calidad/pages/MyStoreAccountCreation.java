package ar.com.informatorio.calidad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyStoreAccountCreation extends BasePage{
	
	@FindBy(xpath = "(//*[@class='row']/descendant::h1)[1]")
	private WebElement firstHeading;
	
	@FindBy(name = "id_gender")
	private WebElement gender;
	
	@FindBy(id = "customer_firstname")
	private WebElement customerFirstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement customerLastName;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement passwd;
	
		

	@FindBy(id = "firstname")
	private WebElement addressFirstname;
	
	@FindBy(id = "lastname")
	private WebElement addressLastname;
	
	@FindBy(id = "company")
	private WebElement company;
	
	@FindBy(id = "address1")
	private WebElement address1;
	
	@FindBy(id = "city")
	private WebElement city;
	
			
	@FindBy(id = "postcode")
	private WebElement postcode;
	
	@FindBy(id = "id_country")
	private WebElement id_country;
	
	@FindBy(id = "phone_mobile")
	private WebElement phone_mobile;
	
	
	@FindBy(id = "alias")
	private WebElement aliasAddress;
	

	@FindBy(id = "submitAccount")
	private WebElement registerButton;
	
	public MyStoreAccountCreation(WebDriver driver) {
			super(driver);
	}
	
	public String getFirstHeadingText() {
		return firstHeading.getText();
	}
	
	public MyStoreSession registerUser(User user){
		
		RadioButtonPage radioButton = new RadioButtonPage(driver);
		

		if ((user.getTitle()).equalsIgnoreCase("Mr.")) {
			radioButton.clickRadioButton1();		}	
		 else {
			 radioButton.clickRadioButton2();
		}	

    	this.customerFirstName.sendKeys(user.getFirstName());
    	this.customerLastName.sendKeys(user.getLastName());
    	this.passwd.sendKeys(user.getPassword());
    	
    	DropDownPage dropDownday = new DropDownPage(driver);
    	dropDownday.selectDayByValue(user.getDayBirth());
    	
    	DropDownPage dropDownMonth = new DropDownPage(driver);
    	dropDownMonth.selectMonthByVisibleText(user.getMonthBirth());
    	
    	DropDownPage dropDownYear= new DropDownPage(driver);
    	dropDownYear.selectYearByValue(user.getYearBirth());
    	
    	this.address1.sendKeys(user.getAddress());
    	this.city.sendKeys(user.getCity());
    	    	
    	DropDownPage dropDownState = new DropDownPage(driver);
    	dropDownState.selectStateByVisibleText(user.getState());
    	
    	
    	this.postcode.sendKeys(user.getPostalCode());
    	this.phone_mobile.sendKeys(user.getMovilPhone());
    	this.aliasAddress.clear();
    	this.aliasAddress.sendKeys(user.getAliasAddress());
    	this.registerButton.click();
		return new MyStoreSession(driver);
	}
	
}

	


