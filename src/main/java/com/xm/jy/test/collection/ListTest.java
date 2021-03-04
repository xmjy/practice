package com.xm.jy.test.collection;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @auther 方翔鸣
 * @date 2020/3/7 13:04
 */
public class ListTest {

    public static void main(String[] args) {
        ArrayList<User> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new User(i+1,"张"+i,30-i));
        }
        // 0 和 2 这两个位置的元素交换
        Collections.swap(arrayList,0,2);

        // 将index 为 9 的提到首位 add(index,element)
        User removeElement = arrayList.remove(9);
        arrayList.add(0,removeElement);
        arrayList.forEach(System.out::println);

        // 获取具体元素的index,indexOf
        System.out.println(arrayList.indexOf(arrayList.get(6)));

    }
}

@Data
class User{
    int id;
    String name;
    int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
