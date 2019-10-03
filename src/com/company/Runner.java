package com.company;

public class Runner extends Thread {

    Thread thread1 = new Thread("Runner1");
    Thread thread2 = new Thread("Runner2");
    Thread thread3 = new Thread("Runner3");
    Thread thread4 = new Thread("Runner4");
    Thread thread5 = new Thread("Runner5");

    public void run() {


        try {

            thread1.start();
            thread1.join();
            System.out.println(thread1.getName() + " берет палочку");
            System.out.println(thread1.getName() + " бежит к " + thread2.getName());
            Thread.sleep(5000);

            thread2.start();
            thread2.join();
            System.out.println(thread2.getName() + " берет палочку");
            System.out.println(thread2.getName() + " бежит к " + thread3.getName());
            Thread.sleep(5000);

            thread3.start();
            thread3.join();
            System.out.println(thread3.getName() + " берет палочку");
            System.out.println(thread3.getName() + " бежит к " + thread4.getName());
            Thread.sleep(5000);

            thread4.start();
            thread4.join();
            System.out.println(thread4.getName() + " берет палочку");
            System.out.println(thread4.getName() + " бежит к " + thread5.getName());
            Thread.sleep(5000);

            thread5.start();
            thread5.join();
            System.out.println(thread5.getName() + " берет палочку");
            System.out.println(thread5.getName() + " бежит к финишу");
            Thread.sleep(5000);

            thread5.run();
            thread5.join();
            System.out.println(thread5.getName() + " бежит к " + thread4.getName());
            Thread.sleep(5000);

            thread4.run();
            thread4.join();
            System.out.println(thread4.getName() + " берет палочку");
            System.out.println(thread4.getName() + " бежит к " + thread3.getName());
            Thread.sleep(5000);

            thread3.run();
            thread3.join();
            System.out.println(thread3.getName() + " берет палочку");
            System.out.println(thread3.getName() + " бежит к " + thread2.getName());
            Thread.sleep(5000);

            thread2.run();
            thread2.join();
            System.out.println(thread2.getName() + " берет палочку");
            System.out.println(thread2.getName() + " бежит к " + thread1.getName());
            Thread.sleep(5000);

            thread1.run();
            thread1.join();
            System.out.println(thread1.getName() + " берет палочку");


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}




