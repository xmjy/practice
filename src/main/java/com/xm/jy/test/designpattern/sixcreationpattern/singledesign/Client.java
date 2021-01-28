package com.xm.jy.test.designpattern.sixcreationpattern.singledesign;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: albert.fang
 * @date: 2021/1/12 17:12
 * @description: 攻击单例类
 * 分别用反射和反序列化对
 * 1、饿汉模式
 * 2、懒汉模式，主要是对double checked locking这种
 * 3、IoDH
 * 4、Enum
 * 四种创建单例对象的方式进行客户端反射以及序列化创建单例对象
 * 目的：证明哪种创建单例对象的方式是最安全、可靠的。
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        deserializableObject();
        reflectInstance();
    }
    /**
     * 反序列化创建单例对象
     */
    private static void deserializableObject() throws IOException, ClassNotFoundException {
        // 1、饿汉模式 - 反序列化
        HungrySingleTonPattern instance = HungrySingleTonPattern.getInstance();
        if (serializableObject(instance)) {
            System.out.println("饿汉模式 - 反序列化，创建出不唯一单例对象");
        }
        else {
            System.out.println("饿汉模式 - 反序列化，创建出唯一单例对象");
        }
        // 2、懒汉模式 - 反序列化
        LazySingleTonPatternOptimize3 lazy = LazySingleTonPatternOptimize3.getInstance();
        if (serializableObject(lazy)) {
            System.out.println("懒汉模式 - 反序列化，创建出不唯一单例对象");
        }
        else {
            System.out.println("懒汉模式 - 反序列化，创建出唯一单例对象");
        }
        // 3、IoDH - 反序列化
        IoDh ioDh = IoDh.getInstance();
        if (serializableObject(ioDh)) {
            System.out.println("IoDH - 反序列化，创建出不唯一单例对象");
        }
        else {
            System.out.println("IoDH - 反序列化，创建出唯一单例对象");
        }
        // 4、Enum - 反序列化
        SinglePatternEnum enumObject = SinglePatternEnum.SINGLE_PATTERN_ENUM;
        if (serializableObject(enumObject)) {
            System.out.println("Enum - 反序列化，创建出不唯一单例对象");
        }
        else {
            System.out.println("Enum - 反序列化，创建出唯一单例对象");
        }
    }

    /**
     * 反射创建单例对象
     */
    private static void reflectInstance() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        // 1、饿汉模式 - 反射
        HungrySingleTonPattern hungry = HungrySingleTonPattern.getInstance();
        if (reflectObject(hungry,hungry.getClass())) {
            System.out.println("饿汉模式 - 反射，创建出不唯一单例对象");
        }
        else {
            System.out.println("饿汉模式 - 反射，创建出唯一单例对象");
        }
        // 2、懒汉模式 - 反射
        LazySingleTonPatternOptimize3 lazy = LazySingleTonPatternOptimize3.getInstance();
        if (reflectObject(lazy,lazy.getClass())) {
            System.out.println("懒汉模式 - 反射，创建出不唯一单例对象");
        }
        else {
            System.out.println("懒汉模式 - 反射，创建出唯一单例对象");
        }
        // 3、IoDH - 反射
        IoDh ioDh = IoDh.getInstance();
        if (reflectObject(ioDh,ioDh.getClass())) {
            System.out.println("IoDH - 反射，创建出不唯一单例对象");
        }
        else {
            System.out.println("IoDH - 反射，创建出唯一单例对象");
        }
        // 4、Enum - 反射（枚举类不允许反射，报错：NoSuchMethodException）
        SinglePatternEnum enumObject = SinglePatternEnum.SINGLE_PATTERN_ENUM;
        if (reflectObject(enumObject,enumObject.getClass())) {
            System.out.println("Enum - 反射，创建出不唯一单例对象");
        }
        else {
            System.out.println("Enum - 反射，创建出唯一单例对象");
        }
    }


    /**
     * 将入参原型对象反序列化，创建一个新的对象
     * @param object 待反序列化的原型对象
     * @return 判断原型对象和反序列化的对象是否是同一个；true - 不是同一个；false - 同一个对象
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static boolean serializableObject(Object object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object clone = ois.readObject();
        System.out.println(System.identityHashCode(object));
        System.out.println(System.identityHashCode(clone));
        return System.identityHashCode(object) != System.identityHashCode(clone);
    }

    /**
     * 判断反射创建的对象和原型对象是否是同一个
     * @param object 原型对象
     * @param clazz 原型对象所属类型
     * @return true - 不是同一个；false - 同一个
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    private static boolean reflectObject(Object object,Class<?> clazz) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        // 私有构造器，暴力访问
        constructor.setAccessible(true);
        Object reflectObject = constructor.newInstance();
        System.out.println(System.identityHashCode(object));
        System.out.println(System.identityHashCode(reflectObject));
        return System.identityHashCode(object) != System.identityHashCode(reflectObject);
    }
}
