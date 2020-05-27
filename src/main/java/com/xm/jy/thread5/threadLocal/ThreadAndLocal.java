package com.xm.jy.thread5.threadLocal;

/**
 * @auther 方翔鸣
 * @date 2020/3/11 11:15
 */
public class ThreadAndLocal implements Runnable {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void run() {

    }

}
