public class Thread1 implements Runnable {

    FilePlayer filePlayer = new FilePlayer();

    public void run() {
        try {
            playDo(1700);
            playMi(1500);
            playSol(1500);
            playSi(700);
            playDoOctave(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\b\b\b");
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
