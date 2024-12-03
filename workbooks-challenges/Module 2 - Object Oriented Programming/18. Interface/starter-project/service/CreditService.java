package service;

import java.math.BigDecimal;

import pojo.Credit;
import repository.AccountRepository;

public class CreditService implements AccountService {

    AccountRepository accountRepository;

    public CreditService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(Credit account) {
        this.accountRepository.createAccount(account.clone());
    }

    public Credit retrieveAccount(String id) {
        return (Credit) this.accountRepository.retrieveAccount(id).clone();
    }

    public void updateAccount(Credit account) {
        this.accountRepository.updateAccount(account);
    }

    public void deleteAccount(String id) {
        this.accountRepository.deleteAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal ammount) {
        Credit account = retrieveAccount(id);
        account.setCredit(account.getCredit().subtract(ammount));
        updateAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal ammount) {
        Credit account = retrieveAccount(id);
        account.setCredit(account.getCredit().add(ammount));
        updateAccount(account);
    }
}
