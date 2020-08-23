package com.cuvic.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    @Autowired
    UserService(UserMapper userMapper){this.userMapper = userMapper;}

    // 회원 리스트 받아오는 서비스
    public List<UserVO> getUserListService() throws Exception{
        return userMapper.getUserList();
    }

    // 회원 상태 받아오는 서비스
    public List<UserStatVO> getUserStatListService() throws Exception{
        return userMapper.getUserStatList();
    }
}
