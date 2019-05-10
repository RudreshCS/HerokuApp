package com.example.demo.model;

import java.util.List;

public class GraphModel {

	private String title;
	private List<Graph> values = null;

	public GraphModel() {

	}

	public GraphModel(String title, List<Graph> values) {
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

	public List<Graph> getValues() {
		return values;
	}

	public void setValues(List<Graph> values) {
		this.values = values;
	}

}
