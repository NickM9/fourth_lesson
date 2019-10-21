package by.epam.agregation_and_composition.first.entity;

import java.util.Objects;
import java.util.Set;

public class District {

    private String name;
    private Set<City> cities;

    public District(String name, Set<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(name, district.name) &&
                Objects.equals(cities, district.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cities);
    }
}
