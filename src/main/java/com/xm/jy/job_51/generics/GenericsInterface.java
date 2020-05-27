package com.xm.jy.job_51.generics;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: albert.fang
 * @date: 2020/4/23 11:55
 * @description: 泛型接口
 */
public interface GenericsInterface<S,D> {
    void show(S s,D d);
}

class GenericsInterfaceImpl implements GenericsInterface<String, Date>{

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void show(String s, Date date) {
        System.out.println(s+sdf.format(date));
    }

    /**
     * 测试泛型接口，一个类要实现某个泛型接口，要将具体类型参数传进去
     * @param args
     */
    public static void main(String[] args) {
        GenericsInterfaceImpl genericsInterface = new GenericsInterfaceImpl();
        genericsInterface.show("我是林就远",new Date());
    }
}
