package com.xm.jy.job_51.mianTest;

/**
 * @author: albert.fang
 * @date: 2020/4/23 14:51
 * @description: 随便测试的内容，随测随删
 */
public class Test_51 {
    public static void main(String[] args) {
       String pidAndReportIds = "t_551~65, t_398~1458, t_570~1916";
       String pidAndApids = "t_398:10271349,10271311,10248721--t_551:10248721,10248531,10248279,10248272--t_570:10248721";
        String[] report=pidAndReportIds.split(",");
        for (int i = 0; i < report.length; i++) {
            String pidAndReportId = report[i]+":";
            String product = report[i].split("~")[0]+":";
            pidAndApids = pidAndApids.replaceFirst(product, pidAndReportId);
        }
        System.out.println(pidAndApids);
    }
}
