package com.xm.jy.test.designpattern.elevenbehaviorpattern.observerpattern;

import java.math.BigDecimal;

/**
 * @author: albert.fang
 * @date: 2021/1/13 16:57
 * @description: 观察者模式客户端
 */
public class Client {
    public static void main(String[] args) {
        // 观察者
        Investor zhangsan = new Investor("张三");
        Investor lisi = new Investor("李四");
        Investor wangwu = new Investor("王五");

        // 股票 - 被观察者
        Stock stock = new Stock("东风祥瑞股票", new BigDecimal(100));
        // 将股民添加到观察者队列
        stock.add(zhangsan);
        stock.add(lisi);
        stock.add(wangwu);
        // 尝试改变股票状态
        stock.changeStockPrice(new BigDecimal(stock.getStockPrice().doubleValue() * 0.96));
        stock.changeStockPrice(new BigDecimal(stock.getStockPrice().doubleValue() * 0.95));

        stock.changeStockPrice(new BigDecimal(stock.getStockPrice().doubleValue() * 1.04));
        stock.changeStockPrice(new BigDecimal(stock.getStockPrice().doubleValue() * 1.05));
        stock.changeStockPrice(new BigDecimal(stock.getStockPrice().doubleValue() * 1.049));
        stock.changeStockPrice(new BigDecimal(stock.getStockPrice().doubleValue() * 1.05));

    }
}
