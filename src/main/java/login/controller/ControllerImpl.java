package login.controller;

import login.dto.Dto;
import login.entity.Entity;
import login.service.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class ControllerImpl {
    private final Service service;

    
    public ControllerImpl(Service service){
        this.service = service;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // "login.html" 템플릿을 반환
    }
    
    @PostMapping("/authenticate")
    public String handleLogin(Dto.LoginRequestDTO requestDTO, Model model) {
        Object result = service.authenticate(requestDTO);

        if (result instanceof Entity.User) {
            Entity.User user = (Entity.User) result;
            model.addAttribute("message", user.getName() + " 님 환영합니다! 사용자 메뉴로 안내합니다.");
            return "userMenu";
        } else if (result instanceof Entity.Manager) {
            Entity.Manager manager = (Entity.Manager) result;
            model.addAttribute("message", manager.getName() + " 님 어서오세요. 관리자 메뉴로 이동합니다.");
            return "managerMenu";
        } else {
            model.addAttribute("message", "로그인 실패: ID 혹은 비밀번호가 잘못되었습니다.");
            return "login";
        }

    }
}