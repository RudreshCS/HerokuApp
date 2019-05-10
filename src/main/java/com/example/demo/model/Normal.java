
package com.example.demo.model;

import java.util.List;

public class Normal {

	private String descType;
	private String description;
	private String downloads;
	private String img;
	private String message;
	private String name;
	private List<String> share;
	private String smallDesc;
	private String subject;
	private String title;
	private String version;

	public Normal() {

	}

	public Normal(String descType, String description, String downloads, String img, String message, String name,
			List<String> share, String smallDesc, String subject, String title, String version) {
		super();
		this.descType = descType;
		this.description = description;
		this.downloads = downloads;
		this.img = img;
		this.message = message;
		this.name = name;
		this.share = share;
		this.smallDesc = smallDesc;
		this.subject = subject;
		this.title = title;
		this.version = version;
	}

	public String getDescType() {
		return descType;
	}

	public void setDescType(String descType) {
		this.descType = descType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDownloads() {
		return downloads;
	}

	public void setDownloads(String downloads) {
		this.downloads = downloads;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getShare() {
		return share;
	}

	public void setShare(List<String> share) {
		this.share = share;
	}

	public String getSmallDesc() {
		return smallDesc;
	}

	public void setSmallDesc(String smallDesc) {
		this.smallDesc = smallDesc;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
