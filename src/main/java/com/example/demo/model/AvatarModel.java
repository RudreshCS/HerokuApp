
package com.example.demo.model;

import java.util.List;

public class AvatarModel {

	private List<Avatar> avatar = null;

	public AvatarModel() {

	}

	public AvatarModel(List<Avatar> avatar) {
		super();
		this.avatar = avatar;
	}

	public List<Avatar> getAvatar() {
		return avatar;
	}

	public void setAvatar(List<Avatar> avatar) {
		this.avatar = avatar;
	}

}
