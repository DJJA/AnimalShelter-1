package nl.djja.s3.animalshelter;

import com.sun.tools.javac.util.Assert;
import nl.djja.s3.animalshelter.Animals.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    private Reservation reservation;

    @BeforeEach
    void testInitialize(){
        reservation = new Reservation();
    }

    @Test
    void testNewCat(){
        Assert.check(reservation.getAnimals().size() == 0);
        reservation.newCat("dog", Gender.Female,"being a dog");
        Assert.check(reservation.getAnimals().size() == 1);
    }

    @Test
    void testNewDog(){
        Assert.check(reservation.getAnimals().size() == 0);
        reservation.newDog("cat", Gender.Female);
        Assert.check(reservation.getAnimals().size() == 1);
    }
}