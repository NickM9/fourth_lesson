package by.epam.agregation_and_composition.third;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычитание суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.
 */

import by.epam.agregation_and_composition.third.entity.Account;
import by.epam.agregation_and_composition.third.entity.Bank;
import by.epam.agregation_and_composition.third.entity.Client;
import by.epam.agregation_and_composition.third.logic.BankLogic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(1033, 45);
        Account account2  = new Account(1004, -30);
        Account account3  = new Account(1051, 125);
        Account account4 = new Account(1015, 80);
        Account account5 = new Account(1012, -10);

        ArrayList<Account> bobList = new ArrayList<Account>();
        bobList.add(account1);
        bobList.add(account2);
        bobList.add(account3);

        ArrayList<Account> lizaList = new ArrayList<Account>();
        lizaList.add(account4);
        lizaList.add(account5);

        Client bob = new Client("Bob", bobList);
        Client liza = new Client("Liza", lizaList);

        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(bob);
        clients.add(liza);

        Bank alpha = new Bank("Alpha", clients);

        BankLogic bankLogic = new BankLogic();

        System.out.println("Поиск по номеру счёта");
        System.out.println(bankLogic.getAccount(alpha, 1004));
        System.out.println("################################\n");

        System.out.println("Сортировка счетов по номерам");
        alpha = bankLogic.sortById(alpha);
        for (int i = 0; i < alpha.getClients().size(); i++){
            System.out.println(alpha.getClients().get(i).toString());
        }
        System.out.println("################################\n");

        System.out.println("Общая сумма счетов клиента " + bob.getClientName());
        System.out.println(bankLogic.getSum(alpha, bob));
        System.out.println("################################\n");

        System.out.println("Положительная сумма счетов клиента " + bob.getClientName());
        System.out.println(bankLogic.getPositiveSum(alpha, bob));
        System.out.println("################################\n");

        System.out.println("Отрицательная сумма счетов клиента " + bob.getClientName());
        System.out.println(bankLogic.getNegativeSum(alpha, bob));
        System.out.println("################################\n");

    }
}
