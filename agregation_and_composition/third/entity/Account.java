package by.epam.agregation_and_composition.third.entity;

public class Account {

    private int id;
    private double balance;
    private boolean isBlock;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.isBlock = (balance < 0) ? true : false;
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
        isBlock = (balance < 0) ? true : false;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Счет");
        sb.append("\n");

        sb.append("id = "); sb.append(id); sb.append("\n");
        sb.append("Баланс = "); sb.append(balance); sb.append("\n");
        sb.append("Статус блокировки - "); sb.append(isBlock); sb.append("\n");

        return sb.toString();
    }
}
