package com.lanchaohao.wordcorner.service.Impl;

import com.lanchaohao.wordcorner.dao.WordMapper;
import com.lanchaohao.wordcorner.domain.Word;
import com.lanchaohao.wordcorner.service.IWordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created By Admin
 */
@Service
public class WordServiceImpl extends AllServiceImpl<Word> implements IWordService {
    @Resource
    private WordMapper wordMapper;
    ////按区间难度随机抽取单词
    @Override
    public Word FindwordByDif(int a,int b){
        return wordMapper.FindwordByDif(a,b);
    }
}
