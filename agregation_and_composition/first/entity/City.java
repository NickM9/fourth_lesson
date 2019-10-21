package by.epam.agregation_and_composition.first.entity;

import java.util.Objects;

public class City {

    private String name;
    private int population;
    private int area;
    private boolean isCapital;
    private boolean isRegionalCenter;

    public City(String name, int population, int area, boolean isCapital, boolean isRegionalCenter) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.isCapital = isCapital;
        this.isRegionalCenter = isRegionalCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        isRegionalCenter = regionalCenter;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", isCapital=" + isCapital +
                ", isRegionalCenter=" + isRegionalCenter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return population == city.population &&
                area == city.area &&
                isCapital == city.isCapital &&
                isRegionalCenter == city.isRegionalCenter &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, area, isCapital, isRegionalCenter);
    }
}
