/**
 * 
 */
package com.raidentrance.data;

import java.util.ArrayList;
import java.util.List;

import com.raidentrance.model.Role;
import com.raidentrance.model.User;

/**
 * @author raidentrance
 *
 */
public class SourceHelper {
	public List<User> users = new ArrayList<>();

	public SourceHelper() {
		loadSampleData();
	}

	private void loadSampleData() {
		users.add(new User("raidentrance", "superSecret", new Role("ADMIN", "Administrator of the system")));
		users.add(new User("admin", "superSecret", new Role("USER", "Normal user in the system")));
	}

	public List<User> getUsers() {
		return users;
	}

}
