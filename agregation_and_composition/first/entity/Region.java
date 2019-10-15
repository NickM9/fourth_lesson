package by.epam.agregation_and_composition.first.entity;

import java.util.Arrays;

public class Region {

    private String name;
    private int area;
    private int population;
    private District[] districts;

    public Region(String name, District[] districts) {
        this.name = name;

        int areaSum = 0;
        for (int i = 0; i < districts.length; i++){
            areaSum += districts[i].getArea();
        }
        this.area = areaSum;

        int populationSum = 0;
        for (int i = 0; i < districts.length; i++){
            populationSum += districts[i].getPopulation();
        }
        this.population = populationSum;

        this.districts = districts;
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

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", districts=" + Arrays.toString(districts) +
                '}';
    }
}
