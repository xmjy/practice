package com.xm.jy.leetcode.doing;

import com.xm.jy.leetcode.data_structure.MyLinkedList_1;

/**
 * @author: albert.fang
 * @date: 2020/7/23 16:32
 * @description: 707. 设计链表
 */
public class LeetCode_32 {
    public static void main(String[] args) {
        MyLinkedList_1 linkedList = new MyLinkedList_1();
        linkedList.addAtTail(25);
        linkedList.addAtIndex(2,24);
        linkedList.addAtIndex(2,66);
        linkedList.deleteAtIndex(0);
        linkedList.addAtHead(22);
        System.out.println(linkedList.length);
//        int a ,b = 0;
//        a = b;
//        b = a;
//        System.out.println(a + " " +b);
    }
}
