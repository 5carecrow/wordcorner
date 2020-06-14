package com.lanchaohao.wordcorner.service.Impl;

import com.lanchaohao.wordcorner.dao.MywordMapper;
import com.lanchaohao.wordcorner.domain.Myword;
import com.lanchaohao.wordcorner.service.IMywordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created By Admin
 */
@Service
public class MywordServiceImpl extends AllServiceImpl<Myword> implements IMywordService {
    @Resource
    private MywordMapper mywordMapper;
    @Override
    public int countTodayWords(String userid){
        return mywordMapper.countTodayWords(userid);
    }
    @Override
    public int myWords(String userid){
        return mywordMapper.myWords(userid);
    }
}
