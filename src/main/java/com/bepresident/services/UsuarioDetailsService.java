package com.bepresident.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bepresident.model.UserEntity;
import com.bepresident.repo.UsuarioRepo;

@Service
public class UsuarioDetailsService implements UserDetailsService{
	
	@Autowired
	UsuarioRepo usuarioRepo;

	@Override
	public UserDetails loadUserByUsername(String nom) throws UsernameNotFoundException {
		UserEntity usuari = usuarioRepo.findByUsername(nom);
		
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(usuari.getRolename()));
		return new User (nom, usuari.getContrasenya(),authorities);
		
//		return new User (nom, usuari.getContrasenya(),usuari.getRolename());
	}
	
}
