package edu.miu.cs.cs425.arrayutils.arrayflattener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {

    public Integer[] flattenArray(Integer[][] a_in) {
        if(a_in == null)
            return null;
        List<Integer> list = new ArrayList<>();
        for(Integer[] a : a_in) {
            for(int i : a) {
                list.add(i);
            }
        }
        return (Integer[])list.toArray(new Integer[list.size()]);
    }

    public int[] flattenArray2(int[][] a_in) {
        if(a_in == null)
            return null;
        return Arrays.stream(a_in)
                .flatMapToInt(arr -> Arrays.stream(arr))
                .toArray();
    }

    public Integer[] flattenArray3(Integer[][] a_in) {
        if(a_in == null)
            return null;
        return Arrays.stream(a_in)
                .flatMap(arr -> Arrays.stream(arr))
                .toArray(Integer[]::new);
    }

}
