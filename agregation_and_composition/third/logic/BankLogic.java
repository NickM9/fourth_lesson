package by.epam.agregation_and_composition.third.logic;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычитание суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.
 */

import by.epam.agregation_and_composition.third.entity.*;

import java.util.Collections;

public class BankLogic {

    public Account getAccount(Bank bank, int id){
        for (int i = 0; i < bank.getClients().size(); i++){
             for (int j = 0; j < bank.getClients().get(i).getAccounts().size(); j++){
                 if (bank.getClients().get(i).getAccounts().get(j).getId() == id){
                     return bank.getClients().get(i).getAccounts().get(j);
                 }
             }
        }
        return null;
    }

    public Bank sortById(Bank bank){

        for (int i = 0; i < bank.getClients().size(); i++){

            Collections.sort(bank.getClients().get(i).getAccounts(),  new IdComparator());

        }
        return bank;
    }

    public int getSum(Bank bank, Client client){
        int sum = 0;
        for (int i = 0; i < bank.getClients().size(); i++){
            if (bank.getClients().get(i).getClientName().equals(client.getClientName())){

                for (int j = 0; j < bank.getClients().get(i).getAccounts().size(); j++){

                    sum += bank.getClients().get(i).getAccounts().get(j).getBalance();

                }
            }
        }

        return sum;
    }

    public int getPositiveSum(Bank bank, Client client){
        int sum = 0;
        for (int i = 0; i < bank.getClients().size(); i++){
            if (bank.getClients().get(i).getClientName().equals(client.getClientName())){

                for (int j = 0; j < bank.getClients().get(i).getAccounts().size(); j++){

                    if (bank.getClients().get(i).getAccounts().get(j).getBalance() > 0){
                        sum += bank.getClients().get(i).getAccounts().get(j).getBalance();
                    }

                }
            }
        }

        return sum;
    }

    public int getNegativeSum(Bank bank, Client client){
        int sum = 0;
        for (int i = 0; i < bank.getClients().size(); i++){
            if (bank.getClients().get(i).getClientName().equals(client.getClientName())){

                for (int j = 0; j < bank.getClients().get(i).getAccounts().size(); j++){

                    if (bank.getClients().get(i).getAccounts().get(j).getBalance() < 0){
                        sum += bank.getClients().get(i).getAccounts().get(j).getBalance();
                    }

                }
            }
        }

        return sum;
    }


}
