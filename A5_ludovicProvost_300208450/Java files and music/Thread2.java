public class Thread2 implements Runnable{

    FilePlayer filePlayer = new FilePlayer();

    public void run() {
        try {
            Thread.sleep(1000);
            playRe(1500);
            playFa(1500);
            playLa(1500);
            playDoOctave(1500);
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
