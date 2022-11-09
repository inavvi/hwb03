public class Train extends Transport {

    private int priceTrip;
    private String timeTrip;
    private String departureStations;
    private String arrivalStations;
    private int numberCars;

    public Train(String brand, String model, int productionYear, String productionCountry, String departureStations, String arrivalStations, int maxSpeed, int priceTrip, int numberCars) {
        super(brand,model,productionYear,productionCountry);
        this.color=null;
        this.departureStations=departureStations;
        this.arrivalStations=arrivalStations;
        this.priceTrip=priceTrip;
        this.numberCars=numberCars;
        this.maxSpeed=maxSpeed;}

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        this.priceTrip = priceTrip;
    }

    public String getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(String timeTrip) {
        this.timeTrip = timeTrip;
    }

    public String getDepartureStations() {
        return departureStations;
    }

    public void setDepartureStations(String departureStations) {
        this.departureStations = departureStations;
    }

    public String getArrivalStations() {
        return arrivalStations;
    }

    public void setArrivalStations(String arrivalStations) {
        this.arrivalStations = arrivalStations;
    }

    public int getNumberCars() {
        return numberCars;
    }

    public void setNumberCars(int numberCars) {
        this.numberCars = numberCars;
    }

    @Override
    public void refull() {
                System.out.println(brand+" "+model+" заправлен дизелем.");
    }

    public void trainInfo () {
        System.out.println(brand+" "+model+", цвет "+color+", максимальная скорость "+maxSpeed+", год выпуска "+productionYear+", сборка "+productionCountry+".");
    }

}
