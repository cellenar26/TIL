package com.company;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Person {
    int height;
    int weight;
    int rank=1;

    Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    // S5_7568
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 인원수
        Person[] personArr = new Person[N];

        for (int i = 0; i< personArr.length; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int tempWeight = Integer.parseInt(st.nextToken());
            int tempHeight = Integer.parseInt(st.nextToken());
            personArr[i] = new Person(tempHeight, tempWeight);
        }

        for (int i = 0; i < personArr.length; i++) {
            for (int j = 0; j < personArr.length; j++) {
                if (i == j) {
                    continue;
                } else if (personArr[j].height > personArr[i].height && personArr[j].weight > personArr[i].weight) {
                    personArr[i].rank++;
                }
            }
        }

        for (int i = 0; i < personArr.length; i++) {
            System.out.print(personArr[i].rank+" ");
        }
    }
}