package com.company;

public class Runner extends Thread {


    public Runner(String name) {
        this.setName(name);
    }

    public void run() {

        try {

            for (int i = 2; i < 6; i++) {

                System.out.println(getName() + (--i) + " берет палочку ");
                System.out.println(getName() + i + " бежит к " + getName() + (++i));

                if (i == 5) {
                    System.out.println(getName() + i + " бежит к финалу");
                }
                sleep(5000);

            }
            for (int j = 4; j > 0; j--) {

                System.out.println(getName() + (++j) + " берет палочку ");
                System.out.println(getName() + j + " бежит к " + getName() + (--j));

                if (j == 1) {
                    System.out.println(getName() + j + " берет палочку ");
                }
                sleep(5000);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}






