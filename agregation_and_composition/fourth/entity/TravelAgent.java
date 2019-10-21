package by.epam.agregation_and_composition.fourth.entity;

import java.util.List;
import java.util.Objects;

public class TravelAgent {

    private String name;
    private List<Voucher> vouchers;

    public TravelAgent(String name, List<Voucher> vouchers) {
        this.name = name;
        this.vouchers = vouchers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    @Override
    public String toString() {
        return "TravelAgent{" +
                "name='" + name + '\'' +
                ", vouchers=" + vouchers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelAgent that = (TravelAgent) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(vouchers, that.vouchers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vouchers);
    }
}
