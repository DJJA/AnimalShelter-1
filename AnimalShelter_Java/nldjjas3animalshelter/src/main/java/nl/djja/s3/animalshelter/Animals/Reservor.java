package nl.djja.s3.animalshelter.Animals;

import java.util.Date;

public class Reservor {
    private String name;
    private Date reservedAt;

    public String getName(){
        return name;
    }

    public Date getReservedAt(){
        return reservedAt;
    }

    public Reservor(String name, Date reservedAt){
        this.name = name;
        this.reservedAt = reservedAt;
    }
}
