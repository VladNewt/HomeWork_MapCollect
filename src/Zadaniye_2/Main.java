package Zadaniye_2;

import java.util.Map;
import java.util.TreeMap;


public class Main {

    public static void main(String[] args) {
        TreeMap<String, String> colors = new TreeMap<>();
        colors.put("RED", "#FF0000");
        colors.put("BLUE", "#0000FF");
        colors.put("YELLOW", "#FFFF00");

        TreeMap<String, Integer> sizes = new TreeMap<>();
        sizes.put("HEIGHT",600);
        sizes.put("WIDTH",400);

        TreeMap<String, String> users = new TreeMap<>();
        users.put("Passw1", "Login1");
        users.put("Passw2", "Login");

        TreeMap<String, TreeMap> settings = new TreeMap<>();
        settings.put("color",colors);
        settings.put("sizes",sizes);
        settings.put("users",users);


        System.out.println("settings--|");
        Main.printSpaces("settings--");
        System.out.println("|");
        Main.printSpaces("settings--");



        for (Map.Entry item : settings.entrySet()) {
            System.out.println("|---"+item.getKey()+" = ");

            TreeMap<String,TreeMap> inside = new TreeMap<>(settings.get(item.getKey()));
            for (Map.Entry itemInside : inside.entrySet()) {
                Main.printSpaces("settings--"+"|---"+item.getKey()+" = ");
                System.out.print("|---"+itemInside.getKey()+" = "+itemInside.getValue()+"\r\n");
            }

            Main.printSpaces("settings--");
        }
    }




    public static void printSpaces(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(" ");
        }
    }
}
