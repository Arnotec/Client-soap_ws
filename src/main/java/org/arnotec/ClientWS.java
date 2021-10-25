package org.arnotec;

import org.arnotec.stub.Account;
import org.arnotec.stub.BankWS;
import org.arnotec.stub.BankWSService;

import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        BankWS stubWS = new BankWSService().getBankWSPort();
        double result = stubWS.conversionEuroToFCFA(139);
        System.out.println(result + " FCFA");
        System.out.println("************");
        Account ac = stubWS.getAccount(4L);
        System.out.println("Code: " + ac.getCode());
        System.out.println("Solde: " + ac.getSolde());
        System.out.println("************");
        List<Account> accounts = stubWS.listAccount();
        accounts.forEach(account -> {
            System.out.println("Code: " + account.getCode());
            System.out.println("Solde: " + account.getSolde());
            System.out.println("----");
        });
    }
}
