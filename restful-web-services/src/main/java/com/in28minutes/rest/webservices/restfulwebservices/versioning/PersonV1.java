package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class PersonV1 {

	private String name;

	public PersonV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	public String toString() {
		return "PersonV1 [name=" + name + "]";
	}
	
	
	
}
