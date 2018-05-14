package com.synchronize;

public class Thread02 implements Runnable{
    @Override
    public void run() {
        synchronized (Main.sb2){
            Main.sb2.append("A");
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Main.sb1){
                Main.sb1.append("B");
                System.out.println(Main.sb1);
                System.out.println(Main.sb2);
            }
        }
    }

}
