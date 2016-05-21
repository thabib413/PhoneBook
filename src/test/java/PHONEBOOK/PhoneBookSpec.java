package PHONEBOOK;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by taiseerhabib on 5/16/16.
 */
public class PhoneBookSpec {

    @Test
    public void lookingUpName() {
        PhoneBook testPhoneBook = new PhoneBook();
        Person testPerson = new Person();
        testPerson.addToNumberList("302-543-7654");
        testPhoneBook.addPerson("test name", testPerson.getNumberList());
        String expectedNumbers = "302-543-7654\n";
        String actualNumbers = testPhoneBook.lookUpPerson("test name");
        assertEquals(expectedNumbers, actualNumbers);
    }

    @Test
    public void removingEntry() {
        PhoneBook testPhoneBook = new PhoneBook();
        Person testPerson = new Person();
        testPerson.addToNumberList("302-543-7654");
        testPhoneBook.addPerson("test name", testPerson.getNumberList());
        int expectedValue = 1;
        int actualValue = testPhoneBook.getSizeOfPhoneBook();
        testPhoneBook.removePerson("test name");
        int expectedValue2 = 0;
        int actualValue2 = testPhoneBook.getSizeOfPhoneBook();
        assertEquals(expectedValue2, actualValue2);
    }

    @Test
    public void reverseLookUp(){
        PhoneBook testPhoneBook = new PhoneBook();
        Person testPerson = new Person();
        testPerson.addToNumberList("302-543-7654");
        testPhoneBook.addPerson("test name", testPerson.getNumberList());
        String expectedNumber = "test name";
        String actualNumber = testPhoneBook.reverseLookUp("302-543-7654");
        assertEquals(expectedNumber, actualNumber);
    }



    @Test
    public void removeNumber(){
        PhoneBook testPhoneBook = new PhoneBook();
        Person testPerson = new Person();
        testPerson.addToNumberList("302-543-7654");
        testPhoneBook.addPerson("test name", testPerson.getNumberList());
        int preRemoveExpected = 1;
        int preRemoveActual = testPerson.getSizeNumberList();
        testPhoneBook.removeNumber("302-543-7654");
        int postRemoveExpected = 0;
        int postActual = testPerson.getSizeNumberList();
        assertEquals(preRemoveActual, preRemoveExpected);
        assertEquals(postRemoveExpected, postActual );
        assertFalse(preRemoveActual == postActual);
    }

}
