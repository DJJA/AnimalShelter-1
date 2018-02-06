package nl.djja.s3.animalshelter.Animals;

import java.util.Date;

public class Animal {
    // region properties
    private String name;
    private Gender gender;
    private Reservor reservor;

    public String getName(){
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Reservor getReservor() {
        return reservor;
    }
    // endregion

    public Animal(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }

    public boolean reserve(String reservedBy){
        if(reservor == null){
            reservor = new Reservor(reservedBy, new Date());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String reserved = "not reserved";
        if(reservor != null){
            reserved = "reserved by " + reservor.getName();
        }
        return name + " " + gender + " " + reserved;
    }
}
