public class Game {

    private final boolean type;
    private final int gameID;
    private User player1;
    private User player2;
    private Board board1;
    private Board board2;

    public Game(boolean type, int gameID) {
        this.type = type;
        this.gameID = gameID;
        if (type) {
            player1 = addUser(1,"name1");
            player2 = addUser(2, "name2");
        } else {
            player1 = addUser(1,"name1");
            player2 = addUser(2);
        }
        board1 = addBoard(player1);
        board2 = addBoard(player2);

        if (board1.isWon() || board2.isWon()) {
            removeBoards();
            removePlayers();
        }
    }

    public Computer addUser(int id) {
        return new Computer(id);
    }

    public Human addUser(int id, String name) {
        return new Human(id, name);
    }

    public Board addBoard(User player) {
        return new Board(player);
    }

    public void removePlayers() {
        player1 = null;
        player2 = null;
    }

    public void removeBoards() {
        board1 = null;
        board2 = null;
    }

}

