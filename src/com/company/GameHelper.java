package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String promtp){
        String inputLine = null;
        System.out.println(promtp + "  ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLine;
    }
}
