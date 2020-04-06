package com.da.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.da.capas.domain.Usuario;

@Controller
public class MainController {
	String user ="hola";
	String pass ="123456";
	
	
	@GetMapping("/login")
		public String enviarForm(Usuario usuario) {
			return "Login";
	}
	
	@PostMapping("/validacion")
		public String procesarForm(Usuario usuario) {
			if(usuario.getUser().equals(user) && usuario.getPassword().equals(pass)){
				return "MostrarMensajeV";
			}
		
			else {
				return "MostrarMensajeF";
			}
		
		}

}
