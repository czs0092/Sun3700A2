import org.junit.*;
import static org.junit.Assert.assrtEquals;

public class FinderTest {
    @Before public void setUp() {

    }

    @Test public void findMaxTest(){
        Finder max = new Finder();
       int[] array = {1,3,5,7,8,10};
       assertEquals(expected: 10, Finder.finderMax(array));
    }

    @Test public void findMinTest(){
        Finder.findMin max = new Finder.findMin();
        int[] array = {10,3,5,7,2,14};
        assertEquals(expected: 2, Finder.finderMin(array));
    }
}
