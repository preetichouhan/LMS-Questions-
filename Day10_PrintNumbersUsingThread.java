package com.Day10;

class PrintNumbersThread extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
        }
    }
}
public class Day10_PrintNumbersUsingThread {
    public static void main(String[] args) {
        PrintNumbersThread thread = new PrintNumbersThread();
        thread.start();
    }
}