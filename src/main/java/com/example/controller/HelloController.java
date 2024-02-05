package com.example.controller;

import com.example.component.PizzaComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	PizzaComponent pizzaComponent;

	@GetMapping("/")
	public String index() {

		return "Greetings from Spring Boot!";
	}

	@GetMapping("/getPizza")
	public String getPizza() {
		return pizzaComponent.getPizza();
	}

}