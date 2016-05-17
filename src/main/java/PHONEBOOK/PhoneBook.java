package PHONEBOOK;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by taiseerhabib on 5/16/16.
 */
public class PhoneBook {

    Map<String, Person> nameMap;

    public PhoneBook(){
        nameMap = new HashMap<String, Person>();
    }

    Person person = new Person();

    public Person lookUpPerson (String name){
        return person;
    }
    public void addPerson (String name, Person person){
        nameMap.put(name, person);
    }
    public void removePerson (String name) {
        nameMap.remove(name);
    }
    public String lookUpPhoneNum (String name) {
        return name;
    }
}
