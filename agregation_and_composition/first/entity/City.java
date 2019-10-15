package by.epam.agregation_and_composition.first.entity;

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
        final StringBuffer sb = new StringBuffer("\nГород : ");
        sb.append(name); sb.append("\n");
        sb.append("Население - "); sb.append(population); sb.append("\n");
        sb.append("Площадь - "); sb.append(area); sb.append("кв.км"); sb.append("\n");
        sb.append("Является региональным центром - "); sb.append(isRegionalCenter); sb.append("\n");
        sb.append("Является столицей - "); sb.append(isCapital); sb.append("\n");
        return sb.toString();
    }
}
