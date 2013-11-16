
package Model;

public class Money {
    Number ammount;
    Currency currency;

    public Money(Number ammount, Currency currency) {
        this.ammount = ammount;
        this.currency = currency;
    }

    public Number getAmmount() {
        return ammount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
