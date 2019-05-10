
package com.example.demo.model;

public class Card {

	private String desc_type;
	private String img;
	private String link;
	private String smallDesc;
	private String title;

	public Card() {

	}

	public Card(String desc_type, String img, String link, String smallDesc, String title) {
		super();
		this.desc_type = desc_type;
		this.img = img;
		this.link = link;
		this.smallDesc = smallDesc;
		this.title = title;
	}

	public String getDesc_type() {
		return desc_type;
	}

	public void setDesc_type(String desc_type) {
		this.desc_type = desc_type;
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

}
