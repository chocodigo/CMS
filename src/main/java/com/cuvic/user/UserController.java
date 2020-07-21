package com.cuvic.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    회원 관리 / 로그인 컨트롤
 */

@Controller
public class UserController {

    @RequestMapping("/login")
    public String LoginPage(){
        return "/login";
    }
}
