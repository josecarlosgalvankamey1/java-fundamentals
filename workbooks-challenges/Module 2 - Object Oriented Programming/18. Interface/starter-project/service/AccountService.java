package service;

import java.math.BigDecimal;

public interface AccountService {

    public void deposit(String id, BigDecimal ammount);

    public void withdraw(String id, BigDecimal ammount);
}