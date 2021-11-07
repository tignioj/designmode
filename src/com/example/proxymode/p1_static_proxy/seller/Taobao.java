package com.example.proxymode.p1_static_proxy.seller;

import com.example.proxymode.p1_static_proxy.factory.UsbKingFactory;
import com.example.proxymode.p1_static_proxy.service.UsbSell;

/**
 * 商家，代理金士顿u盘的销售
 */
public class Taobao implements UsbSell {
    //声明 商家代理的厂家具体是谁
    private UsbSell factory = new UsbKingFactory();


    @Override
    public float sell(int amount) {

        //向厂家发送订单，告诉厂家，我买了u盘，厂家发货。
        float fprice = factory.sell(amount);

        // 商家需要加价, 属于增强功能
        float sprice = fprice + 25.0f;

        // 在目标类的方法调用后，你做的其它功能都是增强。
        System.out.println("您有一个优惠券，请查收");

        // 增加的价格。
        return sprice;
    }
}
