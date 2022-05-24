public class User {

    public final int id;
    private int score;

    public User(int id) {
        this.id = id;
        this.score = 0;
    }

    public void printId() {
        System.out.println(id);
    }

    public void printScore() {
        System.out.println(score);
    }

    public void addScore() {
        this.score++;
    }

}
