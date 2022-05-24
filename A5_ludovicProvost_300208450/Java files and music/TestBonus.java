public class TestBonus {

    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = new BonusThread1();
        Thread t1 = new Thread(r1);

        Runnable r2 = new BonusThread2();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        t2.join();
    }
}
