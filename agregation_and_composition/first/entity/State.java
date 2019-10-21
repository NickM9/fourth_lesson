package by.epam.agregation_and_composition.first.entity;

import java.util.Objects;
import java.util.Set;

public class State {

    private String name;
    private Set<Region> regions;

    public State(String name, Set<Region> regions) {
        this.name = name;
        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Region> getRegions() {
        return regions;
    }

    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(name, state.name) &&
                Objects.equals(regions, state.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regions);
    }
}
