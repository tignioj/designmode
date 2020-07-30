package com.example.singleton;

public class SingleTon3_Lazy_ThreadSafe_Optimize {
    private SingleTon3_Lazy_ThreadSafe_Optimize() {
    }

    private static SingleTon3_Lazy_ThreadSafe_Optimize INSTANCE;

    public static SingleTon3_Lazy_ThreadSafe_Optimize getInstance() {
        if (INSTANCE == null) {
            synchronized (SingleTon3_Lazy_ThreadSafe_Optimize.class) {
                if (INSTANCE == null) {
//                     尝试让线程暂停，使得其它线程有执行权
//                    try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
                    INSTANCE = new SingleTon3_Lazy_ThreadSafe_Optimize();
                    System.out.println(Thread.currentThread().getName() + INSTANCE);
                }
            }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SingleTon3_Lazy_ThreadSafe_Optimize instance1 = SingleTon3_Lazy_ThreadSafe_Optimize.getInstance();
                }
            }).start();
        }
    }
}
