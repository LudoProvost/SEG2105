public class Rover {

    Pedal rightPedal = new Pedal("R");
    Pedal leftPedal = new Pedal("L");
    int state;
    //3   constant forward speed
    //2   accelerate forward
    //1   deaccelerate forward
    //0   rest
    //-1  deaccelerate backward
    //-2  accelerate backward
    //-3  constant backward speed

    public Rover() {
        state = 0;
    }

    public int getState() {
        return state;
    }

    public void SetState(int newState) {
        state = newState;
    }

    public String PrintState() {
        switch(state) {
            case(0):
                return "rest";
            case(1):
                return "deaccelerate forward";
            case(2):
                return "accelerate forward";
            case(3):
                return "constant forward speed";
            case(-1):
                return "deaccelerate backward";
            case(-2):
                return "accelerate backward";
            case(-3):
                return "constant backward speed";
            default:
                return "no current states";
        }
    }
}
