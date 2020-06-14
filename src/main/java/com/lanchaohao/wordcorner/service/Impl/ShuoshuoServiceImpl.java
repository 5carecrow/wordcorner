package com.lanchaohao.wordcorner.service.Impl;

import com.lanchaohao.wordcorner.dao.ShuoshuoMapper;
import com.lanchaohao.wordcorner.domain.Shuoshuo;
import com.lanchaohao.wordcorner.service.IShuoshuoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created By Admin
 */
@Service
public class ShuoshuoServiceImpl extends AllServiceImpl<Shuoshuo> implements IShuoshuoService {
    @Resource
    private ShuoshuoMapper shuoshuoMapper;
    @Override
    public List FindshuoshouBytime(){
        return shuoshuoMapper.FindshuoshouBytime();
    }
}
