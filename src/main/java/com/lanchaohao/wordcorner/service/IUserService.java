package com.lanchaohao.wordcorner.service;

import com.lanchaohao.wordcorner.domain.Users;

/**
 * Created By Admin
 */
public interface IUserService extends IAllService<Users> {
    //查找用户返回ID
    //Users findUserById(Integer id);
    //更新用户
    //void updateById(Users users);
    Users login(String username, String password);
    //是否签到
    boolean signToday(String username);

}
