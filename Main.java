/**
 * Created by andrey on 04.04.16.
 */
public class Main {
    public static void main(String[] args){
        Dog d1 = new Dog("Chappie", 5, true);
        d1.bark();

        Cat c1 = new Cat();
        c1.setAge(12);
        c1.setName("Murko");
        c1.strokeHead();
        c1.giveMilk();
        System.out.println("Cat name is " + c1.getName());
    }
}
/*
Ruff! Arf-arf!
Purr, purr...
Slurp, slurp, slurp...
Cat name is Murko

Process finished with exit code 0

 */