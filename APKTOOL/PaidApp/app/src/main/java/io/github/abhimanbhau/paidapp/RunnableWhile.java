package io.github.abhimanbhau.paidapp;

/**
 * Created by akolte on 1/23/18.
 */

public class RunnableWhile implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
