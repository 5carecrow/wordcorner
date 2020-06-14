package com.lanchaohao.wordcorner.controller;

import com.lanchaohao.wordcorner.domain.Myword;
import com.lanchaohao.wordcorner.domain.Users;
import com.lanchaohao.wordcorner.domain.Word;
import com.lanchaohao.wordcorner.service.IMywordService;
import com.lanchaohao.wordcorner.service.IWordService;
import com.lanchaohao.wordcorner.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By Admin
 */
@Controller
public class DailyWordController {
    @Resource
    private IMywordService iMywordService;
    @Resource
    private IWordService iWordService;

    @RequestMapping(value = "/user/getDailyWord",method = RequestMethod.POST)
    @ResponseBody
    public Result getDailyWord(HttpServletRequest request){
        Users user=(Users)request.getSession().getAttribute("login_user");
        if(user == null){
            return Result.error();
        }
        String userid = user.getId().toString();
        int a=1,b=2;//难度区间
        String username = user.getUsername();
        Map<String,Object> map = new HashMap<String,Object>();
        int number = iMywordService.countTodayWords(userid);
        map.put("number",number+1);
        if(number>19){//学了20个，学完了
            return Result.ok(map);
        }
//0-9抽取难度为0-5，10-14抽取难度5-7，15-19抽取难度为7-10
        if((0<=number)&(number<=9)){
            a=0;
            b=5;
        }
        if((10<=number)&(number<=14)){
            a=5;
            b=7;
        }
        if((15<=number)&(number<=19)){
            a=7;
            b=10;
        }
        Word word = new Word();
        Word anoword = new Word();
        word = iWordService.FindwordByDif(a,b);
        int wid = word.getId();
        map.put("word",word.getWord());
        map.put("wordid",(word.getId()).toString());
        map.put("pronun",word.getPronunciation());
        map.put("wordexplain",word.getWordexplain());
        if(wid<15000){
            anoword = iWordService.selectByKey(15);
        }
        else{
            anoword = iWordService.selectByKey(16);
        }
        map.put("anotherword",anoword.getWordexplain());
        return Result.ok(map);
    }

    @RequestMapping(value = "/user/addToMyWord",method = RequestMethod.POST)
    @ResponseBody
    public Result addToMyWord(HttpServletRequest request){
        String postwordid= request.getParameter("postwordid");
        Users user=(Users)request.getSession().getAttribute("login_user");
        if(user == null){
            return Result.error();
        }
        int userid = user.getId();
        Date da = new Date();
        Timestamp nowd = new Timestamp(da.getTime());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(nowd);
        Myword myword = new Myword();
        myword.setUserid(userid);
        myword.setWordid(Integer.valueOf(postwordid));
        myword.setChecktimes(1);
        myword.setTruetimes(0);
        myword.setMarks(1);
        myword.setStudydate(nowd);
        myword.setDatastr(str);
        iMywordService.save(myword);
        return getDailyWord(request);
    }
}

