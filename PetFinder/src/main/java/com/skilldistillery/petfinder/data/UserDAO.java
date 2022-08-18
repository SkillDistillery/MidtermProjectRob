package com.skilldistillery.petfinder.data;

import com.skilldistillery.petfinder.entities.User;

public interface UserDAO {
	User findById(int userId);
}
