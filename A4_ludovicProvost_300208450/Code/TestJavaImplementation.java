import java.util.Scanner;

/** A class to test the implementation of rover.
 * @since 1.0
 * @version 1.0
 * @author Ludovic Provost
 * @deprecated
 */
public class TestJavaImplementation {

    /** Main to run the test.
     * @param args IDE requirement.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rover rover = new Rover(0);
        String pOrH;
        int pressesOrSeconds = 0;
        String lOrR;

        while (rover.state != 3 || rover.state != -3) {
            System.out.println("Do you want to press or hold a pedal? (P/H) : ");
            pOrH = s.next();
            System.out.println("Which pedal? (L/R) : ");
            lOrR = s.next();

            if (pOrH.equals("P")) {
                 System.out.println("How many times do you want to press the pedal? : ");
                pressesOrSeconds = s.nextInt();
            } else if (pOrH.equals("H")) {
                System.out.println("How many seconds do you want to hold it for? : ");
                pressesOrSeconds = s.nextInt();
            }

            if (lOrR.equals("L")) {
                if (pOrH.equals("P")) {
                    rover.setState(rover.leftPedal.press(pressesOrSeconds, rover.state));
                } else if (pOrH.equals("H")) {
                    rover.setState(rover.leftPedal.hold(pressesOrSeconds, rover.state));
                }
            } else if (lOrR.equals("R")) {
                if (pOrH.equals("P")) {
                    rover.setState(rover.rightPedal.press(pressesOrSeconds, rover.state));
                } else if (pOrH.equals("H")) {
                    rover.setState(rover.rightPedal.hold(pressesOrSeconds, rover.state));
                }
            }
            System.out.println("The current state of the rover is : " + rover.printState());
        }
    }
}
