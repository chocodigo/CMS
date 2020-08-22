package com.cuvic.user;

/*
    회원관리 컨트롤러
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;      // 회원관리 서비스

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    // 회원관리 첫 페이지 리스트 출력
    @RequestMapping("/manage_user")
    public String ManageUser(Model model) throws Exception{
        List<UserVO> user_list = userService.getUserListService();      // user_list에 데이터베이스에서 회원목록 받아와 추가
        model.addAttribute("user_list",user_list);                  // manage_user.jsp에 user_list로 추가

        return "manage_user";
    }
}
