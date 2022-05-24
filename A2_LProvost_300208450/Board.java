public class Board {

    private Ship[] battleships;
    private final int NUMBER_OF_SHIPS = 6;
    private int[][] board;
    private final User player;
    public final int BOARD_HEIGHT = 10;
    public final int BOARD_LENGTH = 10;

    public Board(User player) {
        int[][] board = new int[BOARD_HEIGHT][BOARD_LENGTH];
        this.player = player;
        this.battleships = new Ship[NUMBER_OF_SHIPS];
        for (int i = 0; i < NUMBER_OF_SHIPS; i++) {
            battleships[i] = addShip();
        }
    }

    public void printBoard() {
        System.out.println("method: print the board");
    }

    public void placePin(Coordinate coordinate) {
        System.out.println("method: place a pin");
        Pin pin = new Pin(coordinate);
        //isHit is called
        if (isHit(pin.getPinLocation())) {
            player.addScore();
        }
    }

    public Ship addShip() {
        System.out.println("method: addShip , prompts user " + player.id + " for coordinates, size and orientation");
        Coordinate coordinate = new Coordinate(1,2);
        int size = 1;
        String orientation = "up";
        return new Ship(coordinate,size,orientation);
    }

    public void clearBoard() {
        //removes ships and pins
        System.out.println("method: clear the board");
    }

    private boolean isHit(Coordinate pinCoordinate) {
        System.out.println("method: is hit");
        //check if pinCoordinate matches a ship coordinate
        return true;
    }

    public boolean isWon() {
        System.out.println("method: is won");
        for (Ship battleship : battleships) {
            if (!battleship.isSunk()) {
                return false;
            }
        }
        return true;
    }

}
