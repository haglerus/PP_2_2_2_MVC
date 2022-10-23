package web.model;

public class Car {

    private String model;
    private String series;
    private String owner;

    public Car() {
    }

    public Car(String model, String series, String owner) {
        this.model = model;
        this.series = series;
        this.owner = owner;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
