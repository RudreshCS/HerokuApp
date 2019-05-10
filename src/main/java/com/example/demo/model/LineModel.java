
package com.example.demo.model;

import java.util.List;

public class LineModel {

    private List<String> labels = null;
    private List<LineDataset> datasets = null;

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<LineDataset> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<LineDataset> datasets) {
        this.datasets = datasets;
    }

}
