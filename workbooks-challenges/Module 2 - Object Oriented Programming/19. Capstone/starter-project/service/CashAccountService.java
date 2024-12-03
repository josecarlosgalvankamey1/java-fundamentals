package service;

import java.math.BigDecimal;

import pojo.CashAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService {
    TradeAccountRepository tradeAccountRepository;

    public CashAccountService(TradeAccountRepository tradeAccountRepository) {
        this.tradeAccountRepository = tradeAccountRepository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount account = (CashAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().add(amount));
        tradeAccountRepository.updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount account = (CashAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().subtract(amount));
        tradeAccountRepository.updateTradeAccount(account);
    }

    public void createTradeAccount(TradeAccount tradeAccount) {
        this.tradeAccountRepository.createTradeAccount(tradeAccount);
    }

    public CashAccount retrieveTradeAccount(String id) {
        return (CashAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(TradeAccount newTradeAccount) {
        this.tradeAccountRepository.updateTradeAccount(newTradeAccount);
    }

    public void deleteTradeAccount(String id) {
        this.tradeAccountRepository.deleteTradeAccount(id);
    }

}
