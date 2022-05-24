/** A class representing a rover.
 * @since 1.0
 * @version 3.0
 * @author Ludovic Provost
 */
public class Rover {

    /** Right pedal for rover.
     * Creates a right pedal instance to
     * be used when right pedal is used.
     */
    public Pedal rightPedal = new Pedal("R");

    /** Left pedal for rover.
     * Creates a left pedal instance to
     * be used when left pedal is used.
     */
    public Pedal leftPedal = new Pedal("L");

    /** State of rover.
     */
    int state;
    //3   constant forward speed
    //2   accelerate forward
    //1   deaccelerate forward
    //0   rest
    //-1  deaccelerate backward
    //-2  accelerate backward
    //-3  constant backward speed

    /** Creates rover and sets state to rest.
     */
    public Rover(int state) {
        this.state = state;
    }

    /** Sets state of rover to new specified state.
     * @param newState new state of rover.
     */
    public void setState(int newState) {
        if (-3 > newState || newState > 3) {
            throw new IllegalArgumentException("New state must be between -3 and 3.");
        }
        state = newState;
    }

    /** Returns state of rover as a string.
     * @return state of rover.
     */
    public String printState() {
        return switch (state) {
            case (0) -> "rest";
            case (1) -> "deaccelerate forward";
            case (2) -> "accelerate forward";
            case (3) -> "constant forward speed";
            case (-1) -> "deaccelerate backward";
            case (-2) -> "accelerate backward";
            case (-3) -> "constant backward speed";
            default -> "no current states";
        };
    }
}
