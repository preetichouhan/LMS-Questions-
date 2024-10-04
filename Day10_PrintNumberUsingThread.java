package com.Day10;

class PrintNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Day10_PrintNumberUsingThread {
    public static void main(String[] args) {
        PrintNumbersThread thread = new PrintNumbersThread();
        thread.start();
    }
}