package com.clasez.app;

import java.util.Date;

public class Greeter {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Usage :");
            System.out.println("   Greeter <name>");
            System.exit(-1);
        }

        System.out.println(getGreeting(args[0]));
    }

    private static String getGreeting(String name) {
        Date now = new Date();
        String greeting = null;

        int currentHour = now.getHours();

        if(currentHour < 12) {
            greeting = "Good Morning ";
        } else if(currentHour >=12 && currentHour <= 18) {
            greeting = "Good Afternoon ";
        } else if (currentHour > 18){
            greeting = "Good Night ";
        }

        // Check if the name is null or empty - then return an error message
        if(name == null || name.trim().length() == 0){
            return "Name cannot be empty";
        }

        return "Hello " + name + "! " + greeting + " to you!";
    }


}
