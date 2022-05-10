package edu.miu.cs.cs425.arrayutils.arrayflattener;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTest2DNonNull {
    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() throws Exception {
        this.arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception {
        this.arrayFlattener = null;
    }

    @Test
    public void flattenArray() {
        Integer[][] a_in = new Integer[][]{{1,3}, {0}, {4,5,9}};
        Integer[] expected_a_out = new Integer[]{1,3,0,4,5,9};
        Integer[] actual_a_out = arrayFlattener.flattenArray(a_in);
        assertArrayEquals(expected_a_out, actual_a_out);
    }

    @Test
    public void flattenArray2() {
        int[][] a_in = new int[][]{{1,3}, {0}, {4,5,9}};
        int[] expected_a_out = new int[]{1,3,0,4,5,9};
        int[] actual_a_out = arrayFlattener.flattenArray2(a_in);
        assertArrayEquals(expected_a_out, actual_a_out);
    }

    @Test
    public void flattenArray3() {
        Integer[][] a_in = new Integer[][]{{1,3}, {0}, {4,5,9}};
        Integer[] expected_a_out = new Integer[]{1,3,0,4,5,9};
        Integer[] actual_a_out = arrayFlattener.flattenArray3(a_in);
        assertArrayEquals(expected_a_out, actual_a_out);
    }
}