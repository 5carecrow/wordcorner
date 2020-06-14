package com.lanchaohao.wordcorner.controller;

import com.lanchaohao.wordcorner.domain.Users;
import com.lanchaohao.wordcorner.service.IChecksService;
import com.lanchaohao.wordcorner.service.IMywordService;
import com.lanchaohao.wordcorner.service.IWordService;
import com.lanchaohao.wordcorner.util.Result;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By Admin
 */
@Controller
public class WordTestController {
    @Resource
    private IWordService iWordService;
    @Resource
    private IMywordService iMywordService;
    @Resource
    private IChecksService iChecksService;

    @RequestMapping(value = "/user/WordTest",method =  RequestMethod.POST)
    @ResponseBody
    public Result WordTest(HttpServletRequest request){
        Users user=(Users)request.getSession().getAttribute("login_user");
        if(user == null){
            return Result.error();
        }
        String userid = user.getId().toString();
        String username = user.getUsername();
        Map<String,Object> map = new HashMap<String,Object>();
        if(iMywordService.myWords(userid)<20){
            map.put("checkcomp","-1");
            return Result.ok(map);
        }
        if(iChecksService.TodayCheck(userid)){
            map.put("checkcomp","1");
            return Result.ok(map);
        }
        return Result.ok();
    }
}
