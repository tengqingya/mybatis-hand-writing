package com.gupaoedu.mybatis.my;


import java.lang.reflect.Proxy;

/**
 * Created by James on 2017/3/29.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class MySqlSession {
    private Executor executor = new SimpleExecutor();

    public <T> T selectOne(String statement, Object parameter) {
        return executor.query(statement,parameter);
    }

    public <T> T getMapper(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new MapperProxy<T>(this, clazz));
    }
}
