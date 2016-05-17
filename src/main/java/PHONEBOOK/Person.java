package PHONEBOOK;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taiseerhabib on 5/16/16.
 */
public class Person {

    List<String> phoneNumbers;
    private String name;

    public Person(String name){
        this.name = name;
        phoneNumbers = new ArrayList<String>();
    }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return ;


}


/*

public class Word {

    List<String> definitions;


    private String name;

    public Word(String name){
        this.name = name;
        definitions = new ArrayList<String>();

    }

    public String getName() {
        return name;
    }

    public void addDefinition(String newDefinition){
        definitions.add(newDefinition);

    }

    public int getNumberOfDefinitions(){
        return definitions.size();
    }

    public void removeDefinition(int index){
        definitions.remove(index-1);

    }


}


 */
