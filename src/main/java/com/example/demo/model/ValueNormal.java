
package com.example.demo.model;

import java.util.List;

public class ValueNormal {

	private String descType;
	private String img;
	private String title;
	private String smallDesc;
	private String version;
	private String description;
	private List<String> share = null;
	private String message;
	private String subject;
	private String name;
	private String downloads;

	public ValueNormal() {

	}

	public ValueNormal(String descType, String img, String title, String smallDesc, String version, String description,
			List<String> share, String message, String subject, String name, String downloads) {
		super();
		this.descType = descType;
		this.img = img;
		this.title = title;
		this.smallDesc = smallDesc;
		this.version = version;
		this.description = description;
		this.share = share;
		this.message = message;
		this.subject = subject;
		this.name = name;
		this.downloads = downloads;
	}

	public String getDescType() {
		return descType;
	}

	public void setDescType(String descType) {
		this.descType = descType;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSmallDesc() {
		return smallDesc;
	}

	public void setSmallDesc(String smallDesc) {
		this.smallDesc = smallDesc;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getShare() {
		return share;
	}

	public void setShare(List<String> share) {
		this.share = share;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDownloads() {
		return downloads;
	}

	public void setDownloads(String downloads) {
		this.downloads = downloads;
	}

}
