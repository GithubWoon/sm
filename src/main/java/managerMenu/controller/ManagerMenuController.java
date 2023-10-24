package managerMenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import managerMenu.service.ManagerMenuService;

@Controller
public class ManagerMenuController {
	private final ManagerMenuService managerMenuService;

    public ManagerMenuController(ManagerMenuService managerMenuService) {
        this.managerMenuService = managerMenuService;
    }
    @PostMapping("/managerMenu/ManagerMenuAction") // 사용자가 지정한 URL 패턴으로 변경해주세요.
    public ModelAndView managerMenuAction(@RequestParam String action) {
        managerMenuService.processManagerAction(action);
        // 처리 결과에 따른 ModelAndView 반환
        return new ModelAndView("managerMenu"); // 반환할 뷰 이름을 지정해주세요.
    }
}
