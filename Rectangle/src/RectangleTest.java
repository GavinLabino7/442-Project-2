import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The unit test Class for Rectangle.
 */
public class RectangleTest {

    /** Declaring necessary test objects for {@link Rectangle} */
    Rectangle rect1, rect2;
    Point point1, point2;

    /**
     * Initializes the necessary test objects for the test cases to use.
     *
     * @throws Exception the exception
     */
    @BeforeEach
    public void setUp() throws Exception {
        rect1 = new Rectangle(new Point(2.0, 2.0), new Point(4.0, 7.0));
        rect2 = new Rectangle(new Point(2.0, 6.0), new Point(4.0, 3.0));
        point1 = new Point(1.00, 5.00);
        point2 = new Point(0.00, -7.00);
    }

    /**
     * Cleans up test objects after a test case is executed.
     */
    @AfterEach
    public void tearDown() {
        rect1 = null;
        rect2 = null;
    }

    /**
     * Test for the getArea() method of the {@link Rectangle} class.
     */
    @Test
    public void testGetArea() {
        assertEquals(10.0, rect1.getArea(), 0.001);
        assertEquals(6.0, rect2.getArea(), 0.001);
    }

    /**
     * Test for the getDiagonal() method of the {@link Rectangle} class.
     */
    @Test
    public void testGetDiagonal() {
        assertEquals(5.3852, rect1.getDiagonal(), 0.0001);
        assertEquals(3.6056, rect2.getDiagonal(), 0.0001);
    }

    @Test 
    public void testPoint(){
        assertEquals(1, point1.x, 0.001);
        assertEquals(5, point1.y, 0.001);
        assertEquals(0, point2.x, 0.001);
        assertEquals(-7, point2.y, 0.001);
    }
}
