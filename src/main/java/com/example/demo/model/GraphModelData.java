
package com.example.demo.model;

import java.util.List;

public class GraphModelData {

	private List<Graphs> graphs = null;

	public GraphModelData() {

	}

	public GraphModelData(List<Graphs> graphs) {
		super();
		this.graphs = graphs;
	}

	public List<Graphs> getGraphs() {
		return graphs;
	}

	public void setGraphs(List<Graphs> graphs) {
		this.graphs = graphs;
	}

}
