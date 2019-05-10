
package com.example.demo.model;

import java.util.List;

public class TestDataModelNormal {

	private String title;
	private List<ValueNormal> values = null;

	public TestDataModelNormal() {

	}

	public TestDataModelNormal(String title, List<ValueNormal> values) {
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

	public List<ValueNormal> getValues() {
		return values;
	}

	public void setValues(List<ValueNormal> values) {
		this.values = values;
	}

}
