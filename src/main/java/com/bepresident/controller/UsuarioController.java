package com.bepresident.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bepresident.model.UserEntity;
import com.bepresident.services.UsuariService;

@Controller
public class UsuarioController {
	
	@Autowired
	UsuariService service;

	@GetMapping("/login")
	public String index(Model model) {
		return "login";
	}
	
	
	@GetMapping("/register")
	public String registrar(Model model){
		UserEntity usuari = new UserEntity();
		model.addAttribute("usuari", usuari);
		System.out.println("Estic en register");
		return "register";
	}
	
	
	@PostMapping ("/registrar")
	public String add(@ModelAttribute("usuari") UserEntity usuari, Model model) {
		model.addAttribute("usuari",usuari);
		if (service.getOne(usuari.getUsername())== null){
			service.save(usuari);
			System.out.println(usuari.getUsername());
			System.out.println(usuari.getContrasenya());
			System.out.println(usuari.getRolename());
			return "login"; 
		} else {
			model.addAttribute("logError", "logError");
			System.out.println("El usuari ja existeix");
			return "register";
		}
	}
	
    @GetMapping ("/lista")
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> list = service.getAllUsers();
 
        return new ResponseEntity<List<UserEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
	
		
}