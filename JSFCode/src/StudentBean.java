import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import java.util.*;

@ManagedBean(name="student")
public class StudentBean {
	
	private String firstName;
	private String lastName;
	private int age;
	private String country;
	
	private List<String> ageOptions;

	
	// create a no-arg constructor
	public StudentBean(){
		ageOptions = new ArrayList<>();
		
		ageOptions.add("19");
		ageOptions.add("20");
		ageOptions.add("21");
		ageOptions.add("22");
		ageOptions.add("23");
		ageOptions.add("24");
		
		
	}

	// get/set methods
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getAgeOptions() {
		return ageOptions;
	}

	public void setAgeOptions(List<String> ageOptions) {
		this.ageOptions = ageOptions;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
}