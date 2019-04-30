package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> myFavs = new HashMap<String, String>();

        myFavs.put("name", "Slim Shady");
        myFavs.put("food", "sushi");
        myFavs.put("place", "L.A.");

        System.out.println("My name is " + myFavs.get("name")
                + ", my favorite food is " + myFavs.get("food")
                + ", my favorite place is " + myFavs.get("place"));

        System.out.println(myFavs.values());

        String val = "D.C.";
        for (String value : myFavs.values()) {
            if (val == value) {
                System.out.println("the value is in the hashmap");
            } else {
                System.out.println("the value is not in the hashmap");
                break;
            }
        }

        for (String key : myFavs.keySet()) {
            System.out.println(myFavs.get(key));
        }
    }
}
