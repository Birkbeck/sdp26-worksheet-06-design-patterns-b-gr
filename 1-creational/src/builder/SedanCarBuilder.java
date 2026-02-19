package builder;

public class SedanCarBuilder implements CarBuilder{

    @Override
    public void buildBodyStyle() {
        String bodyStyle= "Body: External dimensions: overall length (inches): 202.9, overall width (inches): 76.2, overall height (inches): 60.7, wheelbase (inches): 112.9, front track (inches): 65.3, rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5";

    }

    @Override
    public void buildPower(){
        String power = "Power: 285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm";
    }

    @Override
    public void buildEngine() {
        // TODO: implement
        String engine = "engine";
    }

    @Override
    public void buildBreaks() {
        String breaks = "breaks";
        // TODO: implement
    }

    @Override
    public void buildSeats() {
        String seats = "seats";
        // TODO: implement
    }

    @Override
    public void buildWindows() {
        String windows = "windows";
        // TODO: implement
    }

    @Override
    public void buildFuelType() {
        String fuelType = "fuelType";
        // TODO: implement
    }

    @Override
    public Car getCar(){
        CarBuilder sedan = new SedanCarBuilder();
        sedan.buildBodyStyle();
        sedan.buildPower();
        sedan.buildEngine();
        sedan.buildBreaks();
        sedan.buildSeats();
        sedan.buildWindows();
        sedan.buildFuelType();
        return null;
    }
}