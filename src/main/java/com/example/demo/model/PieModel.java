
package com.example.demo.model;

import java.util.List;

public class PieModel {

    private List<String> labels = null;
    private List<PieDataset> datasets = null;

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<PieDataset> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<PieDataset> datasets) {
        this.datasets = datasets;
    }

}
