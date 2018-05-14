package com.synchronize;

public class Thread01 implements Runnable {


    @Override
    public void run() {
     synchronized (Main.sb1){
         Main.sb1.append("C");
         try {
             Thread.currentThread().sleep(10);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         synchronized (Main.sb2){
             Main.sb2.append("D");
             System.out.println(Main.sb1);
             System.out.println(Main.sb2);
         }
     }
    }
}
