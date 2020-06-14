package com.lanchaohao.wordcorner;

import com.lanchaohao.wordcorner.util.MyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@MapperScan(basePackages = {"com.lanchaohao.wordcorner.dao"}, markerInterface = MyMapper.class)
@ImportResource(locations={"classpath:myKaptcher.xml"})
//@ComponentScan( basePackages = "com.bd.*")

public class WordcornerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordcornerApplication.class, args);
    }
}
