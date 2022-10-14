import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input = { 3 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{ 3 }, input);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input = { };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{ }, input);
  }
  
  @Test
  public void testReverseInPlace3() {
    int[] input = {1,2,3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{3,2,1}, input);
    //System.out.println(input); how to see actual result?
  }

  @Test
  public void testReverseInPlace4() {
    int[] input = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{5,4,3,2,1}, input);
  }

  @Test
  public void testReversed() {
    int[] input = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input));
  }

  @Test
  public void testReversed2() {
    int[] input = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReversed3() {
    int[] input = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] empty = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(empty), 0.001);

    double[] single = {1.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(single), 0.001);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = {1.0, 2.0, 3.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0.001);

    double[] input2 = {3.0, 2.0, 1.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input2), 0.001);

    double[] input3 = {1, 2, 3};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input3), 0.001);

    double[] input4 = {1.5, 2.25, 3.75};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input4), 0.001);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input1 = {1.0, 1.0, 2.0, 3.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0.001);

    double[] input2 = {1.0, 1.0, 1.0, 1.0};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input2), 0.001);

    double[] input3 = {1.0, 1.0, 1.0, 5.0};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input3), 0.001);
  }

}
