package com.app.combi19.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.app.combi19.dao.PersonaDao;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@Autowired
	private PersonaDao personaDao;
		
	@GetMapping("/")
	public String inicio(Model model) {
		var personas = personaDao.findAll();
		System.out.println(personas);
		model.addAttribute("personas", personas);
		return "index";
	}	
}
