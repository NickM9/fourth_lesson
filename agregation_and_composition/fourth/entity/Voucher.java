package by.epam.agregation_and_composition.fourth.entity;

import by.epam.agregation_and_composition.fourth.enums.*;

import java.util.Objects;

public class Voucher implements Comparable <Voucher>{

    private TourType tourType;
    private Transport transport;
    private Food food;
    private int numberOfDays;

    public Voucher(TourType tourType, Transport transport, Food food, int numberOfDays) {
        this.tourType = tourType;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
    }

    public Voucher(){
        this(TourType.NO_TOUR, Transport.NO_TRANSPORT, Food.NO_FOOD, 0);
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "tourType=" + tourType +
                ", transport=" + transport +
                ", food=" + food +
                ", numberOfDays=" + numberOfDays +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return numberOfDays == voucher.numberOfDays &&
                tourType == voucher.tourType &&
                transport == voucher.transport &&
                food == voucher.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tourType, transport, food, numberOfDays);
    }

    @Override
    public int compareTo(Voucher voucher){
        return this.numberOfDays - voucher.numberOfDays;
    }
}
