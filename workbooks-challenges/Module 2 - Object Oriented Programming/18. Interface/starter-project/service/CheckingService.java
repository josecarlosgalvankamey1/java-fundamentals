package service;

import java.math.BigDecimal;

import pojo.Checking;
import repository.AccountRepository;

public class CheckingService implements AccountService {

    AccountRepository accountRepository;

    public CheckingService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(Checking account) {
        this.accountRepository.createAccount(account.clone());
    }

    public Checking retrieveAccount(String id) {
        return (Checking) this.accountRepository.retrieveAccount(id).clone();
    }

    public void updateAccount(Checking account) {
        this.accountRepository.updateAccount(account);
    }

    public void deleteAccount(String id) {
        this.accountRepository.deleteAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal ammount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().add(ammount));
        updateAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal ammount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().subtract(ammount));
        updateAccount(account);
    }
}
