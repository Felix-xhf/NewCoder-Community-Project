package com.nowcoder.community.service;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-10-24 17:05
 */

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    @PostConstruct //会在构造器之后调用
    public void init(){
        System.out.println("初始化AlphaService");
    }

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }

    @PreDestroy  //在对象销毁之前调用
    public void destroy(){
        System.out.println("销毁AlphaService");
    }

    public String find(){
        return alphaDao.select();
    }
}
