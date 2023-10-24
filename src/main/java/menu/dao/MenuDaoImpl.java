package menu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import menu.dto.MenuDto;

@Repository("MenuDao")
public class MenuDaoImpl implements MenuDao{
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MenuDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
    @Override
	public List<MenuDto> getMenuItems() {
    	 String sql = "SELECT product_name, quantity FROM menu";
         return jdbcTemplate.query(sql, (rs, rowNum) ->
                 new MenuDto(rs.getString("product_name"), rs.getInt("quantity")));
    }
}
