/**
 * Created by andrey on 04.04.16.
 */
public class DomesticAnimal {
    private boolean alive;
    private String size;
    private String colour;
    private String name;
    private int age;

    public DomesticAnimal(){
        alive = true;
        size = "unknown";
        colour = "unknown";
        name = "unknown";
        age = 0;
    }

    public DomesticAnimal(String name, int age){
        alive = true;
        this.name = name;
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
