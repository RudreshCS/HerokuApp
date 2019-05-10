
package com.example.demo.model;

import java.util.List;

public class BubbleDataset {

	private String label;
	private List<Datum> data = null;
	private String backgroundColor;
	private String hoverBackgroundColor;

	public BubbleDataset() {

	}

	public BubbleDataset(String label, List<Datum> data, String backgroundColor, String hoverBackgroundColor) {
		super();
		this.label = label;
		this.data = data;
		this.backgroundColor = backgroundColor;
		this.hoverBackgroundColor = hoverBackgroundColor;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Datum> getData() {
		return data;
	}

	public void setData(List<Datum> data) {
		this.data = data;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getHoverBackgroundColor() {
		return hoverBackgroundColor;
	}

	public void setHoverBackgroundColor(String hoverBackgroundColor) {
		this.hoverBackgroundColor = hoverBackgroundColor;
	}

}
