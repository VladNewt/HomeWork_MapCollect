package Zadaniye_1;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();

        final String[] sournameArr = {"Sourname10","Sourname11","Sourname12","Sourname13","Sourname14","Sourname15","Sourname16",
        "sourname17", "sourname18", "sourname19"};

        final String[] nameArr =  {"name10","name11","name12","name13","name14","name15","name16",
                "name17", "name18", "name19"};

        final String[] secondnameArr = {"secondname10","secondname12","secondname13","secondname11","secondname14","secondname15","secondname16",
                "secondname17", "secondname18", "secondname19"};



        TreeSet<String> sourname = new TreeSet<String>(Arrays.asList(sournameArr));
        TreeSet<String> name = new TreeSet<String>(Arrays.asList(nameArr));
        TreeSet<String> secondname = new TreeSet<String>(Arrays.asList(secondnameArr));



        sourname.forEach(System.out::println);
        name.forEach(System.out::println);
        secondname.forEach(System.out::println);



        //Коллекция номеров билетов
        TreeSet<Integer> ticket = new TreeSet<>();

        for (int i = 1; i <= 10; i++) {
            ticket.add(i);
        }


        //Коллекция уникальных ФИО и номеров билетов
        TreeMap<Students, String> students = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            students.put(new Students(sournameArr[rnd.nextInt(10)],nameArr[rnd.nextInt(10)],secondnameArr[rnd.nextInt(10)]),
                    ticket.floor(rnd.nextInt(10)).toString());
        }

        System.out.println(students.toString());

    }
}
