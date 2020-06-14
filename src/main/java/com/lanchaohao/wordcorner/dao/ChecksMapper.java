package com.lanchaohao.wordcorner.dao;

import com.lanchaohao.wordcorner.domain.Checks;
import com.lanchaohao.wordcorner.util.MyMapper;

public interface ChecksMapper extends MyMapper<Checks> {
    //查询今日考核内完成单词数
    int todayCheckWords(String userid);
}