
package com.example.demo.model;

import java.util.List;

public class RadarModel {

    private List<String> labels = null;
    private List<RadarDataset> datasets = null;

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<RadarDataset> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<RadarDataset> datasets) {
        this.datasets = datasets;
    }

}
