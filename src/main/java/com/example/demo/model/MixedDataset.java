
package com.example.demo.model;

import java.util.List;

public class MixedDataset {

	private String type;
	private String label;
	private List<Integer> data = null;
	private String backgroundColor;

	public MixedDataset() {

	}

	public MixedDataset(String type, String label, List<Integer> data, String backgroundColor) {
		super();
		this.type = type;
		this.label = label;
		this.data = data;
		this.backgroundColor = backgroundColor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

}
