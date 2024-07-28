package org.example;

import java.util.Random;

/***
 *
 */
public class SourceArray implements  SourceArrayI {

    /***
     *
     * @param singleDim - single dimensional array
     * @param bound - random integer bound
     * @return - single dimensional after populating the random integers
     */
    public int [] singleDimensionalArray(int [] singleDim,int bound){

        for (int i=0;i<singleDim.length;i++){
            singleDim[i]= new Random().nextInt(bound);
        }
        return singleDim;
    }
}
