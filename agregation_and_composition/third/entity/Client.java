package by.epam.agregation_and_composition.third.entity;

import java.util.ArrayList;

public class Client {

    private String clientName;
    private ArrayList<Account> accounts;

    public Client(String clientName, ArrayList<Account> accounts) {
        this.clientName = clientName;
        this.accounts = accounts;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Клиент : ");
        sb.append(clientName); sb.append("\n");

        for (int i = 0; i < accounts.size(); i++){
            sb.append(accounts.get(i).toString());
        }

        return sb.toString();
    }
}
