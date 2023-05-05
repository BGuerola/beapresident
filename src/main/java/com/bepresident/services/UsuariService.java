package com.bepresident.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bepresident.interfaces.UsuariInterface;
import com.bepresident.model.UserEntity;
import com.bepresident.repo.UsuarioRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuariService implements UsuariInterface{

	@Autowired
	UsuarioRepo repo;
	
	@Override
	public UserEntity getOne(String username) {
		return repo.findByUsername(username);
	}

	@Override
	public void save(UserEntity usuari) {
		repo.save(usuari);		
	}

	@Override
	public void update(UserEntity usuari, Long id) {
		repo.findById(id).ifPresent((x)->{
			repo.save(usuari);
		});			
	}
	@Override
	public void deleteOne(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<UserEntity> getAllUsers() {
		List<UserEntity> userList = (List<UserEntity>) repo.findAll();
		if (userList.size()>0) {
			return userList;
		} else {
//			UserEntity prova = new UserEntity();
//			prova.setUsername("Pepico");
//			prova.setContrasenya("1234");
//			prova.setRoleName("user");
			ArrayList<UserEntity>buit= new ArrayList<UserEntity>();
//			buit.add(prova);
		return buit;
		}
		
	}
		
}
