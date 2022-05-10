package edu.miu.cs.cs425.arrayutils.arrayflattener;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayFlattenerTestNull {
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
        Integer[][] a_in = null;
        Integer[] actual_a_out = arrayFlattener.flattenArray(a_in);
        Integer[] expected_a_out = null;
        assertThat("Actual array is NOT equal to expected", actual_a_out, equalTo(expected_a_out));
    }

    @Test
    public void flattenArray2() {
        int[][] a_in = null;
        int[] actual_a_out = arrayFlattener.flattenArray2(a_in);
        int[] expected_a_out = null;
        assertThat("Actual array is NOT equal to expected", actual_a_out, equalTo(expected_a_out));
    }

    @Test
    public void flattenArray3() {
        Integer[][] a_in = null;
        Integer[] actual_a_out = arrayFlattener.flattenArray3(a_in);
        Integer[] expected_a_out = null;
        assertThat("Actual array is NOT equal to expected", actual_a_out, equalTo(expected_a_out));
    }
}