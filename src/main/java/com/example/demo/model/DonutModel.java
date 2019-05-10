
package com.example.demo.model;

import java.util.List;

public class DonutModel {

	private List<String> labels = null;
	private List<DonutDataset> datasets = null;

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<DonutDataset> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<DonutDataset> datasets) {
		this.datasets = datasets;
	}

}
