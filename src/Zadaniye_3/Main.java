package Zadaniye_3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        User[] usr = new User[7];
        int[] age = {12,15,18,13,17,18,20};
        String[] name = {"name1","name2","name3","name4","name5","name6","name7"};
        String[] pass = {"pass1","pass2","pass3","pass4","pass5","pass6","pass7"};

        for (int i = 0; i < usr.length; i++) {
            usr[i] = new User(name[i],pass[i],age[i]);
        }

        UserData usrdata = new UserData();
        usrdata.addAll(usr);


        Map.Entry<Integer, User> entryUser = usrdata.getRandomUser();
        System.out.println(entryUser.getKey()+" = "+entryUser.getValue());
    }

}
