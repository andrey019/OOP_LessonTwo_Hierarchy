/**
 * Created by andrey on 04.04.16.
 */
public class Dog extends DomesticAnimal {
    private boolean chopedTail;
    private boolean trained;
    private boolean longHair;

    public Dog(){
        chopedTail = false;
        trained = false;
        longHair = false;
    }

    public Dog(String name, int age, boolean longHair){
        super(name, age);
        this.longHair = longHair;
    }

    public boolean isChopedTail() {
        return chopedTail;
    }

    public void setChopedTail(boolean chopedTail) {
        this.chopedTail = chopedTail;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public boolean isLongHair() {
        return longHair;
    }

    public void setLongHair(boolean longHair) {
        this.longHair = longHair;
    }

    public void bark(){
        System.out.println("Ruff! Arf-arf!");
    }
}
