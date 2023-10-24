package login.dao;

import login.dto.Dto;
import login.entity.Entity;

import java.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements Dao {
	
    private final JdbcTemplate jdbcTemplate;
    
    @Autowired
    public DaoImpl(JdbcTemplate jdbcTemplate) {
    	this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Entity.User findUserByIdAndPw(Dto.LoginRequestDTO loginRequest) {
        String sql = "SELECT * FROM users WHERE id=? AND pw=?";
        try {
            Entity.User user = jdbcTemplate.queryForObject(sql, (rs, rowNum) ->
                    new Entity.User(rs.getString("id"), rs.getString("pw"), rs.getString("name")),
                    loginRequest.getId(), loginRequest.getPw());
            return user;
        } catch (EmptyResultDataAccessException e) {
            return null;  // 사용자가 존재하지 않음
        }
    }

    @Override
    public Entity.Manager findManagerByIdAndPw(Dto.LoginRequestDTO loginRequest) {
        String sql = "SELECT * FROM manager WHERE id=? AND pw=?";
        try {
            Entity.Manager manager = jdbcTemplate.queryForObject(sql, (rs, rowNum) ->
                    new Entity.Manager(rs.getString("id"), rs.getString("pw"), rs.getString("name")),
                    loginRequest.getId(), loginRequest.getPw());
            return manager;
        } catch (EmptyResultDataAccessException e) {
            return null;  // 일치하는 관리자가 없음
        }
    }
}
