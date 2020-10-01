package mx.gob.queretaro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {


	@GetMapping
	public String printHello(ModelMap model) {
		//return "Bienvenido a Spring Boot 2";
		model.addAttribute("page", "home");
		model.addAttribute("message", "Bienvenido a Spring Boot 2");

		return "home";
	}
}
