package com.xm.jy.designpattern.elevenbehaviorpattern.observerpattern;

import lombok.Data;

/**
 * @author: albert.fang
 * @date: 2021/1/13 16:41
 * @description: 具体观察者：股民 investor
 */
@Data
public class Investor implements Observer {

    /**
     * 股民名字
     */
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(AbstractSubject subject) {
        Stock stock = (Stock) subject;
        if (stock.getOverFivePoint()){
            System.out.println(getName()+" 收到消息，" +stock.getChangeDescription() + "; 当前股票新价格是：" + stock.getStockPrice().doubleValue());
        }
    }

}
