package Animals;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ReservorTest {
Date dateNow = new Date();

    @Test
    public void TestConstructor(){
        Date reservedAt = dateNow;
        Reservor reservor = new Reservor("John Doe", reservedAt);
        Assert.assertEquals("John Doe", reservor.Name);
        Assert.assertEquals(reservedAt, reservor.ReservedAt);
    }
}