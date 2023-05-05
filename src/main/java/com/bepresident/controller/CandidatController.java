package com.bepresident.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bepresident.model.Candidat;
import com.bepresident.services.CandidatServices;

@Controller
public class CandidatController {
	
//@RequestMapping(value = "/")
//@CrossOrigin("*") Autowired

CandidatServices service;

//@GetMapping("/candidato/{id}")
//public Candidat getOne(@PathVariable (value="id")Integer id){
//	return service.getOne(id);
//}

@GetMapping("/")
public String root(Model model){
	return "index";
}

@GetMapping("/index")
public String Wel(Model model) {
	return "index";
}

//@GetMapping("/index")
//Object Wel() {
//	return "index";
//}

//@RequestMapping("/")
//public ModelAndView root() {
//	ModelAndView msv = new ModelAndView();
//	msv.setViewName("index.html");
//	return msv;
//}
//
//@RequestMapping("/index")
//public ModelAndView index() {
//	ModelAndView msv = new ModelAndView();
//	msv.setViewName("index.html");
//	return msv;
//}

@GetMapping("cv/{id}")
public String cv(Model modelo, @PathVariable int id) {
	modelo.addAttribute("cv", service.getOne(id));
	return "cv";
}

@GetMapping("landingCand/{id}")
public String dash(Model modelo, @PathVariable int id) {
	modelo.addAttribute("cv", service.getOne(id));
	return "landingCand";
}


}
