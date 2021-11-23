package Zadaniye_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class UserData {
    private ArrayList<User> data;


    public UserData() {
    }

    public UserData(ArrayList<User> data) {
        this.data = data;
    }




    public ArrayList<User> getData() {
        return data;
    }

    public void setData(ArrayList<User> data) {
        this.data = data;
    }



    public void addAll(User... u) {
        this.data = new ArrayList<User>(Arrays.asList(u));
    }


    public Map.Entry<Integer, User> getRandomUser() {
        Random rnd = new Random();
        int index = rnd.nextInt(this.data.size());

        return new Map.Entry<Integer, User>() {

            @Override
            public Integer getKey() {
                return index;
            }

            @Override
            public User getValue() {
                return data.get(index);
            }

            @Override
            public User setValue(User value) {
                return value;
            }
        };
    }
}
