package by.epam.agregation_and_composition.first.logic;

/*
Создать объект типа Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import by.epam.agregation_and_composition.first.entity.*;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {

    public String giveCapital(State state){
        for (int i = 0; i < state.getRegions().length; i++){
            for (int j = 0; j < state.getRegions()[i].getDistricts().length; j++){
                for (int x = 0; x < state.getRegions()[i].getDistricts()[j].getCities().length; x++){
                    if (state.getRegions()[i].getDistricts()[j].getCities()[x].isCapital()){
                        return state.getRegions()[i].getDistricts()[j].getCities()[x].toString();
                    }
                }
            }
        }
        return null;
    }

    public int giveCountOfRegions(State state){
        return state.getRegions().length;
    }

    public int giveStateArea(State state){
        int sum = 0;
        for (int i = 0; i < state.getRegions().length; i++) {
            sum += state.getRegions()[i].getArea();
        }
        return sum;
    }

    public ArrayList<City> giveRegionalCenters(State state){
        Region[] regions = state.getRegions();
        ArrayList <City> regionsCentres = new ArrayList<City>();

        for (int i = 0; i < regions.length; i++){
            for (int j = 0; j < regions[i].getDistricts().length; j++){
                for (int x = 0; x < regions[i].getDistricts()[j].getCities().length; x++){
                    if (regions[i].getDistricts()[j].getCities()[x].isRegionalCenter()){
                        City city = regions[i].getDistricts()[j].getCities()[x];
                        regionsCentres.add(city);
                    }
                }
            }
        }

        return regionsCentres;
    }

}
