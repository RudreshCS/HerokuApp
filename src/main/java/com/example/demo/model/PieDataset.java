
package com.example.demo.model;

import java.util.List;

public class PieDataset {

	private List<Integer> data = null;
	private List<String> backgroundColor = null;
	private List<String> hoverBackgroundColor = null;

	PieDataset() {

	}

	public PieDataset(List<Integer> data, List<String> backgroundColor, List<String> hoverBackgroundColor) {
		super();
		this.data = data;
		this.backgroundColor = backgroundColor;
		this.hoverBackgroundColor = hoverBackgroundColor;
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

	public List<String> getHoverBackgroundColor() {
		return hoverBackgroundColor;
	}

	public void setHoverBackgroundColor(List<String> hoverBackgroundColor) {
		this.hoverBackgroundColor = hoverBackgroundColor;
	}

}
