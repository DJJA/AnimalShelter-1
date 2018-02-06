package nl.djja.s3.animalshelter.Animals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Dog extends Animal{
    private Date lastWalk;

    public Date getLastWalk() {
        return lastWalk;
    }

    public Dog(String name, Gender gender) {
        super(name, gender);
        lastWalk = new Date();
    }

    public boolean needsWalk(){
        long diffInmilis = new Date().getTime() - lastWalk.getTime();           // TODO Maybe Math.abs needs to be used here
        long diffInDays = TimeUnit.DAYS.convert(diffInmilis, TimeUnit.MILLISECONDS);
        return diffInDays > 0;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        return super.toString() + ", last walk: " + df.format(lastWalk);
    }
}
