package ar.com.informatorio.calidad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import ar.com.informatorio.calidad.pages.BasePage;

public class DropDownPage extends BasePage {
	
	@FindBy(id = "days")
	private WebElement day;
	
	@FindBy(id = "months")
	private WebElement month;
	
	@FindBy(id = "years")
	private WebElement year;
	
	@FindBy(id = "id_state")
	private WebElement state;
	
	
	public DropDownPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectDayByVisibleText(String option){
		Select daySelect = new Select(day);
		daySelect.selectByVisibleText(option);
	}

	public void selectDayByValue(String value){
		Select daySelect = new Select(day);
		daySelect.selectByValue(value);
	}
	
	public void selectMonthByVisibleText(String option){
		Select monthSelect = new Select(month);
		monthSelect.selectByVisibleText(option);
	}

	public void selectMonthByValue(String value){
		Select monthSelect = new Select(month);
		monthSelect.selectByValue(value);
	}
	
	public void selectYearByVisibleText(String option){
		Select yearSelect = new Select(year);
		yearSelect.selectByVisibleText(option);
	}

	public void selectYearByValue(String value){
		Select yearSelect = new Select(year);
		yearSelect.selectByValue(value);
	}
	
	public void selectStateByVisibleText(String option){
		Select stateSelect = new Select(state);
		stateSelect.selectByVisibleText(option);
	}

	public void selecStateByValue(String value){
		Select stateSelect = new Select(state);
		stateSelect.selectByValue(value);
	}
	
	
	
}