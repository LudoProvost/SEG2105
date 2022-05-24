import org.junit.Test;
import static org.junit.Assert.*;

public class PedalTest {

    // Constructors

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullStringThrowsException() {
        new Pedal(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidStringThrowsException() {
        new Pedal("bad");
    }

    @Test
    public void testConstructorValidString() {
        Pedal leftPedal = new Pedal("L");
        Pedal rightPedal = new Pedal("R");
        assertEquals(leftPedal.leftOrRight, "L");
        assertEquals(rightPedal.leftOrRight, "R");
    }

    // Press

    @Test(expected = IllegalArgumentException.class)
    public void testLeftPressThrice() {
        Rover rover = new Rover(0);
        rover.leftPedal.press(3, rover.state);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLeftPressNone() {
        Rover rover = new Rover(0);
        rover.leftPedal.press(0, rover.state);
    }

    @Test
    public void testLeftPressOnceTransition() {
        Rover rover = new Rover(0);
        rover.leftPedal.press(1, rover.state);
    }

    // Hold

    @Test(expected = IllegalArgumentException.class)
    public void testLeftHoldNotFive() {
        Rover rover = new Rover(0);
        rover.leftPedal.hold(10, rover.state);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRightHoldNoTransition() {
        Rover rover = new Rover(0);
        rover.rightPedal.hold(5, rover.state);
    }

    @Test
    public void testLeftHoldTransition() {
        Rover rover = new Rover(0);
        rover.leftPedal.hold(5, rover.state);
    }
}
