package com.trainings.library.web.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class User {

	private String userName;
	private String password;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(userName, user.userName) &&
				Objects.equals(password, user.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName, password);
	}
}
