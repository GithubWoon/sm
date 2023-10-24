package menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import menu.dao.MenuDao;
import menu.dto.MenuDto;

@Service
public class MenuService {
	private final MenuDao dao;
	
	@Autowired
	public MenuService(MenuDao dao) {
		this.dao = dao;
	}
	public List<MenuDto> getMenuItems(){
		return dao.getMenuItems();
	}
}
