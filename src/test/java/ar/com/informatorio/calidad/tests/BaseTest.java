package ar.com.informatorio.calidad.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class BaseTest {
	  protected WebDriver driver; 
	  
	  @BeforeMethod  
	  public void abrirNavegador() {
			ChromeDriverManager.getInstance().setup();
			driver = new ChromeDriver();
			
	  }
	  
	  @AfterMethod
	    public void cerrarNavegador() {
		  if(null != driver){
	      		driver.quit();
	      	}
	  }

}
