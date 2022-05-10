package edu.miu.cs.cs425.arrayutils.arrayreversor;

import edu.miu.cs.cs425.arrayutils.arrayreversor.service.ArrayFlattenerService;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public Integer[] reverseArray(Integer[][] a_in) {
        Integer[] a_flat = arrayFlattenerService.flattenArray(a_in);
        //        Integer[] a_flat = new Integer[]{1,3,0,4,5,9};
        if(a_flat == null)
            return null;
        Integer[] a_out = new Integer[a_flat.length];
        int j = 0;
        for(int i = a_out.length - 1; i >= 0; i--) {
            a_out[j] = a_flat[i];
            j++;
        }
        return a_out;
    }

    public Integer[] reverseArray2(Integer[][] a_in) {
        Integer[] a_flat = arrayFlattenerService.flattenArray(a_in);
//        Integer[] a_flat = new Integer[]{1,3,0,4,5,9};
        if(a_flat == null)
            return null;
        int i = 0;
        int j = a_flat.length - 1;
        for(int k = 0; k < j; k++) {
//        while(i < j) {
            int temp = a_flat[i];
            a_flat[i] = a_flat[j];
            a_flat[j] = temp;
            i++;
            --j;
        }
        return a_flat;
    }

}
