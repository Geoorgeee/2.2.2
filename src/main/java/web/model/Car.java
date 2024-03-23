package web.model;

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

}
