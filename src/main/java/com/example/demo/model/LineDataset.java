
package com.example.demo.model;

import java.util.List;

public class LineDataset {

    private String label;
    private String fill;
    private Float lineTension;
    private String backgroundColor;
    private String borderColor;
    private String borderCapStyle;
    private List<Integer> borderDash = null;
    private Float borderDashOffset;
    private String borderJoinStyle;
    private String pointBorderColor;
    private String pointBackgroundColor;
    private Integer pointBorderWidth;
    private Integer pointHoverRadius;
    private String pointHoverBackgroundColor;
    private String pointHoverBorderColor;
    private Integer pointHoverBorderWidth;
    private Integer pointRadius;
    private Integer pointHitRadius;
    private List<Integer> data = null;
    private String spanGaps;
    
    public LineDataset() {
		// TODO Auto-generated constructor stub
	}
    
    

    public LineDataset(String label, String fill, Float lineTension, String backgroundColor, String borderColor,
			String borderCapStyle, List<Integer> borderDash, Float borderDashOffset, String borderJoinStyle,
			String pointBorderColor, String pointBackgroundColor, Integer pointBorderWidth, Integer pointHoverRadius,
			String pointHoverBackgroundColor, String pointHoverBorderColor, Integer pointHoverBorderWidth,
			Integer pointRadius, Integer pointHitRadius, List<Integer> data, String spanGaps) {
		super();
		this.label = label;
		this.fill = fill;
		this.lineTension = lineTension;
		this.backgroundColor = backgroundColor;
		this.borderColor = borderColor;
		this.borderCapStyle = borderCapStyle;
		this.borderDash = borderDash;
		this.borderDashOffset = borderDashOffset;
		this.borderJoinStyle = borderJoinStyle;
		this.pointBorderColor = pointBorderColor;
		this.pointBackgroundColor = pointBackgroundColor;
		this.pointBorderWidth = pointBorderWidth;
		this.pointHoverRadius = pointHoverRadius;
		this.pointHoverBackgroundColor = pointHoverBackgroundColor;
		this.pointHoverBorderColor = pointHoverBorderColor;
		this.pointHoverBorderWidth = pointHoverBorderWidth;
		this.pointRadius = pointRadius;
		this.pointHitRadius = pointHitRadius;
		this.data = data;
		this.spanGaps = spanGaps;
	}



	public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public Float getLineTension() {
        return lineTension;
    }

    public void setLineTension(Float lineTension) {
        this.lineTension = lineTension;
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

    public String getBorderCapStyle() {
        return borderCapStyle;
    }

    public void setBorderCapStyle(String borderCapStyle) {
        this.borderCapStyle = borderCapStyle;
    }

    public List<Integer> getBorderDash() {
        return borderDash;
    }

    public void setBorderDash(List<Integer> borderDash) {
        this.borderDash = borderDash;
    }

    public Float getBorderDashOffset() {
        return borderDashOffset;
    }

    public void setBorderDashOffset(Float borderDashOffset) {
        this.borderDashOffset = borderDashOffset;
    }

    public String getBorderJoinStyle() {
        return borderJoinStyle;
    }

    public void setBorderJoinStyle(String borderJoinStyle) {
        this.borderJoinStyle = borderJoinStyle;
    }

    public String getPointBorderColor() {
        return pointBorderColor;
    }

    public void setPointBorderColor(String pointBorderColor) {
        this.pointBorderColor = pointBorderColor;
    }

    public String getPointBackgroundColor() {
        return pointBackgroundColor;
    }

    public void setPointBackgroundColor(String pointBackgroundColor) {
        this.pointBackgroundColor = pointBackgroundColor;
    }

    public Integer getPointBorderWidth() {
        return pointBorderWidth;
    }

    public void setPointBorderWidth(Integer pointBorderWidth) {
        this.pointBorderWidth = pointBorderWidth;
    }

    public Integer getPointHoverRadius() {
        return pointHoverRadius;
    }

    public void setPointHoverRadius(Integer pointHoverRadius) {
        this.pointHoverRadius = pointHoverRadius;
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

    public Integer getPointHoverBorderWidth() {
        return pointHoverBorderWidth;
    }

    public void setPointHoverBorderWidth(Integer pointHoverBorderWidth) {
        this.pointHoverBorderWidth = pointHoverBorderWidth;
    }

    public Integer getPointRadius() {
        return pointRadius;
    }

    public void setPointRadius(Integer pointRadius) {
        this.pointRadius = pointRadius;
    }

    public Integer getPointHitRadius() {
        return pointHitRadius;
    }

    public void setPointHitRadius(Integer pointHitRadius) {
        this.pointHitRadius = pointHitRadius;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public String getSpanGaps() {
        return spanGaps;
    }

    public void setSpanGaps(String spanGaps) {
        this.spanGaps = spanGaps;
    }

}
