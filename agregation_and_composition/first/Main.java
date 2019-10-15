package by.epam.agregation_and_composition.first;

import by.epam.agregation_and_composition.first.entity.*;
import by.epam.agregation_and_composition.first.logic.*;

/*
Создать объект типа Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Main {
    public static void main(String[] args) {

        City brest = new City("Brest", 350616, 146, false, true);
        City vitebsk = new City("Vitebsk", 378459, 134, false, true);
        City gomel = new City("Gomel", 535229, 139, false, true);
        City grodno = new City("Grodno", 373547, 142, false, true);
        City minsk = new City("Minsk", 1992685, 348, true, true);
        City mogilev = new City("Mogilev", 383313, 118, false, true);
        City orsha = new City("Orsha", 115052, 33, false, false);
        City borisov = new City("Borisov", 143051, 46, false, false);
        City polotsk = new City("Polotsk", 84597, 40, false, false);
        City rechitsa = new City("Rechitsa", 65432, 45, false, false);
        City baranovichi = new City("Baranovichi", 64552, 67, false, false);

        District baranovichski = new District("Baranovichskiy", new City[]{baranovichi, rechitsa});
        District brestsiy = new District("Brestsiy", new City[]{brest, borisov});
        District kobrinsky = new District("Kobrinsky", new City[]{polotsk, orsha});
        District minsky = new District("Minsky", new City[]{minsk});
        District mogilevsky = new District("Mogilevsky", new City[]{mogilev, vitebsk});
        District gomelsky = new District("Gomelsky", new City[]{gomel, grodno});

        Region minskaya = new Region("Minskaya", new District[]{baranovichski, brestsiy, kobrinsky});
        Region gomelskaya = new Region("Gomelskaya", new District[]{minsky, mogilevsky, gomelsky});

        State belarus = new State("Belarus", new Region[]{minskaya, gomelskaya});

        StateLogic stateLogic = new StateLogic();

        System.out.println("Столица страны " + belarus.getName());
        System.out.println(stateLogic.giveCapital(belarus));

        System.out.println("Количество областей страны " + belarus.getName());
        System.out.println(stateLogic.giveCountOfRegions(belarus));

        System.out.println("Площадь страны " + belarus.getName());
        System.out.println(stateLogic.giveStateArea(belarus));

        System.out.println("Список областных центров страны : " + belarus.getName());
        System.out.println(stateLogic.giveRegionalCenters(belarus));

    }
}
