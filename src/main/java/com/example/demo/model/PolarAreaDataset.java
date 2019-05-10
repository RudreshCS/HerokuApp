
package com.example.demo.model;

import java.util.List;

public class PolarAreaDataset {

	private List<Integer> data = null;
	private List<String> backgroundColor = null;
	private String label;

	PolarAreaDataset() {

	}

	public PolarAreaDataset(List<Integer> data, List<String> backgroundColor, String label) {
		super();
		this.data = data;
		this.backgroundColor = backgroundColor;
		this.label = label;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

	public List<String> getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(List<String> backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
