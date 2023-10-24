package managerMenu.service;

import org.springframework.stereotype.Service;

@Service
public class ManagerMenuService {

    public void processManagerAction(String action) {
        if ("메뉴판 보기".equals(action)) {
            // 메뉴판 보기에 대한 로직 처리
        } else if ("재고수량 추가".equals(action)) {
            modelAndView.setViewName("test");
            // 재고수량 추가에 대한 로직 처리
        } else if ("구매내역 보기".equals(action)) {
            // 구매내역 보기에 대한 로직 처리
        } else if ("관리자 추가".equals(action)) {
            // 관리자 추가에 대한 로직 처리
        } else if ("종료".equals(action)) {
            // 종료에 대한 로직 처리
        }
    }
}