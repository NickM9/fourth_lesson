package by.epam.agregation_and_composition.fourth;

/*
Туристические путёвки. Сформировать набор предложений клиенту по выбору туристической путёвки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т.д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путёвок.

 */

import by.epam.agregation_and_composition.fourth.entity.TravelAgent;
import by.epam.agregation_and_composition.fourth.entity.Voucher;
import by.epam.agregation_and_composition.fourth.enums.*;
import by.epam.agregation_and_composition.fourth.logic.TravelAgentLogic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Voucher> vouchers = new ArrayList<Voucher>();
        vouchers.add(new Voucher(TourType.EXCURSION, Transport.TRAIN, Food.FULL, 7));
        vouchers.add(new Voucher(TourType.RELAX, Transport.AIRPLANE, Food.BREAKFAST, 10));
        vouchers.add(new Voucher(TourType.SHOPPING, Transport.CAR, Food.ALL_INCLUSIVE, 5));
        vouchers.add(new Voucher(TourType.SHOPPING, Transport.AIRPLANE, Food.ALL_INCLUSIVE , 12));
        vouchers.add(new Voucher(TourType.SHOPPING, Transport.SHIP, Food.NO_FOOD, 31));
        vouchers.add(new Voucher(TourType.TREATMENT, Transport.TRAIN, Food.BREAKFAST_AND_DINNER, 21));

        TravelAgent travelAgent = new TravelAgent("TEZ", vouchers);
        TravelAgentLogic travelAgentLogic = new TravelAgentLogic();

        System.out.println("Выбираем туры для шопинга : ");
        printVouchers(travelAgentLogic.giveVouchersByTourType(travelAgent, TourType.SHOPPING));
        System.out.println("Туры на карабле: ");
        printVouchers(travelAgentLogic.giveVouchersByTransport(travelAgent, Transport.SHIP));
        System.out.println("Туры на 21 день : ");
        printVouchers(travelAgentLogic.giveVouchersByNumberOfDays(travelAgent, 21));
        System.out.println("Туры всё включено : ");
        printVouchers(travelAgentLogic.giveVouchersByFood(travelAgent, Food.ALL_INCLUSIVE));



        System.out.println("Сортировка туров по количеству дней:");
        travelAgentLogic.sortVoucherByDays(travelAgent);
        printVouchers(travelAgent.getVouchers());

    }

    private static void printVouchers(List<Voucher> vouchers){
        for (Voucher v : vouchers){
            printVoucher(v);
        }

        System.out.println("#######################################");
    }

    private static void printVoucher(Voucher voucher){
        StringBuffer sb = new StringBuffer("Tour : \n");
        sb.append("Type : "); sb.append(voucher.getTourType()); sb.append("\n");
        sb.append("Transport : "); sb.append(voucher.getTransport()); sb.append("\n");
        sb.append("Food : "); sb.append(voucher.getFood()); sb.append("\n");
        sb.append("Number of days : "); sb.append(voucher.getNumberOfDays()); sb.append("\n");

        System.out.println(sb.toString());
    }

}
