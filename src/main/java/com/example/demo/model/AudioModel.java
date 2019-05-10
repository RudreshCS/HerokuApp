
package com.example.demo.model;

import java.util.List;

public class AudioModel {

	private String title;
	private List<Audio> values = null;

	public AudioModel() {

	}

	public AudioModel(String title, List<Audio> values) {
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

	public List<Audio> getValues() {
		return values;
	}

	public void setValues(List<Audio> values) {
		this.values = values;
	}

}
