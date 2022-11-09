import Animals.Mherbivores;
import Animals.Mpredators;
import Animals.Aamphibians;
import Animals.Bflying;
import Animals.Bnotflying;

public class Main {
    public static void main(String[] args) {

        Car avante=new Car("Hyundai","Avante","1,6 л.","оранжевый", 2016,"Южная Корея");
        Car murcielago=new Car("Lamborghini","Murcielago","6,19 л.","оранжевый", 2010,"Италия");

        Train swallow=new Train("Ласточка","B-901",2011,"Россия", "Белорусский вокзал","Минск-Пассажирский", 301, 3500,11);
        Train leningrad=new Train("Ленинград","D-125",2019,"Россия", "Ленинградский вокзал","Ленинград-Пассажирский", 270, 1700,8);

        Bus tourismo=new Bus("Mercedes-Benz","Tourismo",2016,"Германия", 140);
        Bus universe=new Bus("Hyundai","Universe",2017,"Южная Корея", 140);
        Bus universet=new Bus("Hyundai","Universe T",2017,"Южная Корея", 150);

        murcielago.setColor(" ");
        murcielago.setProductionCountry("Россия");
        universe.setColor("белый");

        Mherbivores gazel=new Mherbivores("Газель",2,"Серенгети", 80,"трава");
        Mherbivores gazela=new Mherbivores("Газель",3,"Серенгети", 80,"трава");

        Mpredators lion=new Mpredators("Лев",2,"Серенгети", 60,"дичь");
        Mpredators cheetah=new Mpredators("Гепард",2,"Серенгети", 110,"дичь");

        Aamphibians viper=new Aamphibians("Шумящая гадюка",2,"Серенгети");

        Bflying flamingo=new Bflying("Обыкновенный фламинго",1,"Серенгети");

        Bnotflying penguin=new Bnotflying("Очковый пингвин",1,"Побережье Намибии");

        murcielago.transportInfo();
        leningrad.transportInfo();
        universe.transportInfo();

        murcielago.refull();
        universe.setFuel(1);
        leningrad.refull();
        universe.refull();

        System.out.println(gazel.equals(gazela));
        System.out.println(gazel.toString());
        gazel.friends();
        gazel.eat();
        lion.friends();
        lion.eat();
        System.out.println(lion.toString());
        System.out.println(viper.toString());
        flamingo.like();
        System.out.println(flamingo.toString());
        penguin.like();
        System.out.println(penguin.toString());


    }
}