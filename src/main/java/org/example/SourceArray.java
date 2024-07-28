package org.example;

import java.util.Random;

public class SourceArray {

    public int [] singleDimensionalArray(int [] singleDim,int bound){

        for (int i=0;i<singleDim.length;i++){
            singleDim[i]= new Random().nextInt(bound);
        }
        return singleDim;
    }
}
