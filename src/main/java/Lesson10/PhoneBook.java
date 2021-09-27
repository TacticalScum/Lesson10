package Lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    String name;
    int phoneNumber;
    Map<String, List<Integer>> map = new HashMap<>();
    List<Integer> phoneNumberList;

    public void add(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        if (map.containsKey(this.name)) {
            phoneNumberList = map.get(this.name);
            phoneNumberList.add(this.phoneNumber);
            map.put(this.name, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(this.phoneNumber);
            map.put(this.name, phoneNumberList);
        }
    }

    public void get(String name) {
        this.name = name;
        System.out.println(this.name + " : " + map.get(this.name));
    }
}

