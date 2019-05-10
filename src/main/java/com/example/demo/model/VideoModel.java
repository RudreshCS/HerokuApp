
package com.example.demo.model;

import java.util.List;

public class VideoModel {

	private String title;
	private List<Video> values = null;

	public VideoModel() {

	}

	public VideoModel(String title, List<Video> values) {
		super();
		this.title = title;
		this.values = values;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Video> getValues() {
		return values;
	}

	public void setValues(List<Video> values) {
		this.values = values;
	}

}
