//package com.lanchaohao.wordcorner.config;
//
//import com.lanchaohao.wordcorner.dao.UsersMapper;
//import com.lanchaohao.wordcorner.domain.SecurityUser;
//import com.lanchaohao.wordcorner.domain.Users;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import javax.annotation.Resource;
//
//
//public class CustomUserDetailsService implements UserDetailsService {
//    @Resource  //数据库服务类
//    private UsersMapper usersMapper;//code7
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        Users user = usersMapper.findUserByUsername(userName); //code8
//
//        if (user == null) {
//            throw new UsernameNotFoundException("UserName " + userName + " not found");
//        }
//
//        SecurityUser securityUser = new SecurityUser(user);
//        return securityUser;
//
//    }
//
//}
