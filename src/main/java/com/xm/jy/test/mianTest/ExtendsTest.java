package com.xm.jy.test.mianTest;

/**
 * @ClassName: ExtendsTest
 * @Description: description of class
 * @Author: Albert
 * @CreateDate: 2019/12/11 17:35
 */
class ExtendsTest1{
    public int i = 1;

    public void info(){
        System.out.println("我是父类");
    }

}
class ExtendsTest2 extends ExtendsTest1{
    public int i= 2;

    public void info() {
        System.out.println("我是子类");
    }
}
public class ExtendsTest{
    public static void main(String[] args) {
        ExtendsTest1 test1 = new ExtendsTest2();
        test1.info();
        System.out.println(test1.i);
    }
}
