import java.util.Random;

public class Pet {
    private int Age = generateDefaultAge();
    private ColorEnum ColorEnum;
    private Shelter shelter;

    public int getAge() {
        return Age;
    }


    public ColorEnum getColorEnum() {
        return ColorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        ColorEnum = colorEnum;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getInfo() {
        return "Age: " + Age +
                "\nColor: " + ColorEnum +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }
}
