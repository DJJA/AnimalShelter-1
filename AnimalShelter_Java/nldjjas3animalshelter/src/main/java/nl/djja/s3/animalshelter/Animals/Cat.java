package nl.djja.s3.animalshelter.Animals;

public class Cat extends Animal{
    private String badHabits;

    public String getBadHabits() {
        return badHabits;
    }

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        this.badHabits = badHabits;
    }

    @Override
    public String toString() {
        return super.toString() + ", bad habits: " + badHabits.toLowerCase();
    }
}
