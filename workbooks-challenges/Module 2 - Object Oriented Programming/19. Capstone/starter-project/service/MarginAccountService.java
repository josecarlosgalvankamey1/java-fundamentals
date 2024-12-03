package service;

import java.math.BigDecimal;

import pojo.MarginAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {
    TradeAccountRepository tradeAccountRepository;

    public MarginAccountService(TradeAccountRepository tradeAccountRepository) {
        this.tradeAccountRepository = tradeAccountRepository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        MarginAccount account = (MarginAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
        account.setMargin(account.getMargin().add(amount));
        tradeAccountRepository.updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount account = (MarginAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
        account.setMargin(account.getMargin().subtract(amount));
        tradeAccountRepository.updateTradeAccount(account);
    }

    public void createTradeAccount(TradeAccount tradeAccount) {
        this.tradeAccountRepository.createTradeAccount(tradeAccount);
    }

    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(TradeAccount newTradeAccount) {
        this.tradeAccountRepository.updateTradeAccount(newTradeAccount);
    }

    public void deleteTradeAccount(String id) {
        this.tradeAccountRepository.deleteTradeAccount(id);
    }

}