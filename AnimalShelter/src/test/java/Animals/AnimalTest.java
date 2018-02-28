package Animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
private Animal animal;

    @Before
    public void TestInitialize(){
        this.animal = new Animal("Ugly Duckling", Gender.Male);
    }

    @Test
    public void TestConstructor(){
        Assert.assertEquals("Ugly Duckling", this.animal.Name);
        Assert.assertEquals(Gender.Male, this.animal.Gender);
        Assert.assertNull(this.animal.getReservedBy());
    }

    @Test
    public  void TestReservation(){
        Assert.assertNull(this.animal.getReservedBy());
        Assert.assertTrue(this.animal.Reserve("John Doe"));
        Assert.assertNotNull(this.animal.getReservedBy());
        Assert.assertEquals("John Doe", this.animal.getReservedBy().Name);
        Assert.assertFalse(this.animal.Reserve("Jane Doe"));
    }

    @Test
    public void TestReservationTime(){
        // TODO: Implement this when interfaces have been explained.

    }
}