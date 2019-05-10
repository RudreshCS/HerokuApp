
package com.example.demo.model;

import java.util.List;

public class Graph {

	private String descType;
	private String description;
	private List<GraphValue> graphs = null;
	private String img;

	private String smallDesc;
	private String title;
	private String version;

	public Graph() {

	}

	public Graph(String descType, String description, List<GraphValue> graphs, String img, String smallDesc,
			String title, String version) {
		super();
		this.descType = descType;
		this.img = img;
		this.title = title;
		this.smallDesc = smallDesc;
		this.version = version;
		this.description = description;
		this.graphs = graphs;
	}

	public String getDescType() {
		return descType;
	}

	public void setDescType(String descType) {
		this.descType = descType;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSmallDesc() {
		return smallDesc;
	}

	public void setSmallDesc(String smallDesc) {
		this.smallDesc = smallDesc;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<GraphValue> getGraphs() {
		return graphs;
	}

	public void setGraphs(List<GraphValue> graphs) {
		this.graphs = graphs;
	}

}
