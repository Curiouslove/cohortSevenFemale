import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayAndIntegerTest {
//    @Test
////    public void testThatArrayAndIntegerCanTakeTwoArguments(){
////        ArrayList<Integer> integers = new ArrayList<>();
////         integers.add(1);
////         integers.add(2);
////         integers.add(3);
////         ArrayList<Integer> result = ArrayAndInteger.arrayAndIntegerMethod(3,integers);
////        assertArrayEquals( [0, 1], result);
////    }
////

    @Test
    public void testTwoSum(){
        assertArrayEquals(new int[]{0,1}, ArrayAndInteger.twoSums(new int[]{1,2,3,4,5}, 3));
        assertArrayEquals(new int[]{1,3}, ArrayAndInteger.twoSums(new int[]{3,2,5,4}, 6));
    }

    @Test
    public void testTwoSumsWithMap(){
        assertArrayEquals(new int[]{0,1}, ArrayAndInteger.twoSumsWithMap(new int[]{1,2,3,4,5}, 3));
        assertArrayEquals(new int[]{1,3}, ArrayAndInteger.twoSumsWithMap(new int[]{3,2,5,4}, 6));
    }
}