package com.cuvic.user;

/*
    회원관리 매퍼
 */

import java.util.List;

public interface UserMapper {

    // 회원 리스트 받아오기
    public List<UserVO> getUserList(String search_grade,
                                    String search_stat, String search_money, String search_flag) throws Exception;

    // 회원 상태 받아오기
    public List<UserStatVO> getUserStatList() throws Exception;

    // 회원 기수 리스트 받아오기
    public List<Integer> getUserFlagList() throws Exception;

}
