package by.epam.agregation_and_composition.first.logic;

/*
Создать объект типа Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import by.epam.agregation_and_composition.first.entity.*;
import java.util.Set;
import java.util.HashSet;

public class StateLogic {

    public City giveCapital(State state){
        for (Region region : state.getRegions()){
            for (District district : region.getDistricts()){
                for (City city : district.getCities()){
                    if (city.isCapital()){
                        return city;
                    }
                }
            }
        }
        return null;
    }

    public int giveCountOfRegions(State state){
        return state.getRegions().size();
    }

    public int giveStateArea(State state){
        int sum = 0;
        for (Region region : state.getRegions()) {
            for (District district : region.getDistricts()){
                for (City city : district.getCities()){
                    sum += city.getArea();
                }
            }
        }
        return sum;
    }

    public Set<City> giveRegionalCenters(State state){
        Set<City> regionalCentres = new HashSet<City>();

        for (Region region : state.getRegions()) {
            for (District district : region.getDistricts()){
                for (City city : district.getCities()){

                    if (city.isRegionalCenter()){
                        regionalCentres.add(city);
                    }

                }
            }
        }

        return regionalCentres;
    }

}
