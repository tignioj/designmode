package com.example.singleton;

/**
 * 饿汉式单例：类加载时对象已经创建完毕，线程安全
 */
public class SingleTon_Hungry_ThreadSafe {
    private static SingleTon_Hungry_ThreadSafe instance;

    static {
        instance = new SingleTon_Hungry_ThreadSafe();
    }

    public SingleTon_Hungry_ThreadSafe getInstance() {
        return instance;
    }

}
