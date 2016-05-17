package PHONEBOOK;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by taiseerhabib on 5/16/16.
 */
public class PersonSpec {
    @Test
    public void GetNameSpec() {
        Person testPerson = new Person();
        String expectedName = "testname";
        String actualName = testPerson.getName();
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void GetNumSpec(){
        Person testPerson = new Person();
        String expectedNum = "123456789";
        String actualNum = testPerson.getPhoneNumber();
        Assert.assertEquals(expectedNum, actualNum);
    }
}


