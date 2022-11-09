package Animals;

public class Bflying extends Birds {

    public Bflying (String name, int age, String territory) {
        super(name, age, territory);}

    @Override
    public void like() {
        System.out.println("Привет! Я "+name+". Я люблю летать!");
    }
}
