
package com.example.demo.model;

public class Graphs {

	private String title;
	private String type;
	private String url;

	public Graphs() {

	}

	public Graphs(String title, String type, String url) {
		super();
		this.title = title;
		this.type = type;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
