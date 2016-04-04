/**
 * Created by andrey on 04.04.16.
 */
public class Cat extends DomesticAnimal {
    private boolean sterilised;

    public Cat(){
        super();
        sterilised = false;
    }

    public Cat(String name, int age, boolean sterilised){
        super(name, age);
    }

    public void strokeHead(){
        System.out.println("Purr, purr...");
    }

    public void giveMilk(){
        System.out.println("Slurp, slurp, slurp...");
    }
}
