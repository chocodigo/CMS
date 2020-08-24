package com.cuvic.user;

/*
    회원관리 컨트롤러
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UserController {

    private final UserService userService;      // 회원관리 서비스

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    // 회원관리 첫 페이지 리스트 출력
    @RequestMapping("/manage_user")
    public String ManageUser(Model model) throws Exception{
        List<UserVO> user_list = userService.getUserListService("","","","");      // user_list에 데이터베이스에서 회원목록 받아와 추가
        List<UserStatVO> user_stat_list = userService.getUserStatListService();     //user_stat_list에 데이터베이스에서 회원상태목록 받아와 추가
        List<Integer> user_flag_list = userService.getUserFlagListService();    // user_flag_list에 데이터베이스에서 회원기수목록 받와 추가

        model.addAttribute("user_list",user_list);                  // manage_user.jsp에 user_list로 추가
        model.addAttribute("user_stat_list",user_stat_list);        // manage_user.jsp에 user_stat_list로 추가
        model.addAttribute("user_flag_list",user_flag_list);        // manage_user.jsp에 user_flag_list로 추가

        return "manage_user";
    }

    @RequestMapping("/search_by_selectbox")
    @ResponseBody
    public List<UserVO> SearchBySelectBox(HttpServletRequest req, HttpServletResponse res, String search_grade,
                                  String search_stat, String search_money, String search_flag) throws Exception{

        List<UserVO> user_list = userService.getUserListService(search_grade,search_stat,search_money,search_flag);

        return user_list;
    }
}
