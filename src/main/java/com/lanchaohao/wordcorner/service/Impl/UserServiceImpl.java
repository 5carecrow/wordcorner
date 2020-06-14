package com.lanchaohao.wordcorner.service.Impl;

import com.lanchaohao.wordcorner.exception.TipException;
import com.lanchaohao.wordcorner.dao.UsersMapper;
import com.lanchaohao.wordcorner.domain.Users;
import com.lanchaohao.wordcorner.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created By Admin
 */
@Service
public class UserServiceImpl extends AllServiceImpl<Users> implements IUserService {
    //@Autowired
    //private Users  users;
    @Resource
    private UsersMapper usersMapper;
    @Override
    public Users login(String username, String password) {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            System.out.println("用户名和密码不能为空");
            throw new TipException("用户名和密码不能为空");
        }
        int count = usersMapper.countByUsername(username);
        System.out.println("根据用户名查询到用户数："+count);
        if (count < 1) {
            System.out.println("不存在该用户");
            throw new TipException("不存在该用户");
        }
        List<Users> users = usersMapper.loginFind(username,password);
        if (users.size()!=1) {
            System.out.println("用户名或密码错误");
            throw new TipException("用户名或密码错误");
        }
        return users.get(0);
    }
    @Override
    public boolean signToday(String username){
        List<Users> users = usersMapper.Todaysign(username);
        if (users.size()!=1) {
            return false;
        }
        return true;
    }
}
