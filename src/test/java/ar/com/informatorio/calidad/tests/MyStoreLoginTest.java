package ar.com.informatorio.calidad.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import ar.com.informatorio.calidad.pages.MyStoreAccountCreation;
import ar.com.informatorio.calidad.pages.MyStoreHomePage;
import ar.com.informatorio.calidad.pages.MyStoreMyAccount;
import ar.com.informatorio.calidad.pages.MyStoreSession;
import ar.com.informatorio.calidad.pages.User;


public class MyStoreLoginTest extends BaseTest{
 
  
    
  @Test(enabled = false)
  public void testCreateAccount() {
	  
	  driver.get("http://automationpractice.com/index.php"); 
	  MyStoreHomePage inicioPage = new MyStoreHomePage(driver);
	  MyStoreMyAccount loginPage = inicioPage.signIn();
	  MyStoreAccountCreation myNewAccountPage=  loginPage.createAccount("unMailCualquiera@gmail.com");
	  System.out.println(myNewAccountPage.getFirstHeadingText());
	  assertEquals("CREATE AN ACCOUNT", myNewAccountPage.getFirstHeadingText());
  }
  
  @Test
  public void testCreateUserAccount() {
	  
	  driver.get("http://automationpractice.com/index.php"); 
	  MyStoreHomePage inicioPage = new MyStoreHomePage(driver);
	  MyStoreMyAccount loginPage = inicioPage.signIn();
	  MyStoreAccountCreation myNewAccountPage=  loginPage.createAccount("unMailCualquiera10@gmail.com");
	  User usuario = new User("Mrs.","Tutuca", "Laprovitta", "tuContraseñaEsInsegura");
	  usuario.setDayBirth("29");
	  usuario.setMonthBirth("September ");
	  usuario.setYearBirth("1979");
	  usuario.setAddress("1740 Waterford Landing");
	  usuario.setCity("Orange Park");
	  usuario.setState("Florida");
	  usuario.setPostalCode("32003");
	  //el ingreso del campo Country no es necesario por tomar el valor por defecto
	  usuario.setMovilPhone("+1 9042150980");
	  usuario.setAliasAddress("My Own Home");
	  MyStoreSession mySesionPage = myNewAccountPage.registerUser(usuario);
	  assertEquals("MY ACCOUNT", mySesionPage.getFirstHeadingText());
	
  }
  
  @Test(enabled = false)
  public void testLogin() {
	  
	  driver.get("http://automationpractice.com/index.php"); 
	  MyStoreHomePage inicioPage = new MyStoreHomePage(driver);
	  MyStoreMyAccount loginPage = inicioPage.signIn();
	  MyStoreSession mySesionPage=  loginPage.login("unMailCualquiera7@gmail.com","tuContraseñaEsInsegura");
	  System.out.println(mySesionPage.getFirstHeadingText());
	  assertEquals("MY ACCOUNT", mySesionPage.getFirstHeadingText());
  }
  
  @Test
  public void testLoginUser() {
	  
	  driver.get("http://automationpractice.com/index.php"); 
	  MyStoreHomePage inicioPage = new MyStoreHomePage(driver);
	  MyStoreMyAccount loginPage = inicioPage.signIn();
	  User usuario = new User();
	  usuario.setEmail("unMailCualquiera10@gmail.com");
	  usuario.setPassword("tuContraseñaEsInsegura");
	  MyStoreSession mySesionPage=  loginPage.login(usuario);
	  System.out.println(mySesionPage.getFirstHeadingText());
	  assertEquals("MY ACCOUNT", mySesionPage.getFirstHeadingText());
  }
  
}


