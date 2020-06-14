package com.lanchaohao.wordcorner.controller;

import com.lanchaohao.wordcorner.exception.TipException;
import com.lanchaohao.wordcorner.domain.Users;
import com.lanchaohao.wordcorner.service.IUserService;
import com.lanchaohao.wordcorner.util.Result;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@Transactional(rollbackFor = TipException.class)
public class LoginController {
    @Resource
    private IUserService usersService;

    @RequestMapping(value = "/loginPost",method = RequestMethod.POST)
    @ResponseBody
    public Result doLogin(@RequestParam String username,
                          @RequestParam String password,
                          @RequestParam(required = false) String remeber_me,
                          HttpServletRequest request,
                          HttpServletResponse response) {
//        Integer error_count = cache.get("login_error_count");
        System.out.println("执行POST"+username+password);
        try {
            Users user = usersService.login(username, password);
            request.getSession().setAttribute("login_user", user);

//            if (StringUtils.isNotBlank(remeber_me)) {
//                TaleUtils.setCookie(response, user.getUid());
//            }
        } catch (Exception e) {
            String msg = "登录失败";
            if (e instanceof TipException) {
                msg = e.getMessage();
            }
            return Result.error(0,msg);
        }
        return Result.ok();
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 移除session
        session.removeAttribute("login_user");
        return "redirect:user/login";
    }
}
