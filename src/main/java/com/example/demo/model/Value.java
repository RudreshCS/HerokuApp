
package com.example.demo.model;

public class Value {

	private String descType;
	private String img;
	private String title;
	private String version;
	private String smallDesc;
	private String url;

	public Value() {

	}

	public Value(String descType, String img, String title, String version, String smallDesc, String url) {

		this.descType = descType;
		this.img = img;
		this.title = title;
		this.version = version;
		this.smallDesc = smallDesc;
		this.url = url;

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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSmallDesc() {
		return smallDesc;
	}

	public void setSmallDesc(String smallDesc) {
		this.smallDesc = smallDesc;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
