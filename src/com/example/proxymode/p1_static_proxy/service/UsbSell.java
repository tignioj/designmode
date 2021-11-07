package com.example.proxymode.p1_static_proxy.service;


// 表示功能的，厂家，商家都要完成的功能。
public interface UsbSell {

    // 定义方法,

    /**
     * @param amount 表示一次购买的数量，暂时不用
     * @return 返回需要支付的价格
     */
    float sell(int amount);
}
