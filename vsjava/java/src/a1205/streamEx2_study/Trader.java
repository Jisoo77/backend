package a1205.streamEx2_study;

public class Trader {
    private String name;
    private String city;
    
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader [name=" + name + ", city=" + city + "]";
    }

}
