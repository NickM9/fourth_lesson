package by.epam.agregation_and_composition.third.logic;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычитание суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.
 */

import by.epam.agregation_and_composition.third.entity.*;

import java.util.Collections;

public class ClientLogic {

    public Account getAccount(Client client, int id){
        for (Account account : client.getAccounts()){
            if (account.getId() == id){
                return account;
            }
        }
        return null;
    }

    public void sortById(Client client){
        Collections.sort(client.getAccounts(),  new ClientComparator());
    }

    public int getSum(Client client){
        int sum = 0;

        for (Account account : client.getAccounts()){
            sum += account.getBalance();
        }

        return sum;
    }

    public int getPositiveSum(Client client){
        int sum = 0;

        for (Account account : client.getAccounts()){
            if (account.getBalance() > 0){
                sum += account.getBalance();
            }
        }

        return sum;
    }

    public int getNegativeSum(Client client){
        int sum = 0;

        for (Account account : client.getAccounts()){
            if (account.getBalance() < 0){
                sum += account.getBalance();
            }
        }

        return sum;
    }
}
