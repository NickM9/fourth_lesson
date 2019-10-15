package by.epam.agregation_and_composition.third.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    private String name;
    private ArrayList<Client> clients;

    public Bank(String name, ArrayList<Client> clients) {
        this.name = name;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }
}
