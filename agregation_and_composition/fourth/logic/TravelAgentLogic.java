package by.epam.agregation_and_composition.fourth.logic;

import by.epam.agregation_and_composition.fourth.entity.*;
import by.epam.agregation_and_composition.fourth.enums.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TravelAgentLogic {

    public List<Voucher> giveVouchersByTourType(TravelAgent travelAgent, TourType tourType){
        List<Voucher> res = new ArrayList<Voucher>();

        for (Voucher voucher : travelAgent.getVouchers()){
            if (voucher.getTourType() == tourType){
                res.add(voucher);
            }
        }

        return res;
    }

    public List<Voucher> giveVouchersByTransport(TravelAgent travelAgent, Transport transport) {

        List<Voucher> result = new ArrayList<>();
        for (Voucher voucher : travelAgent.getVouchers()) {
            if (voucher.getTransport() == transport) {
                result.add(voucher);
            }
        }
        return result;
    }

    public List<Voucher> giveVouchersByFood(TravelAgent travelAgent, Food food) {

        List<Voucher> result = new ArrayList<>();
        for (Voucher voucher : travelAgent.getVouchers()) {
            if (voucher.getFood() == food) {
                result.add(voucher);
            }
        }
        return result;
    }

    public List<Voucher> giveVouchersByNumberOfDays(TravelAgent travelAgent, int numberOfDays) {
        List<Voucher> result = new ArrayList<>();

        for (Voucher voucher : travelAgent.getVouchers()) {
            if (voucher.getNumberOfDays() == numberOfDays) {
                result.add(voucher);
            }
        }

        return result;
    }

    public void sortVoucherByDays(TravelAgent travelAgency) {
        Collections.sort(travelAgency.getVouchers());
    }
}
