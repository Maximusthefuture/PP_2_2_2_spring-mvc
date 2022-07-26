package model;

public class Car {

    String name;
    int series;
    int year;

    public Car() { }

    public Car(String name, int series, int year) {
        this.name = name;
        this.series = series;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
