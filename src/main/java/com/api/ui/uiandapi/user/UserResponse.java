package com.api.ui.uiandapi.user;

import java.util.List;

import com.api.ui.uiandapi.common.BaseResponse;

public class UserResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user;
	private List<User> users;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
