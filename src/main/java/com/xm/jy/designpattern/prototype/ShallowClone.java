package com.xm.jy.designpattern.prototype;

/**
 * @author: albert.fang
 * @date: 2021/1/11 14:36
 * @description: 浅克隆：原型对象克隆对象，只克隆原型对象和原型对象中的值类型数据；
 * 而原型对象中的引用类型数据是不进行克隆的，直接复制一份原型对象的引用属性内存地址给克隆对象。
 * java的Object类带有的clone对象就是浅拷贝。
 */
public class ShallowClone implements Cloneable {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ShallowClone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected ShallowClone clone() {
        Object object = null;
        try {
            object = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (ShallowClone)object;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：").append(name).append(";");
        sb.append("年龄：").append(age);
        return sb.toString();
    }

    public static void main(String[] args) {
        ShallowClone protoType = new ShallowClone("郭哥", 26);
        ShallowClone shallowClone = protoType.clone();
        System.out.println(System.identityHashCode(protoType) == System.identityHashCode(shallowClone));
        System.out.println(System.identityHashCode(protoType.age) == System.identityHashCode(shallowClone.age));
        System.out.println(System.identityHashCode(protoType.name) == System.identityHashCode(shallowClone.name));
    }


}
