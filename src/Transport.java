public abstract class Transport {

    protected String brand;
    protected String model;
    protected int productionYear;
    protected String productionCountry;
    protected String color;
    protected int maxSpeed;
    protected int fuel;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (this.productionYear==0) {
        this.productionYear = productionYear;}
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
            if (this.productionCountry == null || this.productionCountry.isEmpty() || this.productionCountry.isBlank()) {
                this.productionCountry = productionCountry;
            } else {
                System.out.println("Ошибка! Данные о стране производства менять нельзя!");
            }
        } else {
            System.out.println("Ошибка! Данные не введены!");}
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
        this.color = color;} else {
            System.out.println("Ошибка! Данные не введены!");}
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >0) {
        this.maxSpeed = maxSpeed;}
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry) {
        this.brand=brand;
        this.model=model;
        if (productionYear<=1900) {
            this.productionYear=2000;
        } else {
            this.productionYear=productionYear;
        }
        this.productionCountry=productionCountry;
        this.fuel=0;
        this.maxSpeed=0;}

    public abstract void refull();

    public void transportInfo () {
        System.out.println(brand+" "+model+", цвет "+color+", максимальная скорость "+maxSpeed+", год выпуска "+productionYear+", сборка "+productionCountry+".");}


}
