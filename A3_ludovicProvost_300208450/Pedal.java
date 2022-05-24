public class Pedal {

    String leftOrRight;
    public Pedal(String leftOrRight) {
        this.leftOrRight = leftOrRight;
    }

    public int Press(int numberOfPresses, int state) {

        if (numberOfPresses == 1 && state == 0 && leftOrRight.equals("L")) {
            return 2;
        } else if (numberOfPresses == 2 && leftOrRight.equals("R")) {
            if (state == 2) {
                return 1;
            } else if (state == -2) {
                return -1;
            }
        }
        System.out.print("Your number of presses does nothing. ");
        return state;
    }

    public int Hold(int numberOfSeconds, int state) {
        if (numberOfSeconds == 5) {
            if (state == 0 && leftOrRight.equals("L")) {
              return -2;
            } else if ((state == -1 || state == -2) && leftOrRight.equals("R")) {
                return -3;
            } else if ((state == 1 || state == 2) && leftOrRight.equals("R")) {
                return 3;
            }
        }
        System.out.print("Your number of seconds does nothing. ");
        return state;
    }

}
