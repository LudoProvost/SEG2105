public class BonusThread1 implements Runnable {

    FilePlayer filePlayer = new FilePlayer();

    public void run() {
        try {
            playDo(500);
            playDo(500);
            playSol(500);
            playSol(1500);
            playSol(1700);
            playMi(500);
            playMi(1500);
            playDo(500);
            //7000 ms

            System.out.print("\b\b\b\n");

            playSol(500);
            playSol(1500);
            playMi(500);
            playMi(1000);
            playSol(500);
            playSol(1500);
            playMi(500);
            playMi(1000);

            System.out.print("\b\b\b\n");

            playDo(500);
            playDo(500);
            playSol(500);
            playSol(1200);
            playSol(1700);
            playMi(500);
            playMi(1500);
            playDo(500);

            System.out.print("\b\b\b");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void playDo(int time) throws InterruptedException {
        System.out.print("do  -  ");
        filePlayer.play("Sounds\\do.wav");
        Thread.sleep(time);
    }

    public void playMi(int time) throws InterruptedException {
        System.out.print("mi  -  ");
        filePlayer.play("Sounds\\mi.wav");
        Thread.sleep(time);
    }

    public void playSol(int time) throws InterruptedException {
        System.out.print("sol  -  ");
        filePlayer.play("Sounds\\sol.wav");
        Thread.sleep(time);
    }

    public void playSi(int time) throws InterruptedException {
        System.out.print("si  -  ");
        filePlayer.play("Sounds\\si.wav");
        Thread.sleep(time);
    }

    public void playDoOctave(int time) throws InterruptedException {
        System.out.print("do-octave (t1)  -  ");
        filePlayer.play("Sounds\\do-octave.wav");
        Thread.sleep(time);
    }
}
