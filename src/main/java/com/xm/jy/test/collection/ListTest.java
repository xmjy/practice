package com.xm.jy.test.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @auther 方翔鸣
 * @date 2020/3/7 13:04
 */
public class ListTest {
    private List<Integer> sorted = new LinkedList<>();
    public void addElement(int n) {
        // TODO
    }
    public static void main(String[] args) {
        LinkedList<Integer> sorted = new LinkedList<>();
        sorted.add(1);
        sorted.get(1);
        for (int i = 0; i < sorted.size()-1; i++) {
            for (int j = 0; j < sorted.size()-i-j; j++){
                if (sorted.get(j) > sorted.get(j + 1)) {
                    int first = sorted.get(j);
                    int last = sorted.get(j + 1);
                    int temp = first;
                    first = last;
                    last = temp;
                    sorted.add(first);
                    sorted.add(last);
                }
            }
        }

    }
}
