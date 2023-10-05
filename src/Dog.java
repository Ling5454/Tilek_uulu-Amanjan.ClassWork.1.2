import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String bread;
    private String[] commands;

    public Dog(String name, String breed, String[] commands,
               Shelter shelter, ColorEnum colorEnum) {
        this.name = name;
        this.bread = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);
    }

    public Dog(String name, String breed,
               Shelter shelter, ColorEnum colorEnum) {
        this.name = name;
        this.bread = breed;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice() {
        System.out.println("гав гав");
    }

    public final void makeVoice(String voice) {
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBread: " + bread +
                "\nCommands: " + Arrays.toString(commands);
    }
}