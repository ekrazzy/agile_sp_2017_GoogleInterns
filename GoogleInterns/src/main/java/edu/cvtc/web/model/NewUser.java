/**
 * 
 */
package edu.cvtc.web.model;

import java.io.Serializable;

/**
 * @author Jennifer Diederich
 *
 */
public class NewUser implements Serializable {

	private static final long serialVersionUID = -2220777883091033066L;
	
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String userName;
	private String password;
	
	public NewUser() {
		// No args constructor 
	}

	public NewUser(String firstName, String lastName, int age, String email, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.userName = userName;
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


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "NewUser [firstName + lastName + " is " + age + ". Email is " + email
				+ ", userName=" + userName + ", password=" + password + "]";
	}

}
