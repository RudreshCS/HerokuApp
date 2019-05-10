
package com.example.demo.model;

import java.util.List;

public class BubbleModel {

	private List<BubbleDataset> datasets = null;

	public BubbleModel() {

	}

	public BubbleModel(List<BubbleDataset> datasets) {
		super();
		this.datasets = datasets;
	}

	public List<BubbleDataset> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<BubbleDataset> datasets) {
		this.datasets = datasets;
	}

}
