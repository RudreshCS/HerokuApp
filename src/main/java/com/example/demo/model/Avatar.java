
package com.example.demo.model;

public class Avatar {

	private String contact;
	private String designation;
	private String location;
	private String name;
	private String imgurl;

	public Avatar() {

	}

	public Avatar(String contact, String designation, String location, String name, String imgurl) {
		super();
		this.contact = contact;
		this.designation = designation;
		this.location = location;
		this.name = name;
		this.imgurl = imgurl;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

}
