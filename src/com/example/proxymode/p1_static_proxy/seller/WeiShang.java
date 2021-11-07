package com.example.proxymode.p1_static_proxy.seller;

import com.example.proxymode.p1_static_proxy.factory.UsbKingFactory;
import com.example.proxymode.p1_static_proxy.service.UsbSell;

/**
 * 微商代理
 */
public class WeiShang implements UsbSell {
    private UsbSell factory = new UsbKingFactory();

    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = factory.sell(amount);

        // 只增加一元
        return price + 1;
    }
}
