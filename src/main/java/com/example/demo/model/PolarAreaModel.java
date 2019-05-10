
package com.example.demo.model;

import java.util.List;

public class PolarAreaModel {

    private List<PolarAreaDataset> datasets = null;
    private List<String> labels = null;

    public List<PolarAreaDataset> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<PolarAreaDataset> datasets) {
        this.datasets = datasets;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

}
