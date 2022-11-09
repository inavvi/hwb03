package Animals;

public abstract class Birds extends Animals{

    public Birds (String name, int age, String territory) {
        super(name, age, territory);}

    public abstract void like();
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }
}
