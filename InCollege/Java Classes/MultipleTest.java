// I pasted this code from my intellijIDE so if it shows error here, execute it in intellijIDE


//import statements
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


//this is our testClass
public class MultipleTest {
    //encapsulated variables
    private Multiple multiple;


    //according to the question
    @Before
    public void setUp() {
        this.multiple = new Multiple();
    }
    //test classs for first one
    @Test
    public void testSquareRoot() {
        float result = multiple.SquareRoot(4.0f, 2.0f);
        float expected = 2.0f;
        assertEquals(expected, result, 0.001f);
    }
    //test class for second class
    @Test
    public void testCubeRoot() {
        float result = multiple.CubeRoot(8.0f, 1.0f, 3.0f);
        float expected = 2.0f;
        assertEquals(expected, result, 0.001f);
    }
}
