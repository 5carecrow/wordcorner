package com.lanchaohao.wordcorner.dao;

import com.lanchaohao.wordcorner.domain.Users;
import com.lanchaohao.wordcorner.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper extends MyMapper<Users> {
//    登陆查询
    List<Users> loginFind(@Param("username") String username,@Param("password") String password);
//    根据用户名统计存在用户数
    int countByUsername(String username);
    Users findUserByUsername(String username);
    //查询浸提是否签到
    List<Users> Todaysign(@Param("username") String username);
}