package com.xm.jy.bishi;

/**
 * @auther 方翔鸣
 * @date 2020/3/11 9:51
 */
public class Ticket {
    // 还剩几个位置，数组里默认是0表示未被购买，1为已购买
    private static int[] nums = new int[100];

    // 构造同步监视器
    private static final Object obj = new Object();

    // whatNum是用户选择的影院座位号
    public void getTicket(int whatNum){
        if (whatNum > 100){
            System.out.println("影院没有该位置");
        }
        synchronized (obj){
            if (nums[whatNum-1] == 0){
                nums[whatNum-1] = 1;
                System.out.println(nums[whatNum-1] + "位置已被购买");
            }else {
                System.out.println("影院该位置已被购买");
            }
        }

    }

}
