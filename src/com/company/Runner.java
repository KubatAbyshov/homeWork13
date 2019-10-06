package com.company;

public class Runner extends Thread {

    int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public Runner(String name) {
        this.setName(name);
    }

    public void run() {

        try {
            System.out.println(getName() + " берет палочку ");
            if (number -1 == 5) {
                System.out.println(getName() + " бежит к финишу");
                sleep(5000);

            } else if (number == 1) {
                System.out.println(getName() + " бежит к runner" + number);
                sleep(5000);
                System.out.println("runner1 берет палочку ");
            } else {
                System.out.println(getName() + " бежит к runner" + number);
                sleep(5000);
            }
        } catch (Exception e) {

        }
    }


}









