package com.willvi.thread;

/**
 * @ClassName : ABC
 * @Description : TODO
 * @Author : WillVi
 * @Date : 2019/3/22 10:42
 * @Version : 1.0
 */
public class ABC {

    public static void main(String[] args) {
        Thread threads[] = new Thread[3];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ThreadPrint((char) ('A' + i) , 10*threads.length-1);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}

class ThreadPrint extends Thread {
    private final char currentName;
    private final int printNum;

    public ThreadPrint(char currentName, int printNum) {
        this.currentName = currentName;
        this.printNum = printNum;
    }

    static volatile int n = 3;
    @Override
    public void run() {
        while (n<printNum) {

            if(currentName ==  (char)('A' + n%3)) {
                System.out.println(currentName);
                n++;
            }
            System.out.println(n);
        }
    }
}