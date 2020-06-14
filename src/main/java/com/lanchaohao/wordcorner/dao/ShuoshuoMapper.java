package com.lanchaohao.wordcorner.dao;

import com.lanchaohao.wordcorner.domain.Shuoshuo;
import com.lanchaohao.wordcorner.util.MyMapper;

import java.util.List;

public interface ShuoshuoMapper extends MyMapper<Shuoshuo> {
    //按时间排序取出说说
    List<Shuoshuo> FindshuoshouBytime();
}