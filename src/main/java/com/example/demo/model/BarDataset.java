
package com.example.demo.model;

import java.util.List;

public class BarDataset {

    private String label;
    private List<Integer> data = null;
    private List<String> backgroundColor = null;
    private List<String> borderColor = null;
    private Integer borderWidth;

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

    public List<String> getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(List<String> backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public List<String> getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(List<String> borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

}
