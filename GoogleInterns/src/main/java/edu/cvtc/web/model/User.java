/**
 * 
 */
package edu.cvtc.web.model;

import java.io.Serializable;

/**
 * @author Jennifer Diederich
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = -2220777883091033066L;
	
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String password;
	
	public User() {
		/* no-arg for JavaBean implementation */
	}

	public User(String firstName, String lastName, int age, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	
	public User(String password) {
		this.password = password;
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
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	@Override
	public String toString() {
		return firstName + " " + lastName + " is " + age + ". Email is " + email + ". Password is " + password;
	}

}
