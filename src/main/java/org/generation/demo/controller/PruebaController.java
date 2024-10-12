package org.generation.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Define la clase como un controller
@RequestMapping(path="/api/ch45/") //Define la ruta(path) http://localhost:8080/api/ch45/
public class PruebaController {
	
	@GetMapping //Define el metodo HTTP al que prueba() responde
	public String prueba() {
		return "<strong>Prueba de SpringBoot</strong>";
	}//prueba
	
	
}//class PruebaController
