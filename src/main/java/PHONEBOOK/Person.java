package PHONEBOOK;

import java.util.ArrayList;

/**
 * Created by taiseerhabib on 5/20/16.
 */
public class Person {

    String name;
    ArrayList<String> numberList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getNumberList() {
        return numberList;
    }

    public void addToNumberList(String number) {
        this.numberList.add(number);
    }

    public int getSizeNumberList(){
        return this.numberList.size();
    }




}
