package com.lanchaohao.wordcorner.service;

import com.lanchaohao.wordcorner.domain.Shuoshuo;

import java.util.List;

/**
 * Created By Admin
 */
public interface IShuoshuoService extends IAllService<Shuoshuo> {
    List FindshuoshouBytime();
}
