package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SourceArray sourceArray = new SourceArray();
        int [] singleDim = new int[100];
        singleDim = sourceArray.singleDimensionalArray(singleDim,100000);
        List<Integer> singleDimList = Arrays.stream(singleDim).boxed().toList();
        System.out.println("singleDim="+singleDim+" and singleDimList="+singleDimList);

        int [][] twoDim = new int [][] {{0,0},{1,1}};
        int [][][] threeDim = new int [][][]{{{0,0},{1,1}},{{0,0},{1,1}}};
        int [][][][] fourDim = new int [][][][]{{{{0}}}};
        int [][][][][] fiveDim = new int [][][][][]{{{{{0}}}}};
        int [][][][][][] sixDim = new int [][][][][][]{{{{{{0}}}}}};
        int [][][][][][][] sevenDim = new int [][][][][][][]{{{{{{{0}}}}}}};
        int [][][][][][][][] eighthDim = new int [][][][][][][][]{{{{{{{{0}}}}}}}};
        int [][][][][][][][][] ninthDim = new int [][][][][][][][][]{{{{{{{{{0}}}}}}}}};
        int [][][][][][][][][][] tenthDim = new int [][][][][][][][][][]{{{{{{{{{{0}}}}}}}}}};



        System.out.println("Hello world!");
    }
}