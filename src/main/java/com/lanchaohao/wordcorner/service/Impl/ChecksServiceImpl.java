package com.lanchaohao.wordcorner.service.Impl;

import com.lanchaohao.wordcorner.dao.ChecksMapper;
import com.lanchaohao.wordcorner.domain.Checks;
import com.lanchaohao.wordcorner.service.IChecksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created By Admin
 */
@Service
public class ChecksServiceImpl extends AllServiceImpl<Checks> implements IChecksService {
    @Resource
    private ChecksMapper checksMapper;
    @Override
    public boolean TodayCheck(String userid){
        if(checksMapper.todayCheckWords(userid)<20){
            return false;
        }
        return true;
    }
}
