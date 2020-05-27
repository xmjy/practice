package com.xm.jy.center;


import java.util.Iterator;

public class CenterTest {

    public static void main(String[] args) {
        String wxlx = "傣文报纸合订本";
        boolean flag = true;
        if (flag) {
            Iterator var3 = TBookLXUtil.TS_LX_MAP.keySet().iterator();

            while(var3.hasNext()) {
                String key = (String)var3.next();
                if (key.equals(wxlx)) {
                    System.out.println(TBookLXUtil.TS_LX_MAP.get(key));
                    flag = false;
                }
            }
        }

        if (flag) {
            System.out.println(30);
        }

    }
}