public class Value {
    private String name;
    private Car car;
    private Rocket rocket;

    @Override
    public String toString() {
        return "Value{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", rocket=" + rocket +
                '}';
    }

    public Value(String name, Car car, Rocket rocket) {
        this.name = name;
        this.car = car;
        this.rocket = rocket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }
}
