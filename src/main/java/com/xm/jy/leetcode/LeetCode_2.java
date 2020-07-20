package com.xm.jy.leetcode;

import java.util.LinkedList;

/**
 * @author: albert.fang
 * @date: 2020/7/20 11:33
 * @description: 力扣第24题：两两翻转链表
 */
public class LeetCode_2 {
    private static ListNode swapPairs(ListNode curr) {
        ListNode prev = new ListNode(0);
        curr = prev.next;
        ListNode next = curr.next;
        return new ListNode(1);
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(4);
        listNode.next.next.next = new ListNode(5);
        ListNode finalListNode = swapPairs(listNode);
        System.out.println(finalListNode.val);
        System.out.println(finalListNode.next.val);
        System.out.println(finalListNode.next.next.val);
        System.out.println(finalListNode.next.next.next.val);
    }
}

/**
 * definition singly-linked
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
