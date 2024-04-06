package com.example.demo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Humano {
	@RequestMapping(" ")
	public String index(@RequestParam(value="name", required=false) String Name, @RequestParam(value="lastname", required=false) String Apellido) {
		if(Name!=null) {
			if(Apellido!=null) {
				return "Hola " + Name + " "+ Apellido + "!";
			}
			else{
				return "Hola " + Name + "!";
			}
		}
		else if(Apellido!=null) {
			return "Hola sr/sra " + Apellido + "!";
		}
		return "Hola Humano";
	}		
}
