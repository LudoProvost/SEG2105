public class Ship {

    private final int size;
    private final String shipOrientation;
    private boolean isSunk;
    private Coordinate[] shipLocation;

    public Ship(Coordinate basePoint, int size, String shipOrientation) {
        this.isSunk = false;
        this.size = size;
        this.shipOrientation = shipOrientation;
        Coordinate[] shipLocation = new Coordinate[size];
        for (int i = 0; i < size; i++) {
            if (shipOrientation.equals("up")) {
                shipLocation[i] = new Coordinate(basePoint.getX(), basePoint.getY() + i);
            } else if (shipOrientation.equals("down")) {
                shipLocation[i] = new Coordinate(basePoint.getX(), basePoint.getY() - i);
            } else if (shipOrientation.equals("left")) {
                shipLocation[i] = new Coordinate(basePoint.getX() - i, basePoint.getY());
            } else if (shipOrientation.equals("right")) {
                shipLocation[i] = new Coordinate(basePoint.getX() + i, basePoint.getY());
            } else {
                System.out.println("the ship's orientation does not work");
            }
        }
    }

    public Coordinate[] getShipLocation() {
        return shipLocation;
    }

    public int getSize() {
        return size;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setIsSunk() {
        isSunk = true;
    }
}
