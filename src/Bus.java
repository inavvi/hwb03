public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
        super(brand,model,productionYear,productionCountry);
        this.maxSpeed=maxSpeed;
    }

    @Override
    public void refull() {
        if (this.fuel == 0) {
            System.out.println(brand+" "+model+" заправлен бензином.");
        } else {
            if (this.fuel == 1) {
                System.out.println(brand+" "+model+" заправлен дизелем.");}
        }
    }
}
