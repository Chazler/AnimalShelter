package Animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    private Cat cat;

    @Before
    public void TestInitialize(){
        this.cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");
    }

    @Test
    public void TestConstructor(){
        Assert.assertEquals("Ms. Meow", this.cat.Name);
        Assert.assertEquals(Gender.Female, this.cat.Gender);
        Assert.assertNull(this.cat.getReservedBy());
        Assert.assertEquals("Scratches couch", this.cat.badHabits);
    }

    @Test
    public  void TestReservation(){
        Assert.assertNull(this.cat.getReservedBy());
        Assert.assertTrue(this.cat.Reserve("John Doe"));
        Assert.assertNotNull(this.cat.getReservedBy());
        Assert.assertEquals("John Doe", this.cat.getReservedBy().Name);
        Assert.assertFalse(this.cat.Reserve("Jane Doe"));
    }

    @Test
    public void TestReservationTime(){
        // TODO: Implement this when interfaces have been explained.

    }
}