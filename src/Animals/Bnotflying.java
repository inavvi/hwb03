package Animals;

public class Bnotflying extends Birds {
    public Bnotflying (String name, int age, String territory) {
        super(name, age, territory);}

    @Override
    public void like() {
        System.out.println("Привет! Я "+name+". Жаль, что я не умею летать, но зато я люблю бегать!");
    }
}
