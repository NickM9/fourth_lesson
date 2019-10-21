package by.epam.agregation_and_composition.first;

import by.epam.agregation_and_composition.first.entity.*;
import by.epam.agregation_and_composition.first.logic.*;

import java.util.HashSet;
import java.util.Set;

/*
Создать объект типа Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Main {
    public static void main(String[] args) {

        // Первый район
        City rechitsa = new City("Rechitsa", 65432, 45, false, false);
        City baranovichi = new City("Baranovichi", 64552, 67, false, false);

        Set<City> districtBaranovichski = new HashSet<City>();
        districtBaranovichski.add(baranovichi);
        districtBaranovichski.add(rechitsa);

        District baranovichski = new District("Baranovichskiy", districtBaranovichski);

        // Второй район
        City brest = new City("Brest", 350616, 146, false, true);
        City borisov = new City("Borisov", 143051, 46, false, false);

        Set<City> districtBrestskiy = new HashSet<City>();
        districtBrestskiy.add(brest);
        districtBrestskiy.add(borisov);

        District brestskiy = new District("Brestsiy", districtBrestskiy);


        // Третий район
        City orsha = new City("Orsha", 115052, 33, false, false);
        City polotsk = new City("Polotsk", 84597, 40, false, false);

        Set<City> districtKobrinsky = new HashSet<City>();
        districtKobrinsky.add(orsha);
        districtKobrinsky.add(polotsk);

        District kobrinsky = new District("Kobrinsky", districtKobrinsky);

        // Четвёртый район
        City minsk = new City("Minsk", 1992685, 348, true, true);

        Set<City> districtMinskiy = new HashSet<City>();
        districtMinskiy.add(minsk);

        District minsky = new District("Minsky", districtMinskiy);


        // Первая область
        Set<District> regionMinsky = new HashSet<District>();
        regionMinsky.add(minsky);
        regionMinsky.add(baranovichski);

        Region minskaya = new Region("Minskaya", regionMinsky);

        // Вторая область
        Set<District> regionBrestskiy = new HashSet<District>();
        regionBrestskiy.add(brestskiy);
        regionBrestskiy.add(kobrinsky);
        Region gomelskaya = new Region("Gomelskaya", regionBrestskiy);

        // Страна
        Set<Region> belarusian = new HashSet<Region>();
        belarusian.add(minskaya);
        belarusian.add(gomelskaya);

        State belarus = new State("Belarus", belarusian);

        // Начало логики

        StateLogic stateLogic = new StateLogic();

        System.out.println("Столица страны " + belarus.getName());
        System.out.println(stateLogic.giveCapital(belarus).getName());

        System.out.println("\nКоличество областей страны " + belarus.getName());
        System.out.println(stateLogic.giveCountOfRegions(belarus));

        System.out.println("\nПлощадь страны " + belarus.getName());
        System.out.println(stateLogic.giveStateArea(belarus));

        System.out.println("Список областных центров страны : " + belarus.getName());
        Set<City> regionalCentres = stateLogic.giveRegionalCenters(belarus);

        for (City city : regionalCentres) {
            System.out.println(city.getName());
        }

    }
}
