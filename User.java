
public class User 
{
	private String number;
	private String name;
	private String surname;
	private String yearOfBirth;
	
	public User()
	{
		this.number="";
		this.name="";
		this.surname="";
		this.yearOfBirth="";
	}
	
	public User(String number,String name, String surname, String yearOfBirth)
	{
		this.number=number;
		this.name=name;
		this.surname=surname;
		this.yearOfBirth=yearOfBirth;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
}