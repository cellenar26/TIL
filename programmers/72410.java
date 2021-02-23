package com.company;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // 프로그래머스_72410
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String new_id = "=.=";
        if (new_id.length() >= 1) {

            //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
            new_id = new_id.toLowerCase();
            //System.out.println(new_id.toLowerCase());

            // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
            String[] targetStrings = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "]",
                    "{", "}", "\\", "|", ";", ":", "'", "\"", "<", ">", "/", "?"
                    , ","};
            for (String s : targetStrings) {
                if (new_id.contains(s)) {
                    new_id = new_id.replace(s, "");
                }
            }
        }
    }
}