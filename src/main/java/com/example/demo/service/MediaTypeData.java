/**
 * 
 */
package com.example.demo.service;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * @author csr1
 *
 */
public class MediaTypeData {

	public String desc_type;
	public File img;
	public String title;
	public String version;
	public String smallDesc;
	public String url;
	public String description;
	public List<URL> share;
	public String message;
	public String subject;
	public String name;
	public URL downloads;
	

	MediaTypeData() {

	}

	public MediaTypeData(String desc_type, File img, String title, String version, String smallDesc, String url) {
		super();
		this.desc_type = desc_type;
		this.img = img;
		this.title = title;
		this.version = version;
		this.smallDesc = smallDesc;
		this.url = url;
	}

	public MediaTypeData(String desc_type, File img, String title, String smallDesc, String version, String description,
			 List<URL> share, String message, String subject, String name, URL downloads) {
		super();
		this.desc_type = desc_type;
		this.img = img;
		this.title = title;
		this.version = version;
		this.smallDesc = smallDesc;
		this.url = url;
		this.description = description;
		this.share = share;
		this.message = message;
		this.subject = subject;
		this.name = name;
		this.downloads = downloads;
	}

	public String getDesc_type() {
		return desc_type;
	}

	public void setDesc_type(String desc_type) {
		this.desc_type = desc_type;
	}

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSmallDesc() {
		return smallDesc;
	}

	public void setSmallDesc(String smallDesc) {
		this.smallDesc = smallDesc;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<URL> getShare() {
		return share;
	}

	public void setShare(List<URL> share) {
		this.share = share;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URL getDownloads() {
		return downloads;
	}

	public void setDownloads(URL downloads) {
		this.downloads = downloads;
	}

}
