package web.model;

import java.util.Objects;

public class Car {
    private int series;
    private String model;
    private int old;


    public Car(int series, String model, int old) {
        this.series = series;
        this.model = model;
        this.old = old;
    }

    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getOld() {
        return old;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && old == car.old && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, model, old);
    }
}
