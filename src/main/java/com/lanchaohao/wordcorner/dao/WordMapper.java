package com.lanchaohao.wordcorner.dao;

import com.lanchaohao.wordcorner.domain.Word;
import com.lanchaohao.wordcorner.util.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface WordMapper extends MyMapper<Word> {
    //按区间难度随机抽取
    Word FindwordByDif(@Param("a") int a, @Param("b") int b);
}