package edu.miu.cs.cs425.arrayutils.arrayreversor;

import edu.miu.cs.cs425.arrayutils.arrayreversor.service.ArrayFlattenerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(value = MockitoJUnitRunner.class)
public class ArrayReversorTestNull {
    private ArrayReversor arrayReversor;

    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

//    @Mock
//    private ArrayFlattenerService arrayFlattenerService;

    @Before
    public void setUp() throws Exception {
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @After
    public void tearDown() throws Exception {
        this.arrayReversor = null;
    }

    @Test
    public void testReverseArray() {
        Integer[][] a_in = {{1,3}, {0}, {4,5,9}};
        when(arrayFlattenerService.flattenArray(a_in)).thenReturn(new Integer[]{1,3,0,4,5,9});
        Integer[] actual_a_out = arrayReversor.reverseArray(a_in);
        Integer[] expected_a_out = new Integer[]{9,5,4,0,3,1};
        assertThat("Expected array is NOT equal to actual", expected_a_out, equalTo(actual_a_out));
        verify(arrayFlattenerService).flattenArray(a_in);
    }

    @Test
    public void testReverseArray2() {
        Integer[][] a_in = null;
        when(arrayFlattenerService.flattenArray(a_in)).thenReturn(null);
        Integer[] actual_a_out = arrayReversor.reverseArray(a_in);
        Integer[] expected_a_out = null;
        assertThat("Expected array is NOT equal to actual", expected_a_out, equalTo(actual_a_out));
        verify(arrayFlattenerService).flattenArray(a_in);
    }
}