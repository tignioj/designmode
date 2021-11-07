package com.example.proxymode.p1_static_proxy;

import com.example.proxymode.p1_static_proxy.seller.Taobao;
import com.example.proxymode.p1_static_proxy.seller.WeiShang;

public class Customer {
    public static void main(String[] args) {
        taobaoProxy();

        weiShangProxy();
    }

    private static void weiShangProxy() {
        WeiShang weiS = new WeiShang();
        float price = weiS.sell(1);
        // 增强功能，代理类在完成目标类的方法调用后，增强了功能
        System.out.println("通过淘宝的的商家购买u盘单价:" + price);
    }

    private static void taobaoProxy() {
        Taobao taobao = new Taobao();
        float price = taobao.sell(1);
        // 增强功能，代理类在完成目标类的方法调用后，增强了功能
        System.out.println("通过淘宝的的商家购买u盘单价:" + price);
    }
}
