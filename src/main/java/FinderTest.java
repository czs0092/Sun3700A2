public class FinderTest {
    @Before public void setUp() {

    }

    @Test public void findMaxTest{
        Finder.findMax max = new Finder.findMax();
       int[] array = {1,3,5,7,8,10};
       assertEquals(10, Finder.finderMax(array));
    }

    @Test public void findMinTest{
        Finder.findMin max = new Finder.findMin();
        int[] array = {10,3,5,7,2,14};
        assertEquals(2, Finder.finderMin(array));
    }
}
