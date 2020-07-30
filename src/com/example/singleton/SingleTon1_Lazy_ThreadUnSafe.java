package com.example.singleton;

public class SingleTon1_Lazy_ThreadUnSafe {
    private SingleTon1_Lazy_ThreadUnSafe() {
    }

    private static SingleTon1_Lazy_ThreadUnSafe instance;

    private static SingleTon1_Lazy_ThreadUnSafe getInstance() {
        if (instance == null) {
//            尝试让线程暂停，使得其它线程有执行权
//            try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
            instance = new SingleTon1_Lazy_ThreadUnSafe();
            System.out.println(instance);
        }
        return instance;
    }


    public static void main(String[] args) {
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SingleTon1_Lazy_ThreadUnSafe singleTon1_lazy_threadUnSafe = SingleTon1_Lazy_ThreadUnSafe.getInstance();
                }
            }).start();
        }
    }

}
