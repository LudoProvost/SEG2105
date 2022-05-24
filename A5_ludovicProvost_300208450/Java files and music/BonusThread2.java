public class BonusThread2 implements Runnable {

    FilePlayer filePlayer = new FilePlayer();

    public void run() {
        try {
            Thread.sleep(2000);
            playLa(500);
            playLa(1500);
            playFa(500);
            playFa(1500);
            playRe(500);
            playRe(0);

            Thread.sleep(1500);
            playFa(500);
            playFa(1500);
            playRe(1500);
            playFa(500);
            playFa(1500);
            playRe(0);

            Thread.sleep(2500);
            playLa(500);
            playLa(1500);
            playFa(500);
            playFa(1500);
            playRe(500);
            playRe(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void playRe(int time) throws InterruptedException {
        System.out.print("re  -  ");
        filePlayer.play("Sounds\\re.wav");
        Thread.sleep(time);
    }

    public void playFa(int time) throws InterruptedException {
        System.out.print("fa  -  ");
        filePlayer.play("Sounds\\fa.wav");
        Thread.sleep(time);
    }

    public void playLa(int time) throws InterruptedException {
        System.out.print("la  -  ");
        filePlayer.play("Sounds\\la.wav");
        Thread.sleep(time);
    }

    public void playDoOctave(int time) throws InterruptedException {
        System.out.print("do-octave (t2)  -  ");
        filePlayer.play("Sounds\\do-octave.wav");
        Thread.sleep(time);
    }
}
