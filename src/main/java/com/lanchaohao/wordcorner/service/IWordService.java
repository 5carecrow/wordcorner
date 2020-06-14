package com.lanchaohao.wordcorner.service;

import com.lanchaohao.wordcorner.domain.Word;

/**
 * Created By Admin
 */
public interface IWordService extends IAllService<Word> {
    ////按区间难度随机抽取一个单词
    Word FindwordByDif(int a,int b);
}
