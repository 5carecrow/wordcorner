package com.lanchaohao.wordcorner.service;

import com.lanchaohao.wordcorner.domain.Checks;

/**
 * Created By Admin
 */
public interface IChecksService extends IAllService<Checks> {
    //是否完成每日考核
    boolean TodayCheck(String userid);

}
