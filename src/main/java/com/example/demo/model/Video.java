
package com.example.demo.model;

public class Video {

	private String desc_type;
	private String img;
	private String smallDesc;
	private String title;
	private String url;
	private String version;

	public Video() {

	}

	public Video(String desc_type, String img, String smallDesc, String title, String url, String version) {
		super();
		this.desc_type = desc_type;
		this.img = img;
		this.smallDesc = smallDesc;
		this.title = title;
		this.url = url;
		this.version = version;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
