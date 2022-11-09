package Animals;

public class Mherbivores extends Mammals {
    String eat;

    public Mherbivores(String name, int age, String territory, int speed, String eat) {
        super(name, age, territory, speed);
        this.eat=eat;}


   @Override
    public void eat() {
        System.out.println("Я люблю есть сочную траву.");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

   @Override
   public void friends() {System.out.println("Привет! Я "+name+". Я дружу с лошадьми, жирафами и газелями!");
   }

    public void graze() {
        System.out.println("Я пошёл на пастбище");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mherbivores mherbivores = (Mherbivores) o;
        return name.equals(mherbivores.getName()) && age==mherbivores.getAge();}


        @Override
    public String toString() {
        return "Млекопитающие: "+
                "имя " + name + ", " +
                "возраст " + age + " лет, " +
                "среда обитания " + territory + ", " +
                "скорость " + speed +" км/ч, " +
                "пища " + eat + ".";
    }
}