package com.api.ui.uiandapi.user;

import java.util.List;

public interface UserService {

	User save(User user);

	void delete(User user);

	List<User> getAll();

	User findByEmail(String email);
}
