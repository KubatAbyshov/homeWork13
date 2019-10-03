package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Старт эстафеты");

        Runner runner = new Runner();
        runner.start();
        runner.join();


    }
}


