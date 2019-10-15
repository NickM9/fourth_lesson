package by.epam.agregation_and_composition.first.entity;

import java.util.Arrays;

public class State {

    private String name;
    private int area;
    private int population;
    private Region[] regions;

    public State(String name, Region[] regions) {
        this.name = name;

        int areaSum = 0;
        for (int i = 0; i < regions.length; i++){
            areaSum += regions[i].getArea();
        }
        this.area = areaSum;

        int populationSum = 0;
        for (int i = 0; i < regions.length; i++){
            populationSum += regions[i].getPopulation();
        }
        this.population = populationSum;

        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", regions=" + Arrays.toString(regions) +
                '}';
    }
}
