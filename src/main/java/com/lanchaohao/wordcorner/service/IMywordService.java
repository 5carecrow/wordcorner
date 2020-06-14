package com.lanchaohao.wordcorner.service;

import com.lanchaohao.wordcorner.domain.Myword;
import com.lanchaohao.wordcorner.domain.Users;

/**
 * Created By Admin
 */
public interface IMywordService extends IAllService<Myword> {
    //今日所学单词数
    int countTodayWords(String userid);
    //我的单词数
    int myWords(String userid);
}
