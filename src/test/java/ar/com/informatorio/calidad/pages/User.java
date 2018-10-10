package ar.com.informatorio.calidad.pages;

public class User {
	
	private int dni;
	private String title;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String dayBirth;
	private String monthBirth;
	private String yearBirth;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String movilPhone;
	private String aliasAddress;
	
	
	public User() {
		super();
	}

	
	//OJO!!! el constructor no debería llevar más de 5 parámetros	
	public User(String title, String firstName, String lastName, String password) {
		super();
		this.title= title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMovilPhone() {
		return movilPhone;
	}

	public void setMovilPhone(String movilPhone) {
		this.movilPhone = movilPhone;
	}

	public String getAliasAddress() {
		return aliasAddress;
	}

	public void setAliasAddress(String aliasAddress) {
		this.aliasAddress = aliasAddress;
	}



	public String getDayBirth() {
		return dayBirth;
	}



	public void setDayBirth(String dayBirth) {
		this.dayBirth = dayBirth;
	}


	public String getMonthBirth() {
		return monthBirth;
	}

	public void setMonthBirth(String monthBirth) {
		this.monthBirth = monthBirth;
	}


	public String getYearBirth() {
		return yearBirth;
	}
	
	public void setYearBirth(String yearBirth) {
		this.yearBirth = yearBirth;
	}


	
}

