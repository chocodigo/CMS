package com.cuvic.user;

/*
    회원관리 매퍼
 */

import java.util.List;

public interface UserMapper {

    // 회원 리스트 받아오기
    public List<UserVO> getUserList() throws Exception;

}
