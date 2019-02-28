import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The test class ArrayListPracticeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArrayListPracticeTest
{
    ArrayListPractice ap;
    
    /**
     * Default constructor for test class ArrayListPracticeTest
     */
    public ArrayListPracticeTest()
    {
        ap = new ArrayListPractice();
    }

    /**
     * Testing filterRange
     */
    @Test(timeout=2000)
    public void filterRangeTest()
    {
        for( int testNum = 0; testNum < 10 ; testNum++ )
        {
            ArrayList<Integer> input = new ArrayList<Integer>();
            for( int i = 0; i < 10; i++ )
            {
                input.add( (int)(Math.random() * 10 ) );
            }
            ap.filterRange( input, 4, 6 );
            for( int i = 0; i < input.size(); i++ )
            {
                if( input.get(i) == 4 || input.get(i) == 5 || input.get(i) == 6 )
                {
                    fail("filterRange( " + input + ", 4, 6 ) failed (-30 pts).");
                }
            }
        }
    }
    
    /**
     * Testing interleave
     */
    @Test(timeout=2000)
    public void interleaveTest()
    {
        Integer[] arr = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> a1 = new ArrayList<Integer>( Arrays.asList( arr ) );
        Integer[] arr2 = { 6, 7, 8, 9, 10 };
        ArrayList<Integer> a2 = new ArrayList<Integer>( Arrays.asList( arr2 ) );
        Integer[] arr3 = { 1, 6, 2, 7, 3, 8, 4, 9, 5, 10 };
        ArrayList<Integer> o1 = new ArrayList<Integer>( Arrays.asList( arr3 ) );
        ap.interleave( a1, a2 );
        assertEquals( "interleave failed with equal length arrays (-10 pts)", o1, a1 );
        
        Integer[] arr4 = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> a3 = new ArrayList<Integer>( Arrays.asList( arr4 ) );
        Integer[] arr5 = { 6, 7, 8, 9, 10, 11, 12, 13 };
        ArrayList<Integer> a4 = new ArrayList<Integer>( Arrays.asList( arr5 ) );
        Integer[] arr6 = { 1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12, 13 };
        ArrayList<Integer> o2 = new ArrayList<Integer>( Arrays.asList( arr6 ) );
        ap.interleave( a3, a4 );
        assertEquals( "interleave failed with list1 shorter than list2 (-10 pts)", o2, a3 );
        
        Integer[] arr7 = { 6, 7, 8, 9, 10, 11, 12, 13 };
        ArrayList<Integer> a5 = new ArrayList<Integer>( Arrays.asList( arr4 ) );
        Integer[] arr8 = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> a6 = new ArrayList<Integer>( Arrays.asList( arr5 ) );
        Integer[] arr9 = { 6, 1, 7, 2, 8, 3, 9, 4, 10, 5, 11, 12, 13 };
        ArrayList<Integer> o3 = new ArrayList<Integer>( Arrays.asList( arr6 ) );
        ap.interleave( a5, a6 );
        assertEquals( "interleave failed with list1 longer than list2 (-10 pts)", o3, a5 );
    }
    
    /**
     * Testing minToFront
     */
    @Test(timeout=2000)
    public void minToFrontTest()
    {
        Integer[] arr = { 8, 4, 5, 1, 6, 9, 3 };
        ArrayList<Integer> a1 = new ArrayList<Integer>( Arrays.asList( arr ) );
        Integer[] arr2 = { 1, 8, 4, 5, 6, 9, 3 };
        ArrayList<Integer> o1 = new ArrayList<Integer>( Arrays.asList( arr2 ) );
        
        Integer[] arr3 = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> a2 = new ArrayList<Integer>( Arrays.asList( arr ) );
        Integer[] arr4 = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> o2 = new ArrayList<Integer>( Arrays.asList( arr2 ) );
        
        Integer[] arr5 = { 5, 4, 3, 2, 1 };
        ArrayList<Integer> a3 = new ArrayList<Integer>( Arrays.asList( arr ) );
        Integer[] arr6 = { 1, 5, 4, 3, 2 };
        ArrayList<Integer> o3 = new ArrayList<Integer>( Arrays.asList( arr2 ) );
        
        ap.minToFront( a1 );
        ap.minToFront( a2 );
        ap.minToFront( a3 );
        
        assertEquals("minToFront failed with a random array (-10 pts)", o1, a1 );
        assertEquals("minToFront failed with an increasing array (-10 pts)", o2, a2 );
        assertEquals("minToFront failed with a decreasing array (-10 pts)", o3, a3 );
    }
}
