package com.example.singleton;


import java.sql.SQLOutput;

public class SingleTon2_Lazy_ThreadSafe {
    private static SingleTon2_Lazy_ThreadSafe instance;
    public static SingleTon2_Lazy_ThreadSafe getInstance() {
        synchronized (SingleTon2_Lazy_ThreadSafe.class) {
            if (instance == null) {
                try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
                instance = new SingleTon2_Lazy_ThreadSafe();
                System.out.println(instance);
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SingleTon2_Lazy_ThreadSafe.getInstance();
                }
            }).start();

        }
    }
}
