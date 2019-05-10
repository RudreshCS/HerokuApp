
package com.example.demo.model;

import java.util.List;

public class BarModel {

	private List<String> labels = null;
	private List<BarDataset> datasets = null;

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<BarDataset> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<BarDataset> datasets) {
		this.datasets = datasets;
	}

}
