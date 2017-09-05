package com.ironyard;


public class RunnableDemo {
    public static void main(String[] args) {

        // !! - Write an anonymous Runnable class here
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous run");
            }
        };
        runnable.run();

        //It can just print out "Anonymous run" or similar


        // !! - Write a lambda function here
        //It can also print out something like "Lambda run"
        Runnable anonRun = () -> System.out.println("hi");

        anonRun.run();
    }
}
