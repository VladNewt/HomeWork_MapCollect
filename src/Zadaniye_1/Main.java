package Zadaniye_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Random rnd = new Random();

        final String[] sournameArr = {"Jones","Garcia","Wright","Hughes","Collins","Bell","Rivera",
        "Ramirez", "Cook", "Perry"};

        final String[] nameArr =  {"Edward","Albert","Carl","Derek","Felix","Caroline","Angelina",
                "Barbara", "Judy", "Diana"};

        final String[] secondnameArr = {"Travis","Valentine","Walter","Scott","Miles","Kurt","John",
                "Hubert", "Harry", "Grant"};


        HashSet<String> sourname = new HashSet<String>(Arrays.asList(sournameArr));
        HashSet<String> name = new HashSet<String>(Arrays.asList(nameArr));
        HashSet<String> secondname = new HashSet<String>(Arrays.asList(secondnameArr));



        //Коллекция номеров билетов
       LinkedHashSet<Integer> ticket = new LinkedHashSet<Integer>();
        while (ticket.size()<10) {
            ticket.add(rnd.nextInt(10)+1);
        }

        //Преобразование в List
        ArrayList<Integer> ticketArr = new ArrayList<>();
        ticket.forEach(value->ticketArr.add(value));



        //Коллекция уникальных ФИО и номеров билетов
        TreeMap<Students, Integer> students = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            students.put(new Students(sournameArr[rnd.nextInt(10)],nameArr[rnd.nextInt(10)],secondnameArr[rnd.nextInt(10)]),
                    ticketArr.get(i));
        }


        for (Map.Entry<Students,Integer> item : students.entrySet()) {
            System.out.println(item.getKey()+"="+item.getValue());
        }

    }
}