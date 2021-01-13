package com.xm.jy.designpattern.elevenbehaviorpattern.observerpattern;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: albert.fang
 * @date: 2021/1/13 16:10
 * @description: 具体被观察目标：股票，stock
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Stock extends AbstractSubject {

    private String stockName;

    private BigDecimal stockPrice;

    private String changeDescription;

    /**
     * 是否浮动大于5个点
     */
    private Boolean overFivePoint = false;


    @Override
    public void notifyObserver() {
        observers.forEach( v -> v.update(this));
    }

    public Stock(String stockName, BigDecimal stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    /**
     * 改变股票的价格
     * @param stockPrice 股票新价格
     */
    public void changeStockPrice(BigDecimal stockPrice) {
        double abs = Math.abs(this.stockPrice.doubleValue() - stockPrice.doubleValue());
        if (abs / this.stockPrice.doubleValue() >= 0.05 && stockPrice.doubleValue() < this.stockPrice.doubleValue()){
            setChangeDescription("当前股票 涨跌至少5个点");
            setOverFivePoint(true);
        }
        else if (abs / this.stockPrice.doubleValue() >= 0.05 && stockPrice.doubleValue() > this.stockPrice.doubleValue()){
            setChangeDescription("当前股票 涨幅至少5个点");
            setOverFivePoint(true);
        }
        else {
            setOverFivePoint(false);
        }
        setStockPrice(stockPrice);
        if (getOverFivePoint()){
            notifyObserver();
        }
    }

}
