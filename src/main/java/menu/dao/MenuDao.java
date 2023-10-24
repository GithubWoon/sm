package menu.dao;

import java.util.List;

import menu.dto.MenuDto;

public interface MenuDao {
	List<MenuDto> getMenuItems();
}
