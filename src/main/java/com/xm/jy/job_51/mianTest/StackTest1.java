package com.xm.jy.job_51.mianTest;

import java.util.LinkedList;

/**
 * @author: albert.fang
 * @date: 2020/7/7 14:50
 * @description: 栈的练习，判断字符串｛()[]｝是否合法
 * 合法规则：相应左括号在左边，按顺序匹配右括号；合法eg：｛[]()｝、[(())]
 *
 * 思路：遍历只包含｛[]()｝字符的字符串，遇到左括号则进行压栈处理，
 * 遇到右括号则对压入栈顶的元素进行出栈操作，并且判断出栈的左括号和遍历得到的右括号是否为一对，
 * 如果是一对则继续，不是一对则直接运行结束，判断该字符串为非法字符串。
 *
 * 难点：如何判断[]、｛｝、（）为正确的三对括号？
 *
 * 解决思路：封装一个方法，让其六种可能匹配为true
 */
public class StackTest1 {

    public static void main(String[] args) throws Exception {
        String str = "{[](})}";
        LinkedList linkedList = new LinkedList();
        for (char c : str.toCharArray()) {
            if (c == '{' || c == '[' || c == '('){
                linkedList.push(c);
            }
            else {
                if (!compareBracket(c, (Character) linkedList.pop())){
                    throw new Exception("非法字符");
                }
            }
        }
        if (linkedList.size() == 0){
            System.out.println("合法字符");
        }
    }

    /**
     * 比较 a,b两个括号是否为一对
     * @param a
     * @param b
     * @return true a,b一对括号，false不一对
     */
    private static boolean compareBracket(char a,char b){
        return (a == '(' && b == ')') || (a == ')' && b == '(') ||  (a == '{' && b == '}') || (a == '}' && b == '{') || (a == '[' && b == ']') || (a == ']' && b == '[');
    }
}
