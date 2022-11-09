public class Car extends Transport {

    private String engineVolume;
    private String bodyType;

    public Car(String brand, String model, String engineVolume, String color, int productionYear, String productionCountry) {
        super(brand,model,productionYear,productionCountry);
        this.color=color;
        this.engineVolume=engineVolume;
        this.bodyType="нет данных";}

    public void transportInfo () {
        System.out.println(brand+" "+model+", цвет кузова "+color+", объём двигателя "+engineVolume+", год выпуска "+productionYear+", сборка "+productionCountry+", тип кузова "+bodyType+".");
    }

    @Override
    public void refull() {
        if (this.fuel == 0) {
            System.out.println(brand+" "+model+" заправлен бензином.");
        } else {
            if (this.fuel == 1) {
                System.out.println(brand+" "+model+" заправлен дизелем.");}
        }
        if (this.fuel != 0 && this.fuel != 1) {
                System.out.println(brand+" "+model+" заряжен.");}
    }

}
