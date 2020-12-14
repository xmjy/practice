package com.xm.jy.job_51.mianTest;


import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

/**
 * @author: albert.fang
 * @date: 2020/4/23 14:51
 * @description: 随便测试的内容，随测随删
 */
public class Test_51 {
    private static ArrayList<JSONObject> pendingList;

    static {
        pendingList = new ArrayList<>();
        pendingList.add(new JSONObject().fluentPut("id","m_25"));
        pendingList.add(new JSONObject().fluentPut("id","m_24"));
        pendingList.add(new JSONObject().fluentPut("id","m_23"));
        pendingList.add(new JSONObject().fluentPut("id","s_25").fluentPut("sort",6));
        pendingList.add(new JSONObject().fluentPut("id","s_41").fluentPut("sort",5));
        pendingList.add(new JSONObject().fluentPut("id","s_36").fluentPut("sort",4));
        pendingList.add(new JSONObject().fluentPut("id","s_50").fluentPut("sort",3));
        pendingList.add(new JSONObject().fluentPut("id","t_78").fluentPut("sort",8));
        pendingList.add(new JSONObject().fluentPut("id","t_77").fluentPut("sort",7));
        pendingList.add(new JSONObject().fluentPut("id","t_76").fluentPut("sort",6));
        pendingList.add(new JSONObject().fluentPut("id","t_75").fluentPut("sort",5));
        pendingList.add(new JSONObject().fluentPut("id","t_74").fluentPut("sort",4));
        pendingList.add(new JSONObject().fluentPut("id","t_73").fluentPut("sort",3));
        pendingList.add(new JSONObject().fluentPut("id","t_72").fluentPut("sort",3));
    }

    public static void main(String[] args) {
        for (int i = 0; i < pendingList.size(); i++) {
            System.out.println(pendingList.get(i).toJSONString());
        }
    }



}
