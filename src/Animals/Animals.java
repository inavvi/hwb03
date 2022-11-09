package Animals;

import java.util.Objects;

public abstract class Animals {

    String name;
    int age;
    String territory;

    public Animals(String name, int age, String territory) {
        this.name=name;
        this.age=age;
        this.territory=territory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            if (this.name == null || this.name.isEmpty() || this.name.isBlank()) {
                this.name = name;
            } else {
                System.out.println("Ошибка! Данные о стране производства менять нельзя!");
            }
        } else {
            System.out.println("Ошибка! Данные не введены!");}
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;} else {
            System.out.println("Ошибка! Данные не введены!");}
    }

    @Override
    public String toString() {
        return "Животные: "+
                "имя " + name + ", " +
                "возраст " + age + " лет, " +
                "среда обитания " + territory + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, territory);
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void go();
}
