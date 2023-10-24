package login.controller;

import login.dto.Dto;
import org.springframework.ui.Model;

public interface Controller {
    String handleLogin(Dto.LoginRequestDTO requestDTO, Model model);
}
