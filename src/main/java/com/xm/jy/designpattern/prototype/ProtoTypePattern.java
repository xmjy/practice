package com.xm.jy.designpattern.prototype;

/**
 * @author: albert.fang
 * @date: 2021/1/11 13:55
 * @description: 原型模式：一般实现Cloneable接口的类就是原型类
 */
public class ProtoTypePattern implements Cloneable {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ProtoTypePattern(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected ProtoTypePattern clone() {
        Object object = null;
        try {
            object = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (ProtoTypePattern)object;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：").append(name).append(";");
        sb.append("年龄：").append(age);
        return sb.toString();
    }

    public static void main(String[] args) {
        ProtoTypePattern protoTypePattern = new ProtoTypePattern("方翔鸣",24);
        ProtoTypePattern protoTypePatternClone = protoTypePattern.clone();
        protoTypePatternClone.setName("林就远");
        System.out.println(protoTypePattern.toString());
        System.out.println(protoTypePatternClone.toString());
        System.out.println(protoTypePattern == protoTypePatternClone);
        System.out.println(protoTypePattern.age == protoTypePatternClone.age);
        System.out.println(protoTypePattern.name == protoTypePatternClone.name);
        System.out.println(System.identityHashCode(protoTypePattern.name));
        System.out.println(System.identityHashCode(protoTypePatternClone.name));
    }
}
