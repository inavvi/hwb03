package Animals;


public class Mpredators extends Mammals {

    String eat;

    public Mpredators(String name, int age, String territory, int speed, String eat) {
        super(name, age, territory, speed);
        this.eat=eat;}


    @Override
    public void eat() {
        System.out.println("Я люблю охотится на дичь.");
    }

    @Override
    public void friends() {System.out.println("Привет! Я "+name+". Я дружу со львами и тиграми!");
    }
}
