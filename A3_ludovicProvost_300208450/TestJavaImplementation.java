import java.util.Scanner;

public class TestJavaImplementation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rover rover = new Rover();
        String pOrH;
        int pressesOrSeconds = 0;
        String lOrR;

        while (rover.getState() != 3 || rover.getState() != -3) {
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
                    rover.SetState(rover.leftPedal.Press(pressesOrSeconds, rover.getState()));
                } else if (pOrH.equals("H")) {
                    rover.SetState(rover.leftPedal.Hold(pressesOrSeconds, rover.getState()));
                }
            } else if (lOrR.equals("R")) {
                if (pOrH.equals("P")) {
                    rover.SetState(rover.rightPedal.Press(pressesOrSeconds, rover.getState()));
                } else if (pOrH.equals("H")) {
                    rover.SetState(rover.rightPedal.Hold(pressesOrSeconds, rover.getState()));
                }
            }
            System.out.println("The current state of the rover is : " + rover.PrintState());
        }
    }
}
