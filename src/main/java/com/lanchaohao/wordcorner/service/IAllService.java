package com.lanchaohao.wordcorner.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Admin
 */
@Service
public interface IAllService<T> {
    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
