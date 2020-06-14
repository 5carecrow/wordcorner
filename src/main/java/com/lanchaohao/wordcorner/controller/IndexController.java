package com.lanchaohao.wordcorner.controller;

/**
 * Created By Admin
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lanchaohao.wordcorner.domain.Shuoshuo;
import com.lanchaohao.wordcorner.domain.Shuoshuomin;
import com.lanchaohao.wordcorner.domain.Users;
import com.lanchaohao.wordcorner.service.IChecksService;
import com.lanchaohao.wordcorner.service.IMywordService;
import com.lanchaohao.wordcorner.service.IShuoshuoService;
import com.lanchaohao.wordcorner.service.IUserService;
import com.lanchaohao.wordcorner.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
//@RequestMapping(value = "/user")
public class IndexController {
    @Resource
    private IUserService usersService;
    @Resource
    private IMywordService mywordService;
    @Resource
    private IChecksService checksService;
    @Resource
    private IShuoshuoService iShuoshuoService;
    //用户名头像获取 value与return一致
    @RequestMapping(value = "index")
    public String message(Model model,HttpServletRequest request){
        Users user=(Users)request.getSession().getAttribute("login_user");
        model.addAttribute("username", user.getUsername());
        return "index";
    }

    @RequestMapping(value = "/user/indexInfo",method = RequestMethod.POST)
    @ResponseBody
    public Result indexInfo(HttpServletRequest request){
        Users user=(Users)request.getSession().getAttribute("login_user");
        if(user == null){
            return Result.error();
        }
        String userid = user.getId().toString();
        String username = user.getUsername();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("signdays",user.getSigndays());
        if(user.getLastsign()==null){
            map.put("sign","0");
        }
        else {
            map.put("sign","1");
        }
        map.put("daystoday",mywordService.countTodayWords(userid));
        map.put("wordcounts",mywordService.myWords(userid));
        if(checksService.TodayCheck(userid)){
            map.put("check","1");//完成
        }
        else{
            map.put("check","0");//未完成
        }
        //首页说说获取
        List<Shuoshuomin> list = new ArrayList<Shuoshuomin>();
        List<Shuoshuo> temp = iShuoshuoService.FindshuoshouBytime();
        int listsize = temp.size();
        if(listsize>3){//首页只显示3条
            listsize = 3;
        }
        for(int i=0;i<listsize;i++){
            Shuoshuo ss = new Shuoshuo();
            Shuoshuomin ssmin = new Shuoshuomin();
            ss = (Shuoshuo)temp.get(i);
            Date ts = ss.getCreatetime();
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str = sdf.format(ts);
            ssmin.setCreatetime(str);
            ssmin.setShuoshuo(ss.getShuoshuo());
            ssmin.setUsername(ss.getUsername());
            ssmin.setLikessss(ss.getLikes());
            list.add(ssmin);
        }
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(list));//fastjson转换
        map.put("json",list);
        return Result.ok(map);
    }
}
