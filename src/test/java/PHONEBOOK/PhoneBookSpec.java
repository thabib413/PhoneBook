package PHONEBOOK;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by taiseerhabib on 5/16/16.
 */
public class PhoneBookSpec {

    @Test
    public void lookingUpName(){
        PhoneBook testPhoneBook = new PhoneBook();
        String expectedPerson = "testname";
        Person actualPerson = testPhoneBook.lookUpPerson(expectedPerson);
        assertNull(actualPerson);
    }
    @Test
    public void addingPerson(){
        Person testPerson = new Person();
        PhoneBook testPhoneBook = new PhoneBook();
        String expectedPerson = "testname";
        String actualPerson = testPhoneBook.lookUpPerson(expectedPerson).getName();
        assertTrue(expectedPerson.equals(actualPerson));
    }
    @Test
    public void removingPerson(){
        PhoneBook testPhonebook = new PhoneBook();
        String name = "testname";
        Person person = new Person();

        testPhonebook.addPerson(name, person);
        Person resultBeforeRemoval = testPhonebook.lookUpPerson(name);
        testPhonebook.removePerson(name);
        Person resutAfterRemoval = testPhonebook.lookUpPerson(name);
        assertNull(resutAfterRemoval);
        assertNotEquals(resultBeforeRemoval, resutAfterRemoval);

    }
}
