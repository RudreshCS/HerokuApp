
package com.example.demo.model;

import java.util.List;

public class MixedModel {

	private List<String> labels = null;
	private List<MixedDataset> datasets = null;

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<MixedDataset> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<MixedDataset> datasets) {
		this.datasets = datasets;
	}

}
