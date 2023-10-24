package userMenu.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import menu.dto.MenuDto;
import menu.service.MenuService;
import userMenu.service.UserMenuService;

@Controller
public class UserMenuController {
	private final UserMenuService userMenuService;

    public UserMenuController(UserMenuService userMenuService) {
        this.userMenuService = userMenuService;
    }
    
    @GetMapping("/userMenu")
    public String userMenu(Model model) {
    	model.addAttribute("menuForm",new MenuForm());
    	return "userMenu";
    }
    
    @PostMapping("/userMenuAction") // 사용자가 지정한 URL 패턴으로 변경해주세요.
    public String userMenuAction(@RequestParam String action, Model model) {
        if ("메뉴판 보기".equals(action)) {
        	List<MenuDto> menuDtos = userMenuService.processUserAction(action);
            model.addAttribute("menuDtos", menuDtos);
            return "menu";
        } else if ("장바구니 담기".equals(action)) {
            // 장바구니 담기에 대한 로직 처리
        } else if ("장바구니 보기".equals(action)) {
            // 장바구니 보기에 대한 로직 처리
        } else if ("취소".equals(action)) {
            // 취소에 대한 로직 처리
        } else if ("구매".equals(action)) {
            // 구매에 대한 로직 처리
        } else if ("종료".equals(action)) {
            // 종료에 대한 로직 처리
        }
        return "userMenu"; 
    }
}
