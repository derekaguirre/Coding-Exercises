package Completed.Design;
import java.util.concurrent.Semaphore;

//Submission: https://leetcode.com/problems/print-in-order/submissions/1451098605

class PrintInOrder {
    private Semaphore sema2;
    private Semaphore sema3;

    public PrintInOrder() {
        sema2 = new Semaphore(0);
        sema3 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        sema2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        sema2.acquire();
        printSecond.run();
        sema3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        sema3.acquire();
        printThird.run();
    }
}