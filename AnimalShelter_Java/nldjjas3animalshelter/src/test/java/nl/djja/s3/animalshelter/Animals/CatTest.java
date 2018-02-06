package nl.djja.s3.animalshelter.Animals;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    private Cat cat;

    @BeforeEach
    void testInitialize(){
        cat = new Cat("meow", Gender.Female, "bakstenen gooien");
    }

    @Test
    void testConstructor(){
        Assert.check(cat.getName() == "meow");
        Assert.check(cat.getGender() == Gender.Female);
        Assert.checkNull(cat.getReservor());
        Assert.check(cat.getBadHabits() == "bakstenen gooien");
    }

    @Test
    void testReservation(){
        Assert.checkNull(cat.getReservor());
        Assert.check(cat.reserve("piet"));
        Assert.checkNonNull(cat.getReservor());
        Assert.check(cat.getReservor().getName() == "piet");
        Assert.check(cat.reserve("klaas") == false);
    }

    //    @org.junit.jupiter.api.Test
//    void TestReservationTime(){
//
//    }
}