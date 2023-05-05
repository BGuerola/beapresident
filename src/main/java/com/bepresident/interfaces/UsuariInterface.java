package com.bepresident.interfaces;

import java.util.List;

import com.bepresident.model.UserEntity;

public interface UsuariInterface {

	public UserEntity getOne(String username);
	public void save(UserEntity usuari);
	public void update(UserEntity usuari, Long id);
	public void deleteOne(Long id);
	public List<UserEntity> getAllUsers();
		
}
