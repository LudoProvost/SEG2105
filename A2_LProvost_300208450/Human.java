public class Human extends User {

    private final String name;

    public Human(int id, String name) {
        super(id);
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
