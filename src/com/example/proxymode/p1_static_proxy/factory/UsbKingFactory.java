package com.example.proxymode.p1_static_proxy.factory;


import com.example.proxymode.p1_static_proxy.service.UsbSell;

/**
 *  目标类：金士顿厂家，不接受用户的单独购买
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        // 一个128G的u盘是85元。
        return 85.f;
    }
}
