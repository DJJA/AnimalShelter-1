package nl.djja.s3.animalshelter.Animals;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReservorTest {

    @BeforeEach
    void testConstructor(){
        Date reservedAt = new Date();
        Reservor reservor = new Reservor("Klaas", reservedAt);
        Assert.check(reservor.getName() == "Klaas");
        Assert.check(reservor.getReservedAt().getTime() == reservedAt.getTime());
    }
}