import org.junit.Test;
import static org.junit.Assert.*;

public class RoverTest {

    // Constructor

    @Test
    public void testConstructor() {
        Rover rover = new Rover(0);
        assertEquals(rover.state,0);
    }

    @Test
    public void testConstructorPedals() {
        Rover rover = new Rover(0);
        assertEquals(rover.leftPedal.leftOrRight, "L");
        assertEquals(rover.rightPedal.leftOrRight, "R");
    }

    @Test
    public void testConstructorRoverState() {
        Rover rover = new Rover(0);
        assertEquals(rover.state,0);
    }

    // setState

    @Test(expected = IllegalArgumentException.class)
    public void testSetStateLowerBound() {
        Rover rover = new Rover(0);
        rover.setState(-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStateUpperBound() {
        Rover rover = new Rover(0);
        rover.setState(4);
    }

    @Test
    public void testSetStateCFS() {
        Rover rover = new Rover(0);
        rover.setState(3);
    }

    // printState

    @Test
    public void testPrintStateCBS() {
        Rover rover = new Rover(-3);
        assertEquals(rover.printState(), "constant backward speed");

    }

    @Test
    public void testPrintStateCFS() {
        Rover rover = new Rover(3);
        assertEquals(rover.printState(), "constant forward speed");
    }

    @Test
    public void testPrintStateDefault() {
        Rover rover = new Rover(5);
        assertEquals(rover.printState(),"no current states");

    }

}
