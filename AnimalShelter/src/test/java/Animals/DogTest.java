package Animals;

import java.util.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {
    private Dog dog;
    Date dateNow = new Date();

    @Before
    public void TestInitialize(){
        this.dog = new Dog("Sgt. Woof", Gender.Male);
    }

    @Test
    public void TestConstructor(){
        Assert.assertEquals("Sgt. Woof", this.dog.Name);
        Assert.assertEquals(Gender.Male, this.dog.Gender);
        Assert.assertNull(this.dog.getReservedBy());
        Assert.assertEquals(dateNow, this.dog.LastWalk);
        Assert.assertFalse(this.dog.NeedsWalk());
    }

    @Test
    public  void TestReservation(){
        Assert.assertNull(this.dog.getReservedBy());
        Assert.assertTrue(this.dog.Reserve("John Doe"));
        Assert.assertNotNull(this.dog.getReservedBy());
        Assert.assertEquals("John Doe", this.dog.getReservedBy().Name);
        Assert.assertFalse(this.dog.Reserve("Jane Doe"));
    }

    @Test
    public void TestReservationTime(){
        // TODO: Implement this when interfaces have been explained.

    }
}