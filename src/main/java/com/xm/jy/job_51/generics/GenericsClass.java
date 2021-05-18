package com.xm.jy.job_51.generics;

/**
 * @author: albert.fang
 * @date: 2020/4/23 11:46
 * @description: 泛型类
 */
public class GenericsClass<T> {
    private T value;

    public GenericsClass(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    /**
     * <R,V>的作用是声明R类型和V类型，不然没声明的话，那怎么可以直接用？完成泛型类型的声明（这里指R,V）
     * 为什么T不需要声明？那是因为T已经在类上声明了。
     * @param t
     * @param r
     * @param v
     * @param <R>
     * @param <V>
     * @return
     */
    public <R,V> T getTRV(T t,R r,V v){
        if (r != null && v != null){
            return t;
        }
        return null;
    }
    public void setValue(T value) {
        this.value = value;
    }


}
