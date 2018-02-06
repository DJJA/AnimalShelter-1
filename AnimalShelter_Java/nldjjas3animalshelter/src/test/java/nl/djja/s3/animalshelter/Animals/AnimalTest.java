package nl.djja.s3.animalshelter.Animals;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal animal;

    @BeforeEach
    void TestInitialize(){
        animal = new Animal("Ugly duck", Gender.Male);
    }

    @org.junit.jupiter.api.Test
    void TestConstructor(){
        Assert.check(animal.getName() == "Ugly duck");
        Assert.check(animal.getGender() == Gender.Male);
        Assert.checkNull(animal.getReservor());
    }

    @org.junit.jupiter.api.Test
    void TestReservation(){
        Assert.checkNull(animal.getReservor());
        Assert.check(animal.reserve("piet"));
        Assert.checkNonNull(animal.getReservor());
        Assert.check(animal.getReservor().getName() == "piet");
        Assert.check(animal.reserve("klaas") == false);
    }

//    @org.junit.jupiter.api.Test
//    void TestReservationTime(){
//
//    }
}