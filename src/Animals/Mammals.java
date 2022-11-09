package Animals;

public abstract class Mammals extends Animals {

    int speed;

    public Mammals (String name, int age, String territory, int speed) {
        super(name, age, territory);
        this.speed=speed;}

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    public abstract void friends();
}
