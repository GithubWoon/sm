package userMenu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import menu.service.MenuService;
import menu.dto.MenuDto;

@Service
public class UserMenuService {
	private final MenuService menuService;
	
	@Autowired
	public UserMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	
	public List<MenuDto> getMenuItems(){
		return menuService.getMenuItems();
	}
	public List<MenuDto> processUserAction(String action) {
        if ("메뉴판 보기".equals(action)) {
        	return getMenuItems();
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
        return  null;
    }
}
