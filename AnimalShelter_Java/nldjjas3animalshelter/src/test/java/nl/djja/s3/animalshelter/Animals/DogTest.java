package nl.djja.s3.animalshelter.Animals;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    private Dog dog;

    @BeforeEach
    void testInitialize(){
        dog = new Dog("meow", Gender.Female);
    }

    @Test
    void testConstructor(){
        Assert.check(dog.getName() == "meow");
        Assert.check(dog.getGender() == Gender.Female);
        Assert.checkNull(dog.getReservor());
//        Assert.check(Calendar.getInstance().setTime(new Date());); // TODO add this
        Assert.check(dog.needsWalk() == false);
    }

    @Test
    void testReservation(){
        Assert.checkNull(dog.getReservor());
        Assert.check(dog.reserve("piet"));
        Assert.checkNonNull(dog.getReservor());
        Assert.check(dog.getReservor().getName() == "piet");
        Assert.check(dog.reserve("klaas") == false);
    }

    //    @org.junit.jupiter.api.Test
//    void TestReservationTime(){
//
//    }
}