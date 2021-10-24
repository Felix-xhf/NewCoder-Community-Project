package com.nowcoder.community.dao;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-10-24 16:49
 */

import org.springframework.stereotype.Repository;

@Repository("AlphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
