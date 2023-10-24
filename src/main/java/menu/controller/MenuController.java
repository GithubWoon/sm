package menu.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import menu.service.MenuService;
import menu.dto.MenuDto;

@Controller
public class MenuController {
	private final MenuService service;
	
	public MenuController(MenuService service) {
		this.service = service;
	}
	
	@GetMapping("/menu")
	protected String doGet(Model model) {
		List<MenuDto> menuDtos = service.getMenuItems();
		model.addAttribute("menuDtos", menuDtos);
		return "menu";
	}
}
