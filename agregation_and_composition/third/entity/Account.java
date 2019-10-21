package by.epam.agregation_and_composition.third.entity;

import java.util.Objects;

public class Account {

    private int id;
    private double balance;
    private boolean block;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.block = (balance < 0) ? true : false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        block = (balance < 0) ? true : false;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        block = block;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", block=" + block +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Double.compare(account.balance, balance) == 0 &&
                block == account.block;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, block);
    }
}
