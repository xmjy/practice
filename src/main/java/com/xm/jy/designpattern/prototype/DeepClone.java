package com.xm.jy.designpattern.prototype;

import ch.qos.logback.core.net.ObjectWriter;

import java.io.*;

/**
 * @author: albert.fang
 * @date: 2021/1/11 14:48
 * @description: 深拷贝：将对象复制写到流里，再从流中读取对象。
 * 原型对象里的引用类型也会完全复制一份给克隆的对象，而不是仅仅将原型对象里的引用类型属性内存地址复制一份给克隆对象的属性。
 */
public class DeepClone implements Serializable {
    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeepClone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected DeepClone deepClone() throws IOException, ClassNotFoundException {
        // 1、将当前对象克隆一份到流里
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(this);
        // 2、从流中读取克隆对象
        InputStream ins = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(ins);
        return (DeepClone)ois.readObject();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：").append(name).append(";");
        sb.append("年龄：").append(age);
        return sb.toString();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeepClone protoType = new DeepClone("郭哥", 26);
        DeepClone shallowClone = protoType.deepClone();
        System.out.println(System.identityHashCode(protoType) == System.identityHashCode(shallowClone));
        System.out.println(System.identityHashCode(protoType.age) == System.identityHashCode(shallowClone.age));
        System.out.println(System.identityHashCode(protoType.name) == System.identityHashCode(shallowClone.name));
    }
}
