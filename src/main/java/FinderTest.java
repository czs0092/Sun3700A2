import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FinderTest {
    @Before public void setUp() {

    }

    @Test public void findMaxTest(){
        Finder max = new Finder();
        int[] array = {1,3,5,7,8,10};
        assertEquals(10, Finder.findMax(array));
    }

    @Test public void findMinTest(){
        Finder min = new Finder();
        int[] array = {10,3,5,7,2,14};
        assertEquals(2, Finder.findMin(array));
    }
}
