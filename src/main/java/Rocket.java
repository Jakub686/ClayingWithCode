public class Rocket {
    private String name;
    private String launches;

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                ", launches='" + launches + '\'' +
                '}';
    }

    public Rocket(String name, String launches) {
        this.name = name;
        this.launches = launches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLaunches() {
        return launches;
    }

    public void setLaunches(String launches) {
        this.launches = launches;
    }
}
