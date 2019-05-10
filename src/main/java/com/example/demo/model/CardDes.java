
package com.example.demo.model;

public class CardDes {

	private String descType;
	private String description;
	private String img;
	private String link;
	private String smallDesc;
	private String title;
	private String version;

	public CardDes() {

	}

	public CardDes(String descType, String description, String img, String link, String smallDesc, String title,
			String version) {
		super();
		this.descType = descType;
		this.description = description;
		this.img = img;
		this.link = link;
		this.smallDesc = smallDesc;
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getSmallDesc() {
		return smallDesc;
	}

	public void setSmallDesc(String smallDesc) {
		this.smallDesc = smallDesc;
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
