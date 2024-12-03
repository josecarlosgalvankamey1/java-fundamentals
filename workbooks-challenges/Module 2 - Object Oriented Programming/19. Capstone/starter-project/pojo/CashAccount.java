package pojo;

import java.math.BigDecimal;

public class CashAccount extends TradeAccount {

    private BigDecimal cashBalance;

    public CashAccount(String id, BigDecimal cashBalalance) {
        super(id);
        this.cashBalance = cashBalalance;
    }

    public BigDecimal getCashBalance() {
        return this.cashBalance;
    }

    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    @Override
    public CashAccount clone() {
        return new CashAccount(super.getId(), this.getCashBalance());
    }
}
