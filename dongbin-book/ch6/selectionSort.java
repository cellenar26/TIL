package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        // selection sort
        int[] sampleArray = {7,2,9,1,3,6,5,8,4,0};

        int minIndex = 0;

        for (int i=0; i< sampleArray.length-1; i++) {
            int minV = sampleArray[i];
            for (int j=i+1; j< sampleArray.length; j++) {
                if (minV > sampleArray[j]) {
                    minV = sampleArray[j];
                    minIndex = j;
                }
            }
            int temp = sampleArray[minIndex];
            sampleArray[minIndex] = sampleArray[i];
            sampleArray[i] = temp;
        }
        System.out.println(Arrays.toString(sampleArray));
    }
}