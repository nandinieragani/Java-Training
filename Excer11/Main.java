package com.hcltech.Excer11;
class DemoThread implements Runnable {
    public DemoThread() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Running child thread in loop: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new DemoThread1();
        new DemoThread1();
        new DemoThread1();
    }
}
