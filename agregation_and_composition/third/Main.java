package by.epam.agregation_and_composition.third;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычитание суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.
 */

import by.epam.agregation_and_composition.third.entity.Account;
import by.epam.agregation_and_composition.third.entity.Client;
import by.epam.agregation_and_composition.third.logic.ClientLogic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Аккаунты
        Account account1 = new Account(1033, 45);
        Account account2  = new Account(1004, -30);
        Account account3  = new Account(1051, 125);
        Account account4 = new Account(1015, 80);
        Account account5 = new Account(1012, -10);

        ArrayList<Account> bobList = new ArrayList<>();
        bobList.add(account1);
        bobList.add(account2);
        bobList.add(account3);
        bobList.add(account4);
        bobList.add(account5);

        Client bob = new Client("Bob", bobList);


        // Начало логики

        ClientLogic clientLogic = new ClientLogic();

        System.out.println("Поиск по номеру счёта");
        printAccount(clientLogic.getAccount(bob, 1004));
        System.out.println("################################\n");

        System.out.println("Сортировка счетов по номерам");
        clientLogic.sortById(bob);
        for (Account account : bob.getAccounts()){
            printAccount(account);
        }
        System.out.println("################################\n");

        System.out.println("Общая сумма счетов клиента " + bob.getClientName());
        System.out.println(clientLogic.getSum(bob));
        System.out.println("################################\n");

        System.out.println("Положительная сумма счетов клиента " + bob.getClientName());
        System.out.println(clientLogic.getPositiveSum(bob));
        System.out.println("################################\n");

        System.out.println("Отрицательная сумма счетов клиента " + bob.getClientName());
        System.out.println(clientLogic.getNegativeSum(bob));
        System.out.println("################################\n");

    }

    private static void printAccount(Account account){
        StringBuffer sb = new StringBuffer("Аккаунт :\n");
        sb.append("id - "); sb.append(account.getId()); sb.append("\n");
        sb.append("Сумма счёта - "); sb.append(account.getBalance()); sb.append("\n");
        sb.append("Статус блокировки - "); sb.append(account.isBlock()); sb.append("\n");
        System.out.println(sb.toString());
    }
}
