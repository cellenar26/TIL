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

        for (int i=1; i< sampleArray.length; i++) {
            for (int j=i; j > 0; j--) {
                if (sampleArray[j-1] > sampleArray[j]) {
                    int temp = sampleArray[j-1];
                    sampleArray[j-1] = sampleArray[j];
                    sampleArray[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(sampleArray));
    }
}