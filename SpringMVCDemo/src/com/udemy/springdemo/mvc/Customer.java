package com.udemy.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.udemy.springdemo.mvc.annotation.CourseCode;

public class Customer {

	private String firstName;
	
	// add validation rules
	@NotNull(message = "is required!")
	@Size(min = 1, message = "is required!")
	private String lastName;
	
	@NotNull(message = "is required!")
	@Min(value = 0, message = "minimum 0 passes")
	@Max(value = 10, message = "maximum 10 passes")
	private Integer freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value = "BAEBY", message="must start with BAEBY")
	private String courseCode;
	
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
}
