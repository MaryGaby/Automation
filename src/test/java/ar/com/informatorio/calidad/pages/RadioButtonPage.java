package ar.com.informatorio.calidad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage{
	
	@FindBy (id= "id_gender1")
	private WebElement gender1;
	
	@FindBy (id = "id_gender2")
	private WebElement gender2;
		
	public RadioButtonPage(WebDriver driver) {
		super(driver);
	}	
	
	public void clickRadioButton1(){
		gender1.click();
	}
	
	public void clickRadioButton2(){
		gender2.click();
	}
	

}
