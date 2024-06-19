package com.ready.app.test;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
    @Autowired
    SqlSession session;

    String namespace = "com.ready.app.test.dao.";
    public int test(){
        return session.selectOne(namespace + "test");
    }
}
