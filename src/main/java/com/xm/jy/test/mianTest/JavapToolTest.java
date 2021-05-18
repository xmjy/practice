package com.xm.jy.test.mianTest;

/**
 * @ClassName: JavapToolTest
 * @Description: description of class
 * @Author: Albert
 * @CreateDate: 2019/12/11 13:51
 */
public class JavapToolTest {
    public static void main(String[] args) {
        for (int i = 0; i < 520; i++) {
            System.out.printf("%s，我想听你喊老公  ","江含辛");
            if ((i + 1) % 6 == 0) {
                System.out.println();
            }
        }
    }
}
