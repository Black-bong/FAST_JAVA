package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminateThread extends Thread {

    private boolean flag = false;
    int i;

    public void run() {
        while (!flag) {

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " end");
    }

    public TerminateThread(String name) {
        super(name);
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        TerminateThread thA = new TerminateThread("A");
        TerminateThread thB = new TerminateThread("B");

        thA.start();
        thB.start();

        int in;
        while (true) {
            try {
                in = bf.read();
                if (in == 'A') {
                    thA.setFlag(true);
                } else if (in == 'B') {
                    thB.setFlag(true);
                } else if (in == 'M') {
                    thA.setFlag(true);
                    thB.setFlag(true);
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main end");
    }
}
