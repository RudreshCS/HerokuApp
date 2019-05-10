
package com.example.demo.model;

import java.util.List;

public class RadarDataset {

	private String label;
	private String backgroundColor;
	private String borderColor;
	private String pointBackgroundColor;
	private String pointBorderColor;
	private String pointHoverBackgroundColor;
	private String pointHoverBorderColor;
	private List<Integer> data = null;

	RadarDataset() {

	}

	public RadarDataset(String label, String backgroundColor, String borderColor, String pointBackgroundColor,
			String pointBorderColor, String pointHoverBackgroundColor, String pointHoverBorderColor,
			List<Integer> data) {
		super();
		this.label = label;
		this.backgroundColor = backgroundColor;
		this.borderColor = borderColor;
		this.pointBackgroundColor = pointBackgroundColor;
		this.pointBorderColor = pointBorderColor;
		this.pointHoverBackgroundColor = pointHoverBackgroundColor;
		this.pointHoverBorderColor = pointHoverBorderColor;
		this.data = data;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public String getPointBackgroundColor() {
		return pointBackgroundColor;
	}

	public void setPointBackgroundColor(String pointBackgroundColor) {
		this.pointBackgroundColor = pointBackgroundColor;
	}

	public String getPointBorderColor() {
		return pointBorderColor;
	}

	public void setPointBorderColor(String pointBorderColor) {
		this.pointBorderColor = pointBorderColor;
	}

	public String getPointHoverBackgroundColor() {
		return pointHoverBackgroundColor;
	}

	public void setPointHoverBackgroundColor(String pointHoverBackgroundColor) {
		this.pointHoverBackgroundColor = pointHoverBackgroundColor;
	}

	public String getPointHoverBorderColor() {
		return pointHoverBorderColor;
	}

	public void setPointHoverBorderColor(String pointHoverBorderColor) {
		this.pointHoverBorderColor = pointHoverBorderColor;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

}
