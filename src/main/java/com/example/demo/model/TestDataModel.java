
package com.example.demo.model;

import java.util.List;

public class TestDataModel {

	private String title;
	private List<Value> values = null;

	public TestDataModel() {

	}

	public TestDataModel(String title, List<Value> values) {
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

	public List<Value> getValues() {
		return values;
	}

	public void setValues(List<Value> values) {
		this.values = values;
	}

}
