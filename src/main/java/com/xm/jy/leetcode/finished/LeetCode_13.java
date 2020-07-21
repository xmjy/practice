package com.xm.jy.leetcode.finished;

import com.xm.jy.leetcode.ListNode;

/**
 * @author: albert.fang
 * @date: 2020/7/21 15:59
 * @description: 面试题 02.03. 删除中间节点
 */
public class LeetCode_13 {
    private static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
