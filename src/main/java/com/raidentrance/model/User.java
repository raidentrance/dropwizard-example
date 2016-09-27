/**
 * 
 */
package com.raidentrance.model;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * @author raidentrance
 *
 */
public class User {
	@JsonView(Views.Public.class)
	private String username;
	@JsonView(Views.Internal.class)
	private String password;
	@JsonView(Views.Public.class)
	private Role role;

	public User() {
	}

	public User(String username, String password, Role role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
