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

    @PostMapping("/managerMenu/ManagerMenuAction")
    public ModelAndView managerMenuAction(@RequestParam String action) {

        ModelAndView modelAndView = managerMenuService.processManagerAction(action);

        return modelAndView;
    }
}
