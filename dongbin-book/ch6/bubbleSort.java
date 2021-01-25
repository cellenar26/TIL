package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

//    public static int[] sampleArray = {7,2,9,1,3,6,5,8,4,0};

    public static void main(String[] args) throws IOException {

        // bubble sort
        int[] sampleArray = {7,2,9,1,3,6,5,8,4,0};
        int temp;
        for (int i=0; i< sampleArray.length-1; i++) {
            for (int j=i+1; j< sampleArray.length; j++) {
                if (sampleArray[i] > sampleArray[j]) {
                    temp = sampleArray[i];
                    sampleArray[i] = sampleArray[j];
                    sampleArray[j] = temp;
                }
            }
        }
        System.out.println("bubble sort 결과");
        for (int i : sampleArray) {
            System.out.print(sampleArray[i]+" ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(sampleArray));
    }
}