package by.epam.agregation_and_composition.third.logic;

import by.epam.agregation_and_composition.third.entity.Account;

import java.util.Comparator;

public class IdComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getId() - o2.getId();
    }

}
