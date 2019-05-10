
package com.example.demo.model;

import java.util.List;

public class NormalDescModel {

	private String title;
	private List<Object> values = null;

	public NormalDescModel() {

	}

	public NormalDescModel(String title, List<Object> values) {
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

	public List<Object> getValues() {
		return values;
	}

	public void setValues(List<Object> list) {
		this.values = list;
	}

}
