package proyectos.practica.web_notas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("homePage");
		return "dashboard/dashboard";
	}
	
	@GetMapping("/collections")
	public String collections(Model model) {
		model.addAttribute("collectionsPage");
		return "collections/collections";
	}
	
	@GetMapping("/favorites")
	public String favorites(Model model) {
		model.addAttribute("favoritesPage");
		return "favorites/favorites";
	}
	
	@GetMapping("/statistics")
	public String statistics(Model model) {
		model.addAttribute("statisticsPage");
		return "statistics/statistics";
	}


}
