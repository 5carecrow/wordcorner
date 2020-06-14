package com.lanchaohao.wordcorner.dao;

import com.lanchaohao.wordcorner.domain.Myword;
import com.lanchaohao.wordcorner.util.MyMapper;

public interface MywordMapper extends MyMapper<Myword> {
    //查询今日单词
    int countTodayWords(String userid);
    //我所学单词总数
    int myWords(String userid);
}