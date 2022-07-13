package web.model;

public class Car {

    private int id;
    private String model;
    private String series;
    private int doors;

    public Car() {
    }

    public Car(int id, String model, String series, int doors) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.doors = doors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
