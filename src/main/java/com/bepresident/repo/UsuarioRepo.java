package com.bepresident.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bepresident.model.UserEntity;

@Repository
public interface UsuarioRepo extends CrudRepository <UserEntity, Long>{

	public UserEntity findByUsername(String nom);
}
