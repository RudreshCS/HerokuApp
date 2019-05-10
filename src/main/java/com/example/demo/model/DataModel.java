package com.example.demo.model;

import java.util.List;

import com.example.demo.service.MediaTypeData;

public class DataModel {

	public String title;
	public List<MediaTypeData> values;

	public List<MediaTypeData> getValues() {
		return values;
	}

	public void setValues(List<MediaTypeData> values) {
		this.values = values;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


}
