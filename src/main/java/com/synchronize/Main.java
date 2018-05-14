package com.synchronize;

public class Main {
    static StringBuffer sb1 = new StringBuffer();
    static StringBuffer sb2 = new StringBuffer();


    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread01());
        Thread thread2= new Thread(new Thread02());
        thread1.start();
        thread2.start();
    }
}
