package PHONEBOOK;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by taiseerhabib on 5/16/16.
 */
public class PhoneBook {

    Map<String, ArrayList<String>> nameMap = new TreeMap<>();


    public int getSizeOfPhoneBook(){
        return nameMap.size();
    }
    public String lookUpPerson (String name){
        String number = "";
        for (String numbers : nameMap.get(name)){
            number += numbers + "\n";
        }
        return number;
    }

    public void addPerson (String name, ArrayList<String> numbers){
    nameMap.put(name, numbers);
}
    public void removePerson (String name) {
        nameMap.remove(name);
    }

    public String reverseLookUp(String number) {
        for(String key : nameMap.keySet()) {
            if(nameMap.get(key).contains(number)){
               return key;
            }
        }
        return null;
    }

    public void removeNumber(String number) {
        for(String key : nameMap.keySet()) {
            if(nameMap.get(key).contains(number)){
                for(int i =0; i <= nameMap.get(key).size(); i++) {
                    if (number == nameMap.get(key).get(i)) {
                        nameMap.get(key).remove(i);
                    }
                }
            }
        }
    }

}
